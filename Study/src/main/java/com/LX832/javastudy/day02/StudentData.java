package com.LX832.javastudy.day02;

public class StudentData {
	String stNO;
	String iname;
	int subject[] = new int[3];
	int total;
	double avg;
	int rank;
	
	public void total() {
		total = 0;
		for(int i = 0; i < subject.length; i = i + 1) {
			total = total + subject[i];
		}
	}
	public void average() {
		avg = total / (subject.length*1.0);
	}

}
