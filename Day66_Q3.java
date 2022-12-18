package com.scaler.advance;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Day66_Q3 {

	public static void main(String[] args) {
		int  A = 3;
		// B = "bbaabb"
		String B="abcabcabc";
		solve(A,B);

	}
	public static int solve(int A, String B) {
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		if(B.length()%A!=0) {
			return -1;
		}
		if(A==1)
			return 0;

		for(int i=0; i<B.length(); i++) {
			if(!map.containsKey(B.charAt(i))) {
				map.put(B.charAt(i), 1);
			}else {
				int b=map.get(B.charAt(i));
				map.put(B.charAt(i), b+1);
			}
		}

		Iterator<Entry<Character, Integer>> it=	map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Character, Integer> entry =it.next();
			if(	entry.getValue()%A!=0) {
				return -1;
			}
		}

		return 1;
	}
}
