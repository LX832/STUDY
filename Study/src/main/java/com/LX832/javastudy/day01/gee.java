package com.LX832.javastudy.day01;

import java.util.Scanner;

public class gee {

	public static void main(String[] args) {
		prnMtd("이름을 입력하세용");
		prnMtd("취미를 입력하세용");
		String name = nameInput();
		String hobby = nameInput();
		String lastPrnDate = "저의 이름은" + name + "이고, 나의 취미는" + hobby + "입니다";
		prnMtd(lastPrnDate);
		
	}
	public static String nameInput() {
		Scanner nameInput = new Scanner(System.in);
		String nameDate = nameInput.nextLine();
		return nameDate;
	
	}

	public static void prnMtd(String date) {
		System.out.println(date);

		
	}
}
