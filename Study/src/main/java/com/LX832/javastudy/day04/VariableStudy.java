package com.LX832.javastudy.day04;

public class VariableStudy {

	
	
/*	 public void  boxCreate() { 
		System.out.println(myName);
		
		String myName = "조영리";
		nameprint(myName, 5);
		myName="땡떙떙";
		nameprint(myName, 7);
		myName="똒똒똒";
		nameprint(myName, 30);
		
	 }
		

	public void namePrint(String myName, int num) {
		for(int i =1; i < num + 1; i= i + 1) {
			System.out.println(myName + "\t");
			 if(i % 10 ==0 ) {
			  System.out.println();
			 }
		}
		System.out.println();
	*/
	
   
 
	
	
	public void weekdayCalcu(int todayInt , int afterDay) {
		int calValue = (todayInt + afterDay) % 7;
		if (calValue == 0) {
			System.out.println(afterDay + "일요일");
		}
    	if (calValue == 0) {
	    	System.out.println(afterDay + "월요일");
    	}
		if (calValue == 0) {
			System.out.println(afterDay + "화요일");
		}
		if (calValue == 0) {
			System.out.println(afterDay + "수요일");
		}
		if (calValue == 0) {
			System.out.println(afterDay + "목요일");
		}
		if (calValue == 0) {
			System.out.println(afterDay + "금요일");
		}
		if (calValue == 0) {
			System.out.println(afterDay + "토요일");
		}
	}

     public void weekDayCalcu2(int todayInt, int afterDay) {
    	 String[] rtnDate = "일 월 화 수 목 금 토". split(" ");
    	 System.out.println(afterDay + "일 후는" + rtnDate[(todayInt + afterDay)% 7] + "요일 입니다");
    	 int calValue = (todayInt + afterDay) & 7;
     }
	}



	

