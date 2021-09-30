package JDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/* OOO 프로젝트
 * 소스 작성일자: 2021년 9월 30일 오전 11시 23분
 * 컴파일 일자: 2021년 9월 30일
 * 소스 작성자: 현대빈
 * use DB: 오라클 11g Express Edition
 * 
 * Departments 테이블의 데이터를 입력하는 프로그램을 작성
 * 
 */
public class Oracle_Dept_Insert {
	
	private static String ino;
	private static int Department_ID;
	private static String Department_NAME;
	private static int Manager_ID;
	private static int LOCATION_ID;  
	
	public static void main(String[] args) throws SQLException {
		
		Connection connect = null;// 
		PreparedStatement pstmt = null;// 
		ResultSet rs = null;// 

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 연결에 성공하였습니다.!!!");
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			System.out.println("드라이버 연결에 실패하였습니다.!!!");
		}

		try {
			connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("사용자 인증을 성공적으로 연결하였습니다.");
		} catch (SQLException e) {
			// e.printStackTrace();
			System.out.println("사용자 인증을 실패 하였습니다.");
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("********** 부서 정보 입력 **********");
		
		System.out.println("부서ID를 입력하세요.");		
		try {
			ino = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("부서ID를 입력하는데 문제가 발생하였습니다.");
		}		
		Department_ID = Integer.parseInt(ino); // 학번 입력
		
		
		System.out.println("부서명을 입력하세요.");		
		try {
			Department_NAME = br.readLine(); // 이름 입력
		} catch (IOException e1) {
			System.out.println("부서명을 입력하는데 문제가 발생하였습니다.");
		}
		
		System.out.println("매니저ID를 입력하세요.");		
		try {
			ino = br.readLine(); // 반  입력
		} catch (IOException e1) {
			System.out.println("매니저ID를 입력하는데 문제가 발생하였습니다.");
		}
		Manager_ID = Integer.parseInt(ino);
		
		System.out.println("회사위치를 입력하세요.");		
		try {
			ino = br.readLine(); // 반  입력
		} catch (IOException e1) {
			System.out.println("회사위치를 입력하는데 문제가 발생하였습니다.");
		}
		LOCATION_ID = Integer.parseInt(ino); 
		
		String sql = "insert into Departments(Department_ID, Department_NAME, Manager_ID, LOCATION_ID)"
					+ "values(?, ?, ?, ?)";
		
		try {
			pstmt = connect.prepareStatement(sql);
			
			pstmt.setInt(1, Department_ID);
			pstmt.setString(2, Department_NAME);			
			pstmt.setInt(3, Manager_ID);			
			pstmt.setInt(4, LOCATION_ID);
						
			pstmt.executeUpdate();// insert, delete, update 공용으로 사용합니다.
			System.out.println("데이터를 성공적으로 입력 하였습니다.");
		} catch (SQLException e) {
			 e.printStackTrace();
			System.out.println("데이터를 입력하는데 실패 하였습니다.");
		}
			
		try {
			String sql2 = "select * from Departments";
				
			pstmt = connect.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			
			System.out.println("-------------부서정보 시스템 조회-----------------------");
			System.out.println("부서ID" + "\t" + "부서명" + "\t\t\t" + "관리자ID" + "\t" + "지역ID");
			System.out.println("---------------------------------------------------");
			
			while(rs.next()) {
				int D_id = rs.getInt("Department_ID");
				String D_name = rs.getString("Department_NAME");
				int M_id = rs.getInt("Manager_ID");
				int L_id = rs.getInt("Location_ID");
				
				System.out.println(D_id + "\t" + D_name + "\t\t" + M_id + "\t" + L_id);
				
			}
			System.out.println("---------------------------------------------------------------------------");
			}catch(Exception e) {
				System.out.println("돌발상황이 발생하였습니더. 확인하시고 조치바랍니다.");	 		
			}finally {
				if (rs != null) {	rs.close();	}
				if (pstmt != null) { pstmt.close();	}
				if (connect != null) {	connect.close();	}				
			}

	}

}