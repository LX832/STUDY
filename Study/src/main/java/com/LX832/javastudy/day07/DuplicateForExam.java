package com.LX832.javastudy.day07;

public class DuplicateForExam {
	//for 구문 안에 for 구문이 들어있는 반복문 
	public void dupForExam() {
		for(int i = 0; i < 3; i++) {
			System.out.println("바깥 for 구문"+i);
			for(int j=0; j < 2; j=j+1) {
				System.out.println("안쪽 for 구문 일 때 i =" + i + ",j=" + j);
			
			}
			System.out.println("안쪽 for 구문이 끝난 후 출력하는 구문");
		}
		
	}
/*	public void dupForExam02() {
		System.out.println("====으악===");
		for(int i  = 1; i < 10; i= i+3) {
			int ii = i+1;
			int iii= i+2;
			System.out.println("====="+ i + "단====="+"\t"+"====="+ ii + "단====="+"\t"+"====="+ iii + "단=====");
			for(int j=1; j <= 9; j++) {
				
				System.out.print( i + "  *  " + j + " = "+ i * j + "\t");
				System.out.print( ii + "  *  " + j + " = "+ ii * j + "\t");
				System.out.println( iii + "  *  " + j + " = "+ iii * j);
				//for(int p=1; p < 9; p=p+3) {
					//System.out.println();*/
				
			
		
	public void DupForExam03() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				//int p = 4;
				String sum =  "\t";
				for(int p = 4; p<=5; p=p-1)
					//sum = sum*p
				 
				    
					System.out.print( sum + " * ");
				
				
			}
			System.out.println();
		}
	}
						
	}
			

	

