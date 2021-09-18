package com.LX832.javastudy.dayTest1;

import java.util.Scanner;

public class SsinNaTest {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("정수 X 입력해주세요~");
			int X = scan.nextInt();
						
			System.out.println("정수 Y 입력해주세요~");
			int Y= scan.nextInt();
			
			if(X > 0) {
			if(Y > 0)	
			System.out.print("1번");
			}
			
			if(X < 0) {
			if(Y > 0)	
			System.out.print("2번");
			}
			
			if(X < 0) {
			if(Y < 0)	
			System.out.print("3번");
			}
			
			if(X > 0) {
			if(Y < 0)	
			System.out.print("4번");
			}
	}
}
			
			

			
		
	
