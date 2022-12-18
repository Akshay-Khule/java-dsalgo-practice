package com.scaler.advance;

import java.util.ArrayList;
import java.util.List;

public class Day61_Q3 {

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>();
		A.add(4);
		A.add(5);
		A.add(6);
		A.add(7);
		A.add(8);
		A.add(0);
		A.add(1);
		A.add(2);
		A.add(3);


		int B=3;
		
		System.out.println(search(A, B));

	}
	public static int search(final List<Integer> A, int T) {

		int lo=0;
		int hi=A.size()-1;

		while(lo<=hi) {
			int mid=(lo+hi)/2;

			if(A.get(mid)==T) {
				return A.get(mid);
			}else if(A.get(lo) <= A.get(mid) ) {
				if(T>=A.get(lo) && T<A.get(mid)) {
					hi=mid-1;
				}else
					lo=mid+1;
			}else {
				if (T>A.get(mid) && T<=A.get(hi)) {
					lo=mid+1;
				}else {
					hi=mid-1;
				}
			}


		}
		return -1;
	}
}


