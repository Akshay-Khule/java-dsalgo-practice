package com.scaler.advance;

import java.util.ArrayList;
import java.util.HashMap;

public class Day65_Q5 {

	public static void main(String[] args) {
		//		 A = [1, 2, 1, 3, 4, 3]
		//				 B = 3
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(1);
		A.add(3);
		A.add(4);
		A.add(3);
		int B=3;
		dNums(A,B);
	}

	public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
		int i=0;
		int j=0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		ArrayList<Integer> a= new ArrayList<Integer>();
		while(j<A.size()) {
			if(!map.containsKey(A.get(j))) {
				map.put(A.get(j), 1);
			}else {
				int c= map.get(A.get(j));
				map.put(A.get(j), c+1);
			}
			if(j-i+1==B) {
				a.add(map.size());
				if(map.get(A.get(i))>1) {
					map.put(A.get(i), map.get(A.get(i))-1);
				}else {
					map.remove(A.get(i));	
				}
				i++;
			}
			j++;



		}

		return a;
	}	

}
