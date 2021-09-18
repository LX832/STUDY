package com.LX832.javastudy.day11cocc;

public class BasicCopy {
	public void copy01() {
		
		int data1 = 200;
		int data2;
		data2 = data1;
		System.out.print("data1=>" + data1 + "\t");
		System.out.print("data2=>" + data2 + "\n");
		data1 = 100;
		System.out.print("data1=>" + data1 + "\t");
		System.out.print("data2=>" + data2 + "\n");
	}
	public void copy02() {
		String data1 = "good game";
		String data2 = data1;
		
		System.out.print("data1=>" + data1 + "\t");
		System.out.print("data2=>" + data2 + "\n");
		data1 = "good game";
		System.out.print("data1=>" + data1 + "\t");
		System.out.print("data2=>" + data2 + "\n");
	}
	public void copy03() {//문자열의 참조타입이지만 new 연산자를 활용한 참타입처럼 정의하고 사용하였을 대 동작
		//copy02메소드와 copy3메소드를 통해서 얻을 수있는 결혼
		//문자열 자료는 불변자료임을 나타낸다.
		String data1 = new String("good game");
		String data2 = data1;
		
		System.out.print("data1=>" + data1 + "\t");
		System.out.print("data2=>" + data2 + "\n");
		data1 = "good game";
		System.out.print("data1=>" + data1 + "\t");
		System.out.print("data2=>" + data2 + "\n");
	}
	public void copy04() {
		int[] data1 = {1,2,3};
		int[] data2 = data1;
		for(int value : data1) {
			System.out.print(value + ",");
		}
		System.out.println();
		for(int value : data2) {
			System.out.print(value + ",");
		}
		System.out.println();
		data1[0] = 10; data1[1] = 20; data1[2] = 300;
		for(int value : data1) {
			System.out.print(value + ",");
		}
		System.out.println();
		for(int value : data2) {
			System.out.print(value + ",");
		}
		System.out.println();
	}

}
