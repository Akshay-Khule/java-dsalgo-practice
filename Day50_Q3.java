package com.scaler.advance;

public class Day50_Q3 {

	public static void main(String[] args) {
		int A=9;
		
		System.out.println(numSetBits(A));
	}
    public static int numSetBits(int A) {
    	char one='1';
    	String binary = Integer.toBinaryString(A);
		int ct=0;
    	for(int i=0; i<binary.length(); i++) {
    		if(binary.charAt(i)==one) {
    			ct++;
    		}
    	}
    	
    	return ct;
		

    }
}
