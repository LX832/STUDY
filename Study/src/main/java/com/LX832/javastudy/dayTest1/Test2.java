package com.LX832.javastudy.dayTest1;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		Test2 su = new Test2();
		su.solution(null);
		
	}
		
    public String solution(String phone_number) {
    	
		Scanner scan = new Scanner(System.in);
		String answer = phone_number;
		System.out.println("번호내놔");
		phone_number = scan.next();
		
		

		answer = phone_number.substring(7);
		System.out.print("고객 핸드폰 번호 : ***-****-" + answer);
        return (phone_number);
        
        
        

	}


}
