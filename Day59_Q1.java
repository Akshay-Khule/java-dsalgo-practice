package com.scaler.advance;

import java.util.ArrayList;

public class Day59_Q1 {

	public static void main(String[] args) {
	
		ArrayList<Integer> A= new ArrayList<Integer>();
		A.add(1);
		A.add(3);
		A.add(2);
		A.add(4);
		A.add(2);

		
		solve(A);
	}
    public static int solve(ArrayList<Integer> A) {
    	// If i < j and A[i] > A[j],
    	long ct=0;
    	for(int i=0; i<A.size(); i++) {
    		for(int j=i+1; j<A.size(); j++) {
    			if(A.get(i)>A.get(j)) {
    				ct++;
    			}
    		}
    	}
		
    	return (int) ct;
    }
}
