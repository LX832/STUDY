package com.LX832.javastudy.day02;

public class DataTypeTest2 {
	public static void main(String[] args) { //main은 stack의 방 밤색는 상자
		DateTypeExam dataTypeExam = new DateTypeExam();
		int k = 20;
		double dbData = 12.25 * (3+2);
		int[] karr = {20,30,40};
		String name = "아으";
		//String name = new String(아으);
		System.out.println(name);
		System.out.println(dataTypeExam.f2);
		System.out.println("=================");
		
		dataTypeExam.fieldPrn();
		
		System.out.println(karr[2]);
		
		int i;
		i = 10;
		String j;
		i = i + 10; //첫번쨰 i의 용도는 저장, 두번쨰 i의 용도는 꺼내기 위한 용도
		//상자=>변수(왼쪽에)=
		j = "이게되려나";
		System.out.println(i); //꺼내기
		System.out.println(j);
		
		int b2 = 1250;
		int c3 = 50;
		int d2 = b2 + c3;
		
		int size = 5000;
		int dataArr[] = new int [size];
		for(int i1 = 1; i1 <= size; i1 = i1+1) {
			dataArr[i1-1] = i1;
		}
				
	}
}
