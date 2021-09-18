package com.LX832.javastudy.day12;

public class ArrCopyExam {
	
	public void exam() {
		
		
	
	    int[] arrData1 = {1,2,3,4};
    	int[] arrData2 = new int[4];
	    System.arraycopy(arrData1, 0, arrData2, 0, arrData1.length);
    	//원본은 보관하고 복사본으로 작업을 테스트하고자 할 때
	    //선언된 배열의 크기가 잘못 설정이 되었을 때 복사본을 만들어서 재설정을 한다.
	    //=>사용되지 않은 배열은 회수될 수 있도록 해주는 것이 좋다. null로 설정하고 System.gc()
	    arrPrint(arrData1, "원본");
    	arrPrint(arrData2, "복사본");
    	
    	arrData1[2] = arrData1[2] * 10;
    	arrPrint(arrData1, "변경후 원본");
    	arrPrint(arrData2, "변경후 복사본");
    	System.out.println("======================================");
    	int[] arrData3 = {1,2,3,4};
    	int[] arrData4 = arrData3;
    	
    	arrPrint(arrData3, "원본");
    	arrPrint(arrData4, "복사본");
    	
    	arrData3[2] *=100;
    	arrPrint(arrData3, "변경후 원본");
    	arrPrint(arrData4, "변경후 복사본");
	
	
}
    public void arrPrint(int[] arrPrintData, String title) {
    	System.out.println(title + "배열 출력");
	    for(int value : arrPrintData) {
		System.out.print(value + ", ");
	    }
	    System.out.println("\t");
    }
    public void exam2() {
    	StringBuffer[] sbSrcArr = 
    		{new StringBuffer("aa"), new StringBuffer("bb"),};
    	StringBuffer[] sbTarArr = new StringBuffer[2];
    	System.arraycopy(sbSrcArr, 0, sbTarArr, 0, sbSrcArr.length);
    	arrPrint(sbSrcArr, "원본 (변경전)");
    	arrPrint(sbTarArr, "복사본 (변경전)");
    	
    	//sbSrcArr[0] = new StringBuffer("qwertyuiop");
    	sbTarArr[0].append("good game");
    	arrPrint(sbSrcArr, "원본 (변경전)");
    	arrPrint(sbTarArr, "복사본 (변경전)");
    }
    public void arrPrint(StringBuffer[] arrPrintData, String title) {
    	System.out.println(title + "배열 출력");
	    for(StringBuffer value : arrPrintData) {
		    System.out.print(value + ", ");
	    }
	    System.out.println("\t");
    }

	

}
