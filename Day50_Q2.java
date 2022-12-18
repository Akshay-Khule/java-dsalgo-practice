package com.scaler.advance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Day50_Q2 {

	public static void main(String[] args) {
		//1, 2, 4, 3, 3, 2, 2, 3, 1, 1]

		List<Integer> A  = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(4);
		A.add(3);
		A.add(3);
		A.add(2);
		A.add(2);
		A.add(3);
		A.add(1);
		A.add(1);

		
		System.out.println(singleNumber(A));

	}
	public static int singleNumber(final List<Integer> A) {

		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

		for(int i=0; i<A.size(); i++) {
			if(!map.containsKey(A.get(i))) {
				map.put(A.get(i), 1);
			}else {
				map.put(A.get(i), map.get(A.get(i))+1);
			}
		}

		for(Entry<Integer,Integer> entry :map.entrySet()) {
			if(entry.getValue()<3) {
				return entry.getKey();
			}
		}

		return -1;


	}
}
