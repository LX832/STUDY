package com.LX832.javastudy.day02;

public class DataTypeTest {
	
	public static void main(String[] args) { //main은 stack의 방 밤색는 상자
		System.out.println("===객체 생성전===");
		DateTypeExam.k = 200;
		DateTypeExam.dataPrint("JYL");
		
		//DateTypeExam.num = 3000; //인스턴스 필드는 정적필드처럼 사용할 수 없군용
		//DateTypeExam.printData("nailho"); //인스턴스 메소드는 정적메소드 처럼 사용할 수 없다.
		// 인스턴스 맴버는 반드시 생성한 후에 참조변수를 통해서 사용할 수 있다.
		
		DateTypeExam obj = new DateTypeExam();
		
		obj.printData("JYL");
		obj.num = 3000;
	}
}
		
		