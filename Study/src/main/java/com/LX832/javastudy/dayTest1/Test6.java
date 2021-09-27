package com.LX832.javastudy.dayTest1;

import java.util.Arrays;
import java.util.HashMap;

public class Test6 {

	public static void main(String[] args) {

		System.out.println("참가는 했지만 완주는 못한사람은?");

		
		String[] participant = {"wonchul","sangeun","sangwon","sangeun","joyoung","wonchul","BAN","BAN","PEPE"};		
    	String[] completion = {"wonchul","sangwon","wonchul","joyoung","BAN","BAN","PEPE"};
    	//동명이인 비굣값: sangeun, wonchul, BAN
    	//
    	//기댓값: sangeun,wochul 중 n 명은 완주하지 못했어요. BAN은 전원 완주 못했어요
    	//동명이인중이 완주자에 포함된다면, P>C(동명이인의) 의 경우 n명은 완주못했어요, P=C의 경우 모두 완주했습니다. P<C의 경우는 불가능(P는 언제나 C보다 작거나 같기때문에)
    	
		System.out.println(getArrayMin(participant, completion));		
		System.out.println("============================");
		
		System.out.println("동명이인" + getArrayMin2(participant, completion) + "n명은 완주하지 못했어요");
		System.out.println(getArrayMin2(participant, completion));
			
	}
		
				
		
	public static String getArrayMin(String participant[], String completion[]) {
		
		String answer = "";
		int count = 0;
		try {
			if(participant.length > 0 && completion.length > 0) { 
				for(int i=0; i<participant.length; i++) {					
					for(int j=0; j<completion.length; j++) {
						
						if(participant[i].equals(completion[j]) == true) { 
							count ++;
						
						}												
					}
					
					if(count <= 0) { 
						if(answer.contains(participant[i]) == false) { 
							answer += String.valueOf(participant[i] + " ");							
						}	
					}
					
					count = 0; 
				}
			}else {
				System.out.println("비었는데요?");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return answer;
	}

	


	public static String getArrayMin2(String participant[], String completion[]) {
		
		 String answer = "";
	        HashMap<String, Integer> hm = new HashMap<>();
	        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
	        for (String player : completion) hm.put(player, hm.get(player) - 1);

	        for (String key : hm.keySet()) {
	            if (hm.get(key) != 0){
	                answer = key;
	            }
	        }
	        return answer;
	    }
	}




			
			
		
	






