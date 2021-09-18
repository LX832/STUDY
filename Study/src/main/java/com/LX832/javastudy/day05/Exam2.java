package com.LX832.javastudy.day05;

public class Exam2 {
	public static void main(String[] args) {
		int oddsum = 0; int evensum = 0;
		long startTime = System.nanoTime();
		for(int i=1; 1<=100; i++)	 {
			if( i%2 == 0) {
				evensum = evensum + i;
			}else {
				oddsum += i;
			}
		}	
		//System.out.println( (System.nanoTime() - startTime));
		//System.out.println("홀수의 합"+ oddsum);
		//System.out.println("짝수의 합 "+ evensum);
		
		//oddsum = 0;
		//evensum = 0;
		//startTime = System.nanoTime();
		for(int i=1; i<=100; i=i+2) {
			oddsum = oddsum + i;
			evensum = evensum +(i+1);
		}
		System.out.println( (System.nanoTime()- startTime));
		System.out.println("홀수의 합"+oddsum);
		System.out.println("짝수의 합"+evensum);
		
	}

}
