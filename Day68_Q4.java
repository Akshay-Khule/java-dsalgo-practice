package com.scaler.advance;

import java.util.HashMap;

public class Day68_Q4 {

	public static void main(String[] args) {

		String A= "abcaabcdba";
		//dadbc
		lengthOfLongestSubstring(A);

	}
	public static int lengthOfLongestSubstring(String A) {
		int i=0;
		int j=0;
		int max=Integer.MIN_VALUE;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		if(A.length()==1) {
			return 1;
		}
		while(j<A.length()) {
			if(!map.containsKey(A.charAt(j))) {
				map.put(A.charAt(j), j);
			}else {
				 max=Math.max(max, j-i+1);
//				while(map.containsKey(A.charAt(j))) {
//					map.remove(A.charAt(i));
//					i++;
//				}
				int a= map.get(A.charAt(j));
				 
				 map.remove(A.charAt(a));
     			 map.put(A.charAt(j), j);
     			 i=map.get(A.charAt(j));
				
			}
			j++;
		}
		max=Math.max(max, j-i+1);

		return max;
	}
}
