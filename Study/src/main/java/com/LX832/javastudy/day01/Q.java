package com.LX832.javastudy.day01;

import java.util.Scanner;

public class Q {
	static String hobby = "피아노";
	public static void main(String[] args) {
		prnMtd("나의 이름은");
		//이름을 입력 받아서
		//이름과 취미를 출력하는 프로그램을 작성하시오
		String aaa = nameInput();
		String lastPrnDate = "나의 이름은" + aaa + "이고, 나의 취미는" + hobby + "입니다"; 
		prnMtd(lastPrnDate);
		  
	}
	public static String nameInput() {
	 	Scanner nameinput = new Scanner(System.in);
	 	String nameData = nameinput.nextLine();
		return nameData;
	}

	public static void prnMtd(String data) { //함수명도 소문자로 시작
	System.out.println(data);
	}
}
