package com.scaler.advance;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day68_Q3 {

	public static void main(String[] args) {

		String A = "sabcdc";
		String	 B = "acc";
		minWindow(A,B);

	}
	public static String minWindow(String A, String B) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		StringBuilder s= new StringBuilder();
		for(int i=0; i<B.length(); i++) {
			if(!map.containsKey(B.charAt(i))) {
				map.put(B.charAt(i), 1);
			}else {
				int n = map.get(B.charAt(i));
				map.put(B.charAt(i), n+1);
			}
		}
		int count=0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			count=count+entry.getValue();
		}
		int val=count;

		int i=0;
		int j=0;

		int min=Integer.MAX_VALUE;

		while(j<A.length()) {
			if(map.containsKey(A.charAt(j))) {
				count--;
			}
			if(count ==0) {
				min=Math.min(min, j-i+1);
				count=val;
			}
			j++;
		}

		for(int k=i; k<j; k++) {
			s.append(A.charAt(k));
		}

		return s.toString();
	}
}
