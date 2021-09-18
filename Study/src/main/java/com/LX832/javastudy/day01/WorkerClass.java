package com.LX832.javastudy.day01;

public class WorkerClass {

	public int addMethod(int num1, int num2) {
		int addResult = 0;
		addResult= num1 + num2;
		return addResult;
		
	}
	public int subtract(int num1, int num2) {
		int subtractResult = 0;
		subtractResult = num1 - num2;
		return subtractResult;
		
	}
	public int multiply(int num1, int num2) {
		int multiplyResult = 0;
		multiplyResult = num1 * num2;
		return multiplyResult;
	
	}
	public int devide(int num1, int num2) {
		int devideResult = 0;
		devideResult = num1 / num2;
		return devideResult;
		
	}
	public int remainde(int num1, int num2) {
		int remaindResult = 0; 
		remaindResult = num1 % num2;		
		return remaindResult;
		
	}
	//지수승 계산 => (exponent)
	public double exponent(int num1, int num2) {
		double expResult = 0.0;
		expResult = Math.pow(num1,num2);
		return expResult;
		
	}
}
