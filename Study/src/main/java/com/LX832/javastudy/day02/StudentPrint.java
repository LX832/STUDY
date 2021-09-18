package com.LX832.javastudy.day02;

public class StudentPrint {

	public void infoPrint(StudentData std) {
		// TODO Auto-generated method stub
	    System.out.print(std.stNO +"\t");
	    System.out.print(std.iname +"\t");
	
		for(int i = 0; i < std.subject.length; i = i + 1) {
			System.out.print(std.subject[i] +"\t"); 
	    	
		}
		System.out.print(std.total +"\t");
    	System.out.print(std.avg+ "\t");
    	System.out.print(std.rank+ "\n");
  }
}
