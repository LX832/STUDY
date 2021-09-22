package com.LX832.javastudy.day30;

import java.util.Scanner;

//ArithmeticException  = DivideByZero Example
//주의사항> 나눗셈은 0으로 나누지 않도록 합니다.
//일반적으로 덧셈, 뺄셈은 0으로 설정하지만,
//곱셈이나 나눗셈이라면 1 이상의 값을 설정해 주어야 합니다.

public class trySample4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
			try {
			// data input
			System.out.println("데이터 입력");
			String x = sc.next();// "500"
			int x2 = Integer.parseInt(x);
	
			System.out.println("데이터 입력");
			String y = sc.next();// "0"
			int y2 = Integer.parseInt(y);
	
			int sum = x2 / y2;// 500 / 0 = / By Zero
			System.out.println("두수의 합계 " + sum);// 
	
			}catch(ArithmeticException e) {
				System.out.println("0으로는 숫자를 나누면 안됩니다.");
			}
			
		
		
	}

}
