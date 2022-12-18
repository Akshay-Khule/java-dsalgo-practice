package com.scaler.advance;

import java.util.ArrayList;
import java.util.Collections;

public class Day58_Q3 {

	public static void main(String[] args) {
		// A = [3, 2, 1, 4, 5]

		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);


	
		System.out.println(	solve(A));

	}
	public static int solve(ArrayList<Integer> A) {
//		int k=1;
//		for(int i=0; i<A.size(); i++) {
//			int max=Integer.MIN_VALUE;
//			int last=0;
//
//			for(int j=0; j<A.size()-i; j++) {
//				if (A.get(j)>max) {
//					max=A.get(j);
//					last=j;
//				}
//			}
//			swap(A,last,A.size()-k );
//			k++;
//		}
		Collections.sort(A);
		int data = A.get(0);
		for(int i=1; i<A.size(); i++) {
			if(A.get(i)==data+1 ) {
				data=data+1;
				continue;
			}
			else {
				return 0;
			}
			

		}

		return 1;
	}
	private static void swap(ArrayList<Integer> a, int last, int i) {
		int tmp = a.get(i);
		a.set(i, a.get(last));
		a.set(last, tmp);
	}
}
