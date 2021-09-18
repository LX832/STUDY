package com.LX832.javastudy.day01;

public class CallerClass {
	
	static int k = 20;
	
	public static void main(String[] args) { 
		// 일할 클레스를 불러오는 작업 => 메모리상의 일할 클래스를 생상하는 작업
		WorkerClass 네네네 = new WorkerClass();
		// new => 객체 생성 연산자 => 생성된 자료(객체)의 메모리 상의 위치(주소) 변환 연산자
		int 내보관상자 = 네네네.addMethod(2000, 150);
		int 아무거나 = 네네네.subtract(2530, 777);
		int 곱하기 = 네네네.multiply(230, 77);
		System.out.println("2000 + 150의 결과는 바로바로" + 내보관상자);
		System.out.println("2530 - 777의 결과는 바로바로" + 아무거나);
		System.out.println("230 * 77의 결과는 바로바로" + 곱하기);
	}
}
