package com.scaler.advance;

public class Day56_Q1 {

	public static void main(String[] args) {
		solve(83557);
		System.out.println(solve(83557));

	}
    public static int solve(int A) {
    	
    	if(A==0)
    		return 0;
    	
    	int x= A%10;
    	return x+solve(A/10);

    }
}
