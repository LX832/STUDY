package com.LX832.javastudy.day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class Dgadg {

	private static String ino;
	private static int stu_no;
	private static String stu_name;
	private static String stu_dept;	
	private static int stu_grade;
	private static String stu_class;
	private static String stu_gender;	
	private static int stu_height;
	private static int stu_weight;

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.OracleDriver"; 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "LX832";
		String pw = "dlwhdud1";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 연결이 성공했습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 연결에 실패했습니다.");
		}
		try {
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("사용자 인증을 성공적으로 완료했습니다.");
		} catch (SQLException e) {
			System.out.println("사용자 인증을 실패했습니다.");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("----학생 정보 시스템 테이블 수정----");
		System.out.println("학생정보를 입력하세요.");
		try {
			ino = br.readLine();
		} catch (IOException e1) {
			System.out.println("이름을 입력하는데 문제가 발생했습니다.");			
		}
			stu_no = Integer.parseInt(ino);
		
		System.out.println("이름을 입력하세요.");
		try {
			stu_dept = br.readLine();
		} catch (IOException e1) {
			System.out.println("이름을 입력하는데 문제가 발생했습니다.");
		}
		System.out.println("학년을 입력하세요.");
		try {
			ino = br.readLine();
		} catch (IOException e1) {
			System.out.println("학년을 입력하는데 문제가 발생했습니다.");
		}
			stu_grade = Integer.parseInt(ino);
		System.out.println("반을 입력하세요");
		try {
			stu_class = br.readLine();
		} catch (IOException e1) {
			System.out.println("반을 입력하는데 문제가 발생했습니다.");
		}
		System.out.println("성별을 입력하세요");
		try {
			stu_gender = br.readLine();
		} catch (IOException e1) {
			System.out.println("성별을 입력하는데 문제가 발생했습니다.");
		}
		System.out.println("키를 입력하세요");
		try {
			ino = br.readLine();
		} catch (IOException e1) {
			System.out.println("키를 입력하는데 문제가 발생했습니다.");
		}
			stu_height = Integer.parseInt(ino);
		System.out.println("몸무게를 입력하세요");
		try {
			ino = br.readLine();
		} catch (IOException e1) {
			System.out.println("몸무게를 입력하는데 문제가 발생했습니다.");
		}
		stu_weight = Integer.parseInt(ino);
		
		String sql = "insert into student(stu_no, stu_name, stu_dept, stu_grade, stu_class, stu_gender, stu_height, stu_weigth)"
				+"values(?,?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, stu_no);
			pstmt.setString(2, stu_name);
			pstmt.setString(3, stu_name);
			pstmt.setString(4, stu_name);
			pstmt.setString(5, stu_name);
			pstmt.setString(6, stu_name);
			pstmt.setString(7, stu_name);
			pstmt.setString(8, stu_name);
		}

	}

}
