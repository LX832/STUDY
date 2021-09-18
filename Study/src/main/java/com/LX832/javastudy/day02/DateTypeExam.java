package com.LX832.javastudy.day02;

public class DateTypeExam {
	public static int k; //정적 필드 k
	public int f1 = 300;
	public String f2 = "졸려";
	public long num; //인스턴스 필드 num
	
	public void fieldPrn() {
		System.out.println(f1);
		System.out.println(f2);
	}
	public static void dataPrint(String name) {
		System.out.println("스태틱 메소드로 넘겨준 이름" + name );
		
		// 위의 필드와 메소드는 객체 생서전에 이미 메모리에 생성되어 있음(스태틱영역에)
	
		// 아래의 필드와 메소드는 인스턴스이므로 생성연산자 실행 후 메모리에 만들어진다.
	}
	public void printData(String name) {
		System.out.println("메소드로 넘겨준 이름" + name );
		k = 3000;
		
		
	}
}
