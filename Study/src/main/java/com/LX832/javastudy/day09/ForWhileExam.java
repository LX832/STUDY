package com.LX832.javastudy.day09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ForWhileExam {
	
	public void forWhileTest01() {
		for(int i=0; i < 5; i++) {
		    System.out.println("길동좌");
	}
		System.out.println("\n호잇호잇호잇호잇호잇호잇호잇호잇");
		
		int j = 0;
		while(j<4) {
			System.out.print("둘리");
			j=j+1;
			if( j == 4 ) {
				break; 
			}
			
		}
		System.out.println();
	}
	
	public void forWhileTest02() {
		Set<String> set = new HashSet<String>();
		set.add("그게뭔데");
		set.add("으아아아아아");
		set.add("그게뭔데");
	
 	    Iterator<String> iter = set.iterator();
	    while(iter.hasNext()) {
		//반복 유무를 판단하는 구문에서 주로 메소드의 호출을 통해서 
		System.out.println(iter.next());
						
    	}
	    
	}

	public void forWhileTest03() {
			
 	    int i = 0;
	    while(i<5) {
		//반복 유무를 판단하는 구문에서 주로 메소드의 호출을 통해서 
		    System.out.println("또 치");
		    i++;
						
    	}
	    
	}
	public void forWhileTest04() {
		
 	    int i = 0;
	    while(i > 4) {
		 
		    System.out.println("도 우 너");
		    i++;
	    }
	    System.out.println("=============");
	    
	    int j = 0;
	    do {
	    	System.out.println("도 우 너");
		    j++;
		    
	    }while(j > 4);
	    System.out.println("호의가 계속되면 둘리인줄 안다.");

    }
	public void forWhileTest05() {
		
		int sum = 0;
		for(int i = 0; i<=10; i++) {
			if(i % 2 == 0) {
			   continue;
			}
			sum = sum + i;
		}	
			System.out.println("홀수의 합 : " + sum);
			
	}
}
