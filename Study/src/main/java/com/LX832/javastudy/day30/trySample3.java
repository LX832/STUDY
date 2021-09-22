package com.LX832.javastudy.day30;

import java.util.Scanner;

//NumberFormatException Example

public class trySample3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
			try {
			// data input
			System.out.println("데이터 입력");
			String x = sc.next();// "500"
			int x2 = Integer.parseInt(x);
	
			System.out.println("데이터 입력");
			String y = sc.next();// "300"
			int y2 = Integer.parseInt(y);
	
			int sum = x2 + y2;// 500 + 300 = 800
			System.out.println("두수의 합계 " + sum);// 800
	
			}catch(NumberFormatException e) {
				//e.printStackTrace();// 어떤 오류가 발생하는지 확인용
				System.out.println("숫자형 데이터를 입력해 주세요.");
			}
			
			System.out.println("계속실행");
		
	}

}
