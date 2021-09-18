package com.LX832.javastudy.day05;

import java.util.Scanner;

public class Exam {
	
	public void test01() {
		
		
		
		StringBuffer sb; //참조타입 => 
		Scanner scan ; //참조타입 => 스캐너 자료를 저장할 수 있는 상자
		
		double inData;
		
		//참조타입에 자료는 반드시 new에 의해서 만들어지며 heap영역에 만들어진다.
		//배열과 문자열은 자주 사용되기 때문에 마치 기본타입처럼 new를 생략해서 만들 수 있다.
		
		int k = 20; //기본타입의 변수이므로 숫자 하나(20)을 저장할 수 있다. 곧바로 사용이 가능하다.
		int j = 50; 
		String ii = "hhhhhhhhhh";
		int[] kArr = new int[5];
		kArr[0] = 50; kArr[1] = 50; kArr[2] = 50; kArr[3] = 50; kArr[4] = 50;
		//kArr={50,50,50,50,50};
		
		sb = new StringBuffer();
		sb.append("홍길동그만");
		scan = new Scanner(System.in);
		inData = scan.nextDouble();
		
		System.out.println(k*j);
		
	}

	public void test02() {
		short a = (short)20; 
		//20정수형 숫자 => int타입(4byte)에 해당된다.
		//short =>2바이트 크기의 정수형 => 2바이트 크기의 자료만 저장 가능
		//컴파일러는 2바이트 숫자의 범위 안에 자료를 자동 변환한다.
		short k = (short)(a + 20); //a+ 20의 결과는 40
		//short m = a + (short)20;
		short l = 40;
		//데이터의 타입은 메모리상에 저장된 자료를 해석하는 방법이다.
		
	}
}
