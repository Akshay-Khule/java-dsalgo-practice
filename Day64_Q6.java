package com.scaler.advance;

import java.util.ArrayList;
import java.util.HashMap;

public class Day64_Q6 {

	public static void main(String[] args) {
//	    A = [5, 10, 20, 100, 105]
//	    	    B = 110
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(5);
		A.add(10);
		A.add(20);
		A.add(100);
		A.add(105);
		int B=110;
		
		solve(A, B);

	}
    public static int solve(ArrayList<Integer> A, int B) {
		HashMap<Integer, Integer> map = new HashMap<>();
    	for(int i=0; i<A.size(); i++) {
    			map.put(A.get(i), 1);
    		}
    	
		int count=0;
    	for(int i=0; i<A.size(); i++) {
    		int c=B-A.get(i);

    		if(map.containsKey(c) && A.get(i)<c) {
    			count++;
    		}
    	}
    	
    	return count;
    }
}
