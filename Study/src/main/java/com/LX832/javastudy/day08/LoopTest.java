package com.LX832.javastudy.day08;

public class LoopTest {

	public static void main(String[] args) {
		LoopExam obj = new LoopExam();
		obj.exam01();
		System.out.println("=================");
		StringAdd stringAdd = new StringAdd();
		stringAdd.longStringAdd ("999999999","3333");
		stringAdd.longStringAdd ("999999999","351341241245125789179");
		
		stringAdd.radixConversion( 36 , 2 );
		stringAdd.tenConversion( "FF" , 16 );	//16진수 - > 10진수로 변환
				

	}

}
