package com.scaler.advance;

import java.util.ArrayList;

public class Day49_Q1 {


	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		a.add(1);
		a.add(1);

		
		b.add(1);
		b.add(1);

		
		c.add(1);
		c.add(1);
	
		
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		A.add(a);
		A.add(b);

		
		
		System.out.println(solve(A));
	}
    public static int solve(ArrayList<ArrayList<Integer>> A) {
		
    	int sum =0;
    	int n=A.size();
    	
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<n; j++) {
    			int top_left = (i + 1) * (j + 1);
    			 int bottom_right = (n - i) * (n - j);
    			 sum += (top_left * bottom_right * A.get(i).get(j));
    		}
    	}
    	
    	return sum;
    }
}
