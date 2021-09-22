package com.LX832.javastudy.day30;

import java.util.Scanner;

//ArrayIndexOutOfBoundsException Example

public class trySample2 {

	public static void main(String[] args) {
		String data[] = new String[5];

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("문자열 데이터 입력");

			//data input
			for (int i = 0; i < data.length; i++) { //[0] ~[4] : 5...
				data[i] = sc.next();
			}
				
		}catch (Exception e) {
			String msg = "배열의 크기보다 데이터가 너무 많아요.";
			System.out.println(msg); 
		}
					
		
		//data output
		for (int i = 0; i < data.length; i++) { //[0] ~[4] : 5...
			System.out.print(data[i] + " ");
		}		
		
		
		
	}

}
