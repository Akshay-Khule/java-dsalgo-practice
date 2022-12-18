package com.scaler.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day48_Q1 {

	public static void main(String[] args) {
		//		A = 5
		//		B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> a0 = new ArrayList<Integer>();
		a0.add(1);
		a0.add(3);
		a0.add(10);
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(6);
		a1.add(9);
		a1.add(2);

		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(3);
		a2.add(5);
		a2.add(3);		

		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(2);
		a3.add(8);
		a3.add(4);	
		
		ArrayList<Integer> a4 = new ArrayList<Integer>();
		a4.add(6);
		a4.add(7);
		a4.add(5);	
		
		B.add(a0);
		B.add(a1);
		B.add(a2);
		B.add(a3);
		B.add(a4);
		
		int A=10;

		solve(A,B);
	}
	public static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {

		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		List<Integer> list = new ArrayList<Integer>(Collections.nCopies(A, 0));

		for(int i=0; i<B.size(); i++) {
			
			int start = B.get(i).get(0);
			int end =   B.get(i).get(1);
			list.set(start-1, list.get(start-1) + B.get(i).get(2));
			if(end<A) {
			list.set(end, (list.get(end) + (-B.get(i).get(2))));
			}
		}
//		
//		for(ArrayList<Integer> l :B) {
//			list.set(  l.get(0)-1, list.get(l.get(0)-1) + l.get(2));
//			if(l.get(1)<A) {
//				list.set(l.get(1), -l.get(2));
//			}
//		}
//		
		ans.add(0, list.get(0));
		for(int i=1; i<list.size(); i++) {
		 ans.add(ans.get(i-1)+list.get(i));	
		}


		return ans;
	}
}
