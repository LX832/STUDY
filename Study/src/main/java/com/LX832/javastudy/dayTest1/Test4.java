package com.LX832.javastudy.dayTest1;


public class Test4 {
	
	public static void main (String[] args) {
		Test4 ww = new Test4();
		ww.solution();
	}
	
	 public void solution() {
		    
		 	int ranNum1 = (int)(Math.random() * 1001);  
		    
		    
		 	int ranNum2 = (int)(Math.random() * 1001);  
		    
		 	
		    int ranNum3 = (int)(Math.random() * 1001);  
		    
		    System.out.println(ranNum1+ranNum2+ranNum3);
		    
		 	int nl = 3000;
		 	for(int i =2; i <=nl; i++) {
		 		
		 	int j;
		 	for(j =2; j<i; j++) {
		 		if(i%j == 0) {
		 			break;
		 		}
		 	}
		 	if(j==i) {
		 	//	System.out.println(i);

		 	if((ranNum1+ranNum2+ranNum3)==i)
		 			System.out.println("소수입니다.");
		 			
		 	}
		 }
		 	
	 }
		   			   	     
	        
}	
	        

