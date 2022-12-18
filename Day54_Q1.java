package com.scaler.advance;

import java.util.ArrayList;

public class Day54_Q1 {

	public static void main(String[] args) {
		ArrayList<Integer> A= new ArrayList<Integer>();
		A.add(16);


		solve(A);
	

	}

	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int i=0; i<A.size(); i++) {
			int n= CountOfDivisors(A.get(i));
			ans.add(n);
		}
		System.out.println(ans);
		return ans;
	


	}

	private static int  CountOfDivisors(Integer n) {

		int count=0;
		for(int i=1; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                // If divisors are equal,
                // count only one
                if (n / i == i)
                	count++;
 
                else // Otherwise count both
                	count = count + 2;
            }
		}

		return count;

	}
}

