package com.LX832.javastudy.day08;

public class LoopExam {
	
	public void exam01() {
		String strData = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i =0; i< strData.length(); i++) {
			System.out.print(strData.charAt(i) + " ");
		}
		System.out.println();
		for(int i =strData.length()-1; i > 0-1; i--) {
			System.out.print(strData.charAt(i) + " ");
	    }
		System.out.println();
		for(int i =0; i < strData.length(); i++) {
			int indexNum = 25-i; //reverse
			System.out.print(strData.charAt(indexNum) + " ");
	    }
		System.out.println();
		//"99" + "12";
		//length => 2 result = 3
		String num1Str = "999999";
		String num2Str = "1";
		//       carry = "000010"
		int max = num1Str.length() > num2Str.length()? num1Str.length() +1:num2Str.length() +1;
		int[] num1 = new int[max]; //문자열을 숫자로 변환해서 저장할 공간
		int[] num2 = new int[max]; //num2[5]=8; num2[4] =9;
		int[] carry = new int [max]; //올림수 저장할 배열
		
		numArr(num1, max, num1Str);
		numArr(num2, max, num2Str);
		
		
		
        String resultNum = "";
        
        for(int i= max-1; i > 0; i--) {
        	resultNum = calcuStr(num1[i], num2[i], carry, i) + resultNum;
        }
        System.out.println(carry[0]+resultNum);
  
	}
	private String calcuStr(int num1, int num2, int[] carry, int i) {
		String rtnValue;
		rtnValue = (num1 + num2 + carry[i]) % 10 + "";
		carry[i-1] = (num1 + num2 + carry[i]) /10;
		
		
		return rtnValue;
	}
	public void numArr(int[] num, int max, String data) {
		for(int i = 0; i < data.length(); i++) {
			num[i+max-data.length()] = data.charAt(i)-'0';
			//숫자 배열에 특정하 위치에 숫자로 변환된 자료를 저장하면 된다.
			//ex => 5자리 숫자의 경우 1번인덱스 부터 , 2자리 숫자의 경우 4번인덱스부터
		}
	}
	
	
}