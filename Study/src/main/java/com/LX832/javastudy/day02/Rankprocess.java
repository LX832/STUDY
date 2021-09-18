package com.LX832.javastudy.day02;

public class Rankprocess {
	
	public void rankCalcu(StudentData[] stdt) {
		int arrCnt = stdt.length;
		for(int i = 0; i < arrCnt; i++) {
			int rankNum = 1;
			for(int j = 0; j < arrCnt; j++) {
				
				if( stdt[i].total < stdt[j].total) {
					rankNum = rankNum +1;
				}
			}
			
			stdt[i].rank = rankNum;
			
		}	
	}

}
