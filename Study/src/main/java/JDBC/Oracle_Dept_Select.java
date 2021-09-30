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
 * 소스 작성일자: 2021년 9월 30일 오후 3시42분
 * 컴파일 일자: 2021년 9월 30일
 * 소스 작성자: 현대빈
 * use DB: 오라클 11g Express Edition
 * 
 * Departments 테이블의 데이터를 삭제하는 프로그램을 작성
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//select program coding
public class Oracle_Dept_Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connect;//연결 역할을 하는 클래스
		PreparedStatement pstmt = null;//명령 실행
		ResultSet rs = null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); 		
		connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); 
		
		try {
		String sql = "select * from Departments";
			
		pstmt = connect.prepareStatement(sql);
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