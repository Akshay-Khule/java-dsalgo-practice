package com.scaler.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day48_Q3_2nd {

	public static void main(String[] args) {
		//		A = 5
		//		B = [[1, 2, 10], [2, 3, 39 20], [2, 5, 25]]
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(10);

		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(2);
		a2.add(3);
		a2.add(20);		

		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(2);
		a3.add(5);
		a3.add(25);	

		B.add(a1);
		B.add(a2);
		B.add(a3);

		int A=5;

		solve(A,B);

	}
	public static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		ArrayList<Integer> list = new ArrayList<Integer>(Collections.nCopies(A, 0));
		for(ArrayList<Integer> l :B) {
			for(int i=l.get(0); i<=l.get(1); i++) {
				list.set(i-1, list.get(i-1)+l.get(2));
			}
		}
		
		return list;
		
		
	}
}

