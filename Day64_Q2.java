package com.scaler.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Day64_Q2 {

	public static void main(String[] args) {
		//		 A = 1, 5, 3, 4, 2]
		//				 B = 4
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(1);
		A.add(1);
		A.add(1);
		A.add(1);

		int B=0;
		solve(A,B);
	}
	public static int solve(ArrayList<Integer> A, int B) {

		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		HashMap<Integer,Integer> keypair = new HashMap<Integer, Integer>();


		Collections.sort(A);

		for(int i=0; i<A.size(); i++) {
			if(!map.containsKey(A.get(i))) {
				map.put(A.get(i), 1);
			}else {
				map.put(A.get(i), map.get(A.get(i))+1) ;
			}
		}

		List<Integer> newList = A.stream()
				.distinct()
				.collect(Collectors.toList());

		int ct=0;
		for(int i=0; i<newList.size(); i++) {

			if(B==0) {
				if (map.get(newList.get(i))>1) {
					ct++;
				}
			}else {

				int c=Math.abs(newList.get(i) +B);

				if(map.containsKey(c)) {
					keypair.put(Math.min(c, newList.get(i)), Math.max(c, newList.get(i)));
				}
			}
		}


		return keypair.size()+ct;
	}
}
