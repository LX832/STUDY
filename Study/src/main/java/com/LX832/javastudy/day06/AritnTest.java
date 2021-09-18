package com.LX832.javastudy.day06;

public class AritnTest {
	public static void main(String[]args) {
		OperationCodeExam01 obj = new OperationCodeExam01();
		obj.relation01('b','B');
		
		obj.logical01(false, false);
		obj.logical01(10>200, 30 <= 500);
		obj.logical01(inNumber(), isText());
	}
	public static boolean inNumber() {
		return true;
	}
	public static boolean isText() {
		return true;

}
}
