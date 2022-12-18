package com.scaler.advance;

import java.util.ArrayList;
import java.util.Collections;

public class Day63_Q2 {

	public static void main(String[] args) {//1,2,8,4,9
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(8);
		A.add(4);
		A.add(9);
		int B=3;
		solve(A, B);

	}
	public static int solve(ArrayList<Integer> A, int cow) {
		Collections.sort(A);
		int lo=1;
		int hi=A.get(A.size()-1)-A.get(0);

		while(lo<=hi) {
			int mid=(lo+hi)/2;

			if (ifpossible(A,mid,cow)){
				lo=mid+1;
			}else {
				hi=mid-1;
			}
			

		}

		return hi;
	}
	private static boolean ifpossible(ArrayList<Integer> a, int mid, int cow) {
		int index=a.get(0);
		cow--;
		for(int i=1; i<a.size(); i++) {
			if(a.get(i)-index>=mid) {
				cow--;
				index=a.get(i);
			}
			if(cow==0)
				return true;
		}

		return false;
	}
}
