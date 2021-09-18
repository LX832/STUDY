package com.LX832.javastudy.day11;

public class StringEquals {
	public void test01() {
		String str1 = "good game"; //String str1 = "good game";
	    String str2 = "good game";
	    System.out.println("문자열(참조형) equals 메소드 연산 비교");
	    if (str1.equals(str2)) {
	    	System.out.println("같네용" + str1 + "\t" + str2);
	    	
	    }else {
	    	System.out.println("비교하는 두 자료는 달라요"+ str1 + "\t\t" + str2);
	    }
	    System.out.println("===============================");
	    System.out.println("배열 == 연산 비교");
	    int[] arr1 = {1,2,3,4,5};
	    int[] arr2 = {1,2,3,4,5};
	    if (arr1 == arr2) {
	    	System.out.println("같네요");
	    }else {
	    	System.out.println("비교하는 두 자료는 다릅니다.");
	    }
	    System.out.println("===============================");
	    System.out.println("참조형 qpqpqpqp객체의 equals 비교");
	    int k = 20;
	    Qpqpqpqp obj1 = new Qpqpqpqp();
	    Qpqpqpqp obj2 = new Qpqpqpqp();
	    if(obj1.equals(obj2)) {
	    	System.out.println("같아요");
	    	
	    }else {
	    	System.out.println("비교하는 두 자료는 다릅니다.");
	    }
	    System.out.println(obj1 + "\n"+ obj2);
	    
	}
	public void test02() {
		String str1 = "홍길동그만";
		System.out.println(str1);
		System.out.println(str1.toString());
		Qpqpqpqp obj1 = new Qpqpqpqp();
		System.out.println(obj1);
		System.out.println(obj1.toString());
	}
	public void upgradeFor() {
		int[] data = {1,2,3,4,5};
		for(int j = 0; j < data.length; j++) {
			System.out.println(j+1 +"번째 자료= " +data[j]);
		}
		System.out.println("=======================");
		int i = 0;
		for(int value : data) {
			i++;
			System.out.println(i+"번째 배열에 저장된 자료="+value);
		}
	}

}
