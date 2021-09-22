package com.LX832.javastudy.day30;

import java.util.InputMismatchException;
import java.util.Scanner;

// if문  + try ~ catch

public class trySample5_if2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		try {
			// data input
			System.out.println("국어 데이터 입력");// 범위(0 ~ 100)
			int kor = sc.nextInt();// 100
	
			System.out.println("영어 데이터 입력");// 범위(0 ~ 100)
			int eng = sc.nextInt();// 55
	
			if(kor > 0 && kor <=100) {
				if(eng >= 0 && eng <=100) {
					int sum = kor + eng;// 
					System.out.println("두수의 합계 " + sum);// 
				}
			}			
		}catch(InputMismatchException e) {
			System.out.println("숫자형 데이터를 입력하세요.");
		}
			
	}

}
