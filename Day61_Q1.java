package com.scaler.advance;

import java.util.ArrayList;

public class Day61_Q1 {

	public static void main(String[] args) {
		//  [1, 3, 5, 6]
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(3);
		A.add(5);
		A.add(6);
		A.add(7);
		A.add(8);
		int B=4;
		
		System.out.println(searchInsert(A, B));
	}
    public static int searchInsert(ArrayList<Integer> A, int B) {
    	
    	int lo=0;
    	int hi=A.size()-1;
    	
    	while(lo<=hi) {
    		int mid=(lo+hi)/2;
    		if(A.get(mid)==B) {
    			return mid;
    		}else if(B<A.get(mid)) {
    			hi=mid-1;
    		}else if(B>A.get(mid)) {
    			lo=mid+1;
    		}
    	}
    	
		return lo;
    }
}
