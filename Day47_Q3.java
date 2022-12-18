package com.scaler.advance;

import java.util.ArrayList;
import java.util.List;

public class Day47_Q3 {

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>();
		//-2, 1, -3, 4, -1, 2, 1, -5, 4
//		A.add(-2);
//		A.add(1);
//		A.add(-3);
//		A.add(4);
//		A.add(-1);
//		A.add(2);
//		A.add(1);
//		A.add(-5);
//		A.add(4);
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(-10);
//
//		A.add(-163);
//		A.add(-20);		
		maxSubArray(A);

	}
    public static int maxSubArray(final List<Integer> A) {
    	
    	int i=0;
    	int j=0;
    	int max= Integer.MIN_VALUE;
    	
    	int sum=0;
    	
    	
    	while(j<A.size()) {
    		sum=sum+A.get(j);
    		max= Math.max(sum, max);
    		if(sum>0) {
    			j++;
    		}else {
    			sum=0;
    			i++;
    			j=i;

    		}
    		
    	}
    	
		return max;
    }
}
