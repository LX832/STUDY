package com.LX832.javastudy.day05;

public class Exam1 {
	public static void main(String[] args) {
		char aa = 65+1;
		System.out.println(aa+1);
		System.out.println(aa);
		
		
		//''로 표현된 자료 문자는 직접 데이터이고 ""정의된 문자열은 직접 자료가 저장된 시작위치를 반환한다.
		
		
	    for(char i ='A'; i <= 'z'; i++ ) {
	    //System.out.println(i);
	    }
	    
	    String sa = "A";
	    //System.out.println(aa==sa);
	    //System.out.println(aa == sa);
	    
	    int k = 050;
	    System.out.println(" k = 050 저장 후 k 변수안에 저장된 값 : " + k);
	    int ll = 0x50;
	    System.out.println(" k = 050 저장 후 ll 변수안에 저장된 값 : " + ll);
	    
	    int num1 = 127;
	    int num2 = 50;
	    
	    
	    //System.out.println(num1 + num2);
	    //연산 결과가 저장되어 지는 경우
	    int numCalsave = num1 + num2;
	    
	    //두개의 자료가 서로 다른 타입의 자료일 경우 결과는 큰쪽의 타입을 따른다.
	    //120 + 120L => 4바이트 크기의 120이라는 정수아 8바이트 크기의 120의 계산 결과 240은 8바이트 크기를 갖는다.
	    //120 + 12.5f =>8바이트 정수와 4바이트 실수를 연산할 때 연산 결과 132.5는 실수 (4바이트)크기를 갖는다.
	    
	    System.out.println(1/2.0);
	    System.out.println(1/0.0);
	    System.out.println(1.0/0);
	    System.out.println(-1/0.0);
	    //% 나머지를 구하는 연산자
	    System.out.println("===============================");
	    System.out.println(112584%2);
	    
	    //소숫점 이하의 숫자는 정확하게 2진수로 표현되지 못하는 경우가 있음
	    //일반적으로 소수점의 숫자가 5로끝나면 2진수로 정확하게 표현될 확률이 높다.
	    
	    double data = 0.1;
	    for(int i = 0; i < 10; i=i+1) {
	    	data = data + 0.1;
	    }
	    System.out.println(data);
	    System.out.println(data < 1.0);
	    
	    int kkk = 2+3-5*6+25;
	    		
	    //연산자는 ㄷㅏㄴ한
	    		
	    //1-2+3-4+5-6.....+99;		
	    		
	    int sum = 0;
	    //int k = -1;
	    for(int i=1; i<100; i=i+1) {
	    	k = k * -1;
	    	sum = sum+k*i;
	    }
	    	System.out.println("구하라고 하신것 : " + sum);
	    	
	    	
	    	
	    	
	    }
	    	
	    
	    		
	    		
	    		
	    		
	    		
	}

