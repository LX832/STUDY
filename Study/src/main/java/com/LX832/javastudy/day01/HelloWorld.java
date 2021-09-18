package com.LX832.javastudy.day01;

import java.util.Scanner;

public class HelloWorld { //클래스이름 => 첫 글자는 반드시 대문자로 작성한다. 
	
	static String	 iname = "오오오오옹"; //iname 변수가 메서드 밖에 있다. => 필드(속성, 맴버변수, 인스턴스 변수)
	int age = 20; //인스턴스필드
	public static void main(String[] args) {
		prnMtd("Hello World!");
		prnMtd("나의 이름은 ?");
		prnMtd("이름을 입력해주세요");
		String inputDate = inDate();
		prnMtd(inputDate);
		//심부름꾼제목(5000)
		
//		Hellow World hw = new HelloWorld(); //생성작업
//		System.out.println(age);
//		System.out.println(iname);
	}
	
	public static void prnMtd(String data) { //함수명도 소문자로 시작
		System.out.println(data);
	}
	
	public static String inDate() {
		Scanner scan = new Scanner(System.in); //입력장치를 지정해서 입력받을 준비를 한다.
		return scan.nextLine();
	}
/*	
	public 담배 심부름꾼제목(money data) {
		//돈을 들고 편의점으로 가서 담배사서  
		return 구입한 담배
	}

*/
}

//console => 본체에 직접 연결된 표준 입출력 장치(키보드와 모니터를 의미)=>모니터의 의미

// 하나의 함수는(메소드)는 오직 하나의 책임만 진다. => 단일 책임 원칙 