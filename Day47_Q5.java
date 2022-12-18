package com.scaler.advance;

import java.util.ArrayList;
import java.util.HashMap;

public class Day47_Q5 {

	public static void main(String[] args) {
		//-5, 2, 0, -1, -10, 15
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(-1);
		A.add(2);
		A.add(-2);
		A.add(4);	
;	
		System.out.println(firstMissingPositive(A));
	}
    public static int firstMissingPositive(ArrayList<Integer> A) {
    	
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	for(int i=0; i<A.size(); i++) {
    		if(map.containsKey(A.get(i))) {
    			map.put(A.get(i), map.get(A.get(i))+1);
    		}else {
    			map.put(A.get(i), 1);
    		}
    	}
    	

    	if(A.size()==1 && !(A.get(0)<0)) {
    		return A.get(0)+1;
    	}else if(A.size()==1 && (A.get(0)<0))  {
    		return 1;
    	}
    	int i=0;

    	for(i=1; i<A.size()+1; i++) {
    		if(map.containsKey(i)) {
    			continue;
    		}else {
    			return i;
    		}
    	}
    	
		return (A.get(A.size()-1)+1);
    }
}
