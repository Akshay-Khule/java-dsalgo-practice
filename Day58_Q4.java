package com.scaler.advance;

import java.util.ArrayList;

public class Day58_Q4 {

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>();

		A.add(6);
		A.add(3);
		A.add(2);
		A.add(1);
		A.add(0);
		A.add(8);
		solve(A);

	}
	public static int solve(ArrayList<Integer> A) {

		int last=Integer.MIN_VALUE;
		int seclast=Integer.MIN_VALUE;


		for(int i=0; i<A.size(); i++) {
			if(A.get(i)>last) {

				seclast=last;
				last=A.get(i);
			}else if(A.get(i)>seclast&&A.get(i)<last) {

				seclast=A.get(i);


			}
		}
		if(A.size()==1)
			return 0;

		if(seclast==Integer.MIN_VALUE)
			return 0;


		return seclast;
	}
}
