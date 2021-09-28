package com.LX832.javastudy.dayTest1;

import java.util.Scanner;

public class SORAGO {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String answer[] = new String[] { "안돼", "돼", "하지마", "멈춰", "그래", "좋아" };
		String question;
		int as = (int) (Math.random() * 6) + 1;

		System.out.println("질문이뭐야");
		question = sc.next();
		System.out.println(answer[as]);

	}

}
