package com.LX832.javastudy.day06control;

public class ConditionExam {
	public void ifExam01(int num1, int num2) {
		//두 수루를 넘겨 받아서 큰수와 작은 수를 출력하는 프로그램 작성
		if( num1 > num2)
			System.out.println("큰 수 :" + num2);
		    System.out.println("작은 수 :" + num1);
		
	}
	public void ifExam02(int num1 , int num2) {
		if(num1> num2)
			System.out.println("큰 수" +  num1);
		    System.out.println("작은 수" +  num2);
		   

	if(!(num1> num2))
		System.out.println("큰 수" +  num1);
	    System.out.println("작은 수" +  num2);
}

    
    public void ifTnumExam01(int num1, int num2, int num3) {
    	int numOne = 0;
    	int numTwo = 0;
    	int numThree = 0;
    	if( num1 > num2 ) {
    		if(num1 > num3);
    		numTwo = num2;
    		numThree = num3;
    	}else {
    		numTwo = num3;
    		numThree = num2;
    	}
    	
//    }else {
 //      numOne = num3;
 //      numTwo = num1; 
 //      numThree = num2;

       
       public void ifExam04(int num1, int num2) {
    	   if(aaa(num1, num2)) { //복잡한 논리 연산식은 메소드로 분리해서 그 결과를 적용한다.
    		   System.out.println("메소드를 호출한 결과가 true를 반환하였습니다.");
    		   System.out.println("num1가 큰 수입니다.");
    	   }else {
    		   System.out.println("메소드를 호출한 결과가 false를 반환하였습니다.");
    		   System.out.println("num2가 큰 수입니다.");
    	}
    
    
    }
       public boolean aaa(int num1, int num2) {
    	   return num1>num2? true: false;
       }
       public void jumChack() {
    	   int score = 75;
    	   if(score >= 90 && score <=100) {
    		System.out.println("수!!!");   
    	   }else {
    		   
    	   }
    	   if(score >= 90 && score <90) {
       		System.out.println("우!!!");   
       	       	   
           }
    	   if(score >= 90 && score <80) {
       		System.out.println("미!!!");   
       	          	   
       	   }
    	   if(score >= 90 && score <70) {
       		System.out.println("양!!!");   
       	          		   
       	   }
    	   if(score >= 90 && score <60) {
       		System.out.println("낙제!!!");   
       	   
       	   }
    	   
       }
}

