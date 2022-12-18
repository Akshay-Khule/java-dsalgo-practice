package com.scaler.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Day51_Q1 {

	public static void main(String[] args) {
		//A = [1, 2, 3, 1, 2, 4]
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(1);
		A.add(2);
		A.add(4);
		
		System.out.println(solve(A));
		
	}
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		 ArrayList<Integer> ans = new ArrayList<Integer>();

		for(int i=0; i<A.size(); i++) {
			if(!map.containsKey(A.get(i))) {
				map.put(A.get(i), 1);
			}else {
				map.put(A.get(i), map.get(A.get(i))+1);
			}
		}
    	
		for(Entry<Integer,Integer> entry :map.entrySet()) {
			if(entry.getValue()==1) {
				ans.add(entry.getKey()) ;
			}
		}		
		Collections.sort(ans);
    	return ans;
    }
}
