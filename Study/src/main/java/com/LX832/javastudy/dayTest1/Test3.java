package com.LX832.javastudy.dayTest1;

public class Test3 {
	public static void main(String[] args) {
		Test3 mm = new Test3();
		mm.solution();
	}
		
	public int solution()  {
	    	
	    	int answer =0;
	    	int absolutes[] = {4,7,12};
	    	boolean signs[] = {true,false,true};
	   	for(int i = 0; i < absolutes.length; i++) {
	   		if(signs[i]) answer +=absolutes[i];
	   		else answer +=(absolutes[i]*-1);
	   		
	   	
	   	}
	    System.out.println(answer);   	
	    
	    return answer;
	
    }


}