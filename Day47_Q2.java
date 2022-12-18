package com.scaler.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day47_Q2 {

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>();
		A.add(3);
		A.add(1);
		A.add(2);
		A.add(4);
		A.add(0);
		A.add(1);
		A.add(3);
		A.add(2);


		trap(A);

	}

	public static int trap(final List<Integer> A) {




		List<Integer> left = new ArrayList<Integer>();


		Integer[] data = new Integer[A.size()];
		Arrays.fill(data,new Integer(0));
		List<Integer> right = Arrays.asList(data);


		left.add(0, A.get(0));
		int leftmax=A.get(0);
		for(int i=1; i<A.size(); i++) {
			leftmax = Math.max(leftmax, A.get(i));
			left.add(i,leftmax);
		}

		int rightmax=A.get(A.size()-1);
		right.set(A.size()-1, rightmax);
		for(int j=A.size()-2; j>=0; j--) {
			rightmax =Math.max(rightmax, A.get(j));
			right.set(j, rightmax);
		}
		int ans =0;
		for(int k=0; k<A.size(); k++) {
			ans = ans+ Math.min(left.get(k), right.get(k))-A.get(k);
		}


		return ans;


	}

}
