package com.LX832.javastudy.day07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ForExam {
	public void forLoopExam01() {
		for(int i =0; i<15; i=i+1 ) {
		System.out.println("으악" + i);
		if( i == 4) i = 1+5;
		//i++;
		}
		
		System.out.println("for 구문이 종료되었습니다.");
	}
	public void forLoopExam02() {
		
		for(int i = 0, j=0, k=10;true;) {
			i= i+1;
			
		
		System.out.println("으악 "+ i + "j=" + k);		
		if(i >= 10) {
		   break;
		}
		

		}
	}
		//System.out.println("i=" + i);
//		System.out.println("for 구문이 종료되었습니다.");
		public void forLoopExam03(int start, int endData, int incre) {
			int sum = 0;
			for(int i = start; i < endData+1; i=i+incre) {
			 sum = sum + i;
			
			}
			
			System.out.println(start + "부터" + endData + "까지의 합계"+ sum);
			System.out.println("for 구문이 종료되었습니다.");
	}
		
		public void forLoopExam04() {
			Set<String> setData = new HashSet<String>();
			setData.add("기본기");
			setData.add("LXY");
			setData.add("sample");
			setData.add("test");
			Iterator<String> iter = setData.iterator();
			for(;iter.hasNext();) {
				System.out.println(iter.next());
				
			}
			System.out.println("==============");
			Iterator<String> iter1 = setData.iterator();
			while(iter1.hasNext()) {
				System.out.println(iter1.next());
			}
		}
}
