package com.LX832.javastudy.day10;

public class ArrayExam01 {
	// 모든 배열은 length라는 속성을 갖는다.
	//lnegth라는 속성(필드)는 Read only (=private 이며 geteer만 존재한다)이다.
	public void arrayCreatePrimitive() {
		int[] intArr = {1,2,3,4,5}; //선언과 동시에 배열의 생성과 데이터의 할당이 한 번에 이루어짐
		System.out.println("intArr배열의 요소 개수" + intArr.length);
		long[] longArr = new long[3]; //선언과 동시에 배열을 생성 => 각각의 요소는 기본값으로 할당
		longArr[0] = 10;
		boolean boolArr[] = new boolean[] {true,false,true};
		
		
	}
	public void arrayCreateReference() {
		//기본타입의 이차원 배열처럼 이해하면 될 듯
		String[] strArr = {"둘리"	 , "sample", "test"};
    //  String[] strArr = {new String("둘리"), new String("sample") , new String("test")}; 
		StringBuffer[] sbArr 
		     = new StringBuffer[] {new StringBuffer("young"),
		    		               new StringBuffer("yoyo")};
	    StringBuilder[] sbilArr;
	    sbilArr = new StringBuilder[3];
	    sbilArr[0] = new StringBuilder("samsung");
	    sbilArr[1] = new StringBuilder("apple");
	    sbilArr[2] = new StringBuilder("MOUSTACHE");
	    
	    System.out.println("참조형 배열의 자료 출력1" + strArr[0]);
	    System.out.println("참조형 배열의 자료 출력2" + sbArr[1]);
	    System.out.println("참조형 배열의 자료 출력3" + sbilArr[2]);
	    System.out.println("참조형 배열의 자료 출력4" + sbilArr[1]);
	    		
	}
	public void arrPriTwoLevel() {
		
		int[][] int2Lev;
		int2Lev = new int[3][];
		int2Lev[0] = new int[5];
		int2Lev[1] = new int[2];
		System.out.println(int2Lev[2]);
		System.out.println(int2Lev[1][0]);
		int[][] intLev2 = {{1,2},{10,20,30,40},{100,200,300}};
		System.out.println(intLev2.length + "=========");
		int arrTotCount = 0;
		for(int i = 0; i < intLev2.length; i++) {
			arrTotCount = arrTotCount + intLev2[i].length;
			
		}
		System.out.println("총 배열의 개수:" + arrTotCount);
		int[][] intTwoArr = new int[5][3];
		
				
	}
     public void arrRefTwoLevel() {
    	/* MemberVO[][] memTwoArr2 = {
    			 {new MemberVO(), new MemberVO(), new MemberVO()},
    			 {new MemberVO(), new MemberVO()}*/
    
    			 
    	 
    	 
   /*      System.out.println(memTwoArr[0]);
    	 System.out.println(memTwoArr[0][0].getGrade());
    	 memTwoArr[0][0].setGrade(5);
    	 System.out.println(memTwoArr[0][0].getId());
    	 memTwoArr[0][0].setId("ttttt");
    	 System.out.println(memTwoArr[0][0].getId());*/
    	 
    	 System.out.println("================절취선================");
			
    	 MemberVO[][] memTwoArr2 = new MemberVO[3][2];
    	 
    	 System.out.println(memTwoArr2[2]);
    	 System.out.println(memTwoArr2[2][1]);
    	 memTwoArr2[0][0].setGrade(5);
    	 System.out.println(memTwoArr2[1][0].getId());
    	 memTwoArr2[0][0].setId("tottototot");
    	 System.out.println(memTwoArr2[0][1].getId());
     }
    		
    	 
		
		
	}


