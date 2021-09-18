package com.LX832.javastudy.day09;

public class ArrayExam {
	//같은 종류의 여러개 자료를 만드는 방법 <= 가장 기본이 되는 자료를 구성하는 방법
	//동잃 종류끼리 하나의 보따리(변수)로 묶는다.
	public void arrCreate() {
		
		int sub1 = 100; //기본타입(정수를 담을 수 있는) 변수 생성(선언)
		int sub2 = 100;
		int sub3 = 100;
		int sub4 = 100;
		int sub5 = 100;
		System.out.println(sub1 + sub2);
		
		int[] sub;
		sub = new int[5]; //실제 자료를 저장할 공간을 만든다 => new
		//만들어진실제 저장 공간 각각의 일련 번호(인덱스= 숫자로 이루어진 키)를 붙인다.(0부터) 
		double[] dbArr;
		dbArr = new double[3];
		dbArr[0] = 10;
		String [] strArr;
		strArr = new String[3];
		strArr[0] = "안쉬냐";
		
		int[] intArr = {0,0,0,0,0};
		
		StudentInfoVO[] siv ;
		siv = new StudentInfoVO[30];
		
		siv[0] = new StudentInfoVO();
		System.out.println(siv[0].hakbum);
		System.out.println(siv[0].stdName);
		
		}
	public void arrCreate2() {
		int[] jumsu = {100,20,70,80};
		int[] jumsu2 = new int [4];
		jumsu2[0] = 1; jumsu2[1] = 2; jumsu2[2] = 3; jumsu2[3] = 4;
		
		int[] jumsu3 = new int[] {100,20,70,80}; //메소드 호출하고자 할 때, 반환하고자 할 때
		System.out.println("첫번째 메소드 호출");
		func( new int[] {10,20,30,40,50});
		System.out.println("두번째 메소드 호출");
		func( new int[] {100,200});
		//배열은 만들어져 있으나 arrCreate2메소드에서 만들어진 배열의 주소를 담고있지 않다.
		
		System.out.println("세번째 메소드 호출");
		func(jumsu2);
		//jumsu2라는 변수에는 만들어진 배열{1,2,3,4}의 주소(위치)를 arrCreate2에서도 담고있다.
	}
	
	public void func(String[] arrEx) {
		System.out.println("넘겨받은 자료의 개수(배열 요소):" + arrEx.length);
		for(int i = 0; i < arrEx.length; i++) {
			System.out.println(i + 1 + "번째 배열이 들어 있는 자료" + arrEx[i]);
		}
	
	}
	public void arrCreate3() {
		int[] arrEx = {1,2,3,4};
		System.out.println("메소드 호출 전 배열의 값");
		for(int i = 0; i < arrEx.length; i++) {
			System.out.print(arrEx[i] + "  ");
			
		}
		System.out.println();
		func2(arrEx);
		System.out.println("메소두 호출1 후 배열의 값");
		
		for(int i = 0; i < arrEx.length; i++) {
			System.out.print(arrEx[i] + "  ");
		}
		System.out.println();
		func2(arrEx);
		System.out.println("메소두 호출2 후 배열의 값");
		
		for(int i = 0; i < arrEx.length; i++) {
			System.out.print(arrEx[i] + "  ");
		}
	}
	public void func2(String[] arrEx) {
		for(int i = 0; i < arrEx.length; i++) {
			arrEx[i] = arrEx[i] * 100; //넘겨받은 배열의 원래 값에 100을 곱하라
		}
	}
	public void arrCreate4() {
		String g;
		String o;
		String d;
		String[] arrEx = {g,o,o,d};
		System.out.println("메소드 호출 전 배열의 값");
		for(int i = 0; i < arrEx.length; i++) {
			System.out.print(arrEx[i] + "  ");
			
		}
		System.out.println();
		func2(arrEx);
		System.out.println("메소두 호출1 후 배열의 값");
		
		for(int i = 0; i < arrEx.length; i++) {
			System.out.print(arrEx[i] + "  ");
		}
		System.out.println();
		func2(arrEx);
		System.out.println("메소두 호출2 후 배열의 값");
		
		for(int i = 0; i < arrEx.length; i++) {
			System.out.print(arrEx[i] + "  ");
		}
	}
	
	
}
		

