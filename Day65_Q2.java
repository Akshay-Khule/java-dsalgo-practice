package com.scaler.advance;

import java.util.HashMap;

public class Day65_Q2 {

	public static void main(String[] args) {
		int[] A = new int[]{1,1};
		solve(A);
	}
	public static int solve(int[] A) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int ans=-1;
		int min=Integer.MAX_VALUE;
		
		for(int i=0; i<A.length; i++) {
			if(!map.containsKey(A[i])) {
				map.put(A[i], i);
			}else {
				int val = map.get(A[i]);
				int c = Math.abs(val-i);
				min= Math.min(min, c);
			}
		}
		
		if(min==Integer.MAX_VALUE)
			return -1;
		
		return min;
	}
}
