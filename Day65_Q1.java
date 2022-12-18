package com.scaler.advance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Day65_Q1 {

	public static void main(String[] args) {
		// A = [100, 4, 200, 1, 3, 2]
		List<Integer> A = new ArrayList<Integer>();
//		A.add(100);
//		A.add(4);
//		A.add(200);

//		A.add(3);
		A.add(2);
		A.add(1);	
		longestConsecutive(A);
	}
    public static int longestConsecutive(final List<Integer> A) {
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	
    	for(int i=0; i<A.size(); i++) {
    		if(!map.containsKey(A.get(i))) {
    			map.put(A.get(i), 1);
    		}else {
    			int c= map.get(A.get(i));
    			map.put(A.get(i), c+1);
    		}
    	}
    	int max=0;
    	for(int i=0; i<A.size(); i++) {
    		int c=A.get(i)-1;
    		int o=A.get(i);
    		int count=0;
    		if(!map.containsKey(c)) {
    			while(map.containsKey(o+1)) {
    				o++;
    				count++;
    			}
    		}
    		max=Math.max(max, count);
    	}
    	
    	
		return max+1;
    }
}
