package com.LX832.javastudy.day08;

public class StringAdd {
	
	public void longStringAdd(String data1, String data2) {
		int carry = 0;
		int data1Len = data1.length();
		int data2Len = data2.length();
		if (data1Len > data2Len) { //첫번쨰 자료가 두번째 자료보다 큰 숫자라면
			String imsi = "";
			for(int i = 0; i < data1Len - data2Len; i++) {
				imsi = imsi + "0";
			}
			data2 = imsi + data2; //두번째 숫자에다 0을 필요한 갯수만큼 추가
		}else {
			String imsi = "";
			for(int i = 0; i < data2Len - data1Len; i++) {
				imsi = imsi + "0";
			}
			data1 = imsi + data1;
		}
		data1Len = data1.length();
		
		int num1, num2;
		String lastResult = "";
		for(int i = data1Len -1; i >= 0; i--) {
			num1 =data1.charAt(i) - '0';
			num2 =data2.charAt(i) - '0';
			lastResult = ((num1 + num2 + carry) %10)  + lastResult;
			carry = (num1 + num2 + carry) /10;
		}
		if (carry !=0) {
			lastResult = 1 + lastResult;
			
		}else {
			
		}
		System.out.println("두 수의 합" + lastResult);
	}
	

	public void radixConversion(int data,int radixNum) {
		String radixStr = "0123456789ABCDEFGHIJLLMNOPQRSTUWXYZabcdefghijklmnopqrstuvwxyz가나다라마바사아자차카타파하거너더러";
		System.out.println(radixStr.length());
		int mock = 0;
		int namerge = 0;
		String result = "";
		while(true) {
			mock = data / radixNum;
			namerge = data % radixNum;
			result = radixStr.charAt(namerge) + result;
			if( mock<= 0 ) {
				break;
			}else {
				data = mock;
			}
		}
	System.out.println(result);
	}

	
	public void tenConversion(String data, int radix) {
		String radixStr = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz가나다라마바사아자차카다파하각낙닥락";
		int sum = 0;
		for ( int i = 0; i < data.length(); i++) {
			sum = sum +(int) (radixStr.indexOf(data.charAt(i)) * Math.pow( radix, data.length()-1-i));
					
		}
		System.out.println(sum);

   }
}