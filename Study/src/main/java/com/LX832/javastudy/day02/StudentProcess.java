package com.LX832.javastudy.day02;

import java.util.Scanner;

public class StudentProcess {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("처리하고자 하는 학생 수 입력");
		int studentCount = scan.nextInt();

		//시험에 응시한 학생수만큼 학생자료 객체를 배열로 만
		StudentData stdt[] = new StudentData[studentCount];

		SungjukDatainput sin = new SungjukDatainput();
		for(int i = 0; i < studentCount; i = i + 1) {//학생수만큼 반복한다.
			stdt[i] = new StudentData();
			sin.inputData( stdt[i] ); //학번, 이름, 과목수만큼 점수를 입력 받는다.
		}
		
		for(int i = 0; i < studentCount; i = i + 1) { //각각의 학생에 대하여 평균을 계산함
			stdt[i].total();
			stdt[i].average();
		}
			
	   Rankprocess rankJob = new Rankprocess();
	   rankJob.rankCalcu(stdt);
			
       System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t랭킹");
	   StudentPrint prn = new StudentPrint();
	   for(int i = 0; i < studentCount; i++) {
			prn.infoPrint(stdt[i]);
		}
		
		}
	}
		

	
		

		
