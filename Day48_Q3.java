package com.scaler.advance;

import java.util.ArrayList;

public class Day48_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5, -2, 3 , 1, 2

		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(5);
		A.add(-2);
		A.add(3);
		A.add(1);
		A.add(2);
		int B=3;
		solve(A, B);

	}
	public static int solve(ArrayList<Integer> A, int B) {
		int max = Integer.MIN_VALUE;
		int sum=0;

		for(int i=0; i<B; i++) {
			sum=sum+A.get(i);
		}
		max = Math.max(sum, max);
		int k=B-1;
		for(int i=A.size()-1; i>0; i--) {

			if(k>=0) {
				sum=sum+A.get(i);
				sum=sum-A.get(k);
				k--;
				max= Math.max(sum, max);
			}
		}

		return max;
	}
}
