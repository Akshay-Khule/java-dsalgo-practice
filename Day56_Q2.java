package com.scaler.advance;

public class Day56_Q2 {

	public static void main(String[] args) {
		
		System.out.println(solve(1291));

	}
    public static int solve(int A) {
    	int n=calc(A);
    	if(n==1) {
    		return 1;
    	}else if(Integer.toString(n).length()==1) {
    		return 0;
    	}
    	
    	
    	return solve(n);
    }
    
    public static int calc(int A) {
    	
    	if(A==0)
    		return 0;
    	
    	int x= A%10;
    	return x+calc(A/10);

    }
}
