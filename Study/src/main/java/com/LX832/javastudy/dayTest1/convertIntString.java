package com.LX832.javastudy.dayTest1;

public class convertIntString {
	 
    public static void main(String[] args) {
    	String str = "select name, code from course where course.name='Java Programming'";
    	char []arr = str.toCharArray();
    	int indexFinding = 0;
    	for(int i = 0; i < arr.length; i++){
    	    if((arr[i] == 'n') && (arr[i+1] == 'a') && (arr[i+2] == 'm') && (arr[i+3] == 'e')){
    	        arr[i] = 'i'; arr[i+1] = 'd';
    	        for(int j = i+4 ; j < arr.length; j++){
    	            arr[j-2] = arr[j];
    	        }
    	        break;
    	        
    	    }
    	    System.out.println(new String(arr));
    	}
    }
}