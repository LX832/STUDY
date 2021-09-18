package com.LX832.javastudy.day02;

import java.util.Scanner;

public class SungjukDatainput { //오직 성적 자료를 입력받을 목적으로 만들어진 클래스
	String subjectName[] = {"국어","영어","수학"};
	//키보드로부터 필요한 자료를 입력 받아서 StudentData타입의 자료로 만들어서 반환한다.
	public void inputData(StudentData sData) {
		
		sData.stNO = realInput("학번");
		sData.iname = realInput("이름");
		
		
		for(int i = 0; i < sData.subject.length; i = i + 1) {
		sData.subject[i] = Integer.parseInt( realInput(subjectName[i]) );
		}
		
	}
	
	private String realInput(String message) {
		Scanner scan = new Scanner(System.in); 
		System.out.println(message + "을(를) 입력하세요");
		return scan.next();

	}

}
