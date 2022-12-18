package com.scaler.advance;

import java.util.ArrayList;
import java.util.Collections;

public class Day53_Q1 {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(15);
		a.add(24);
		a.add(18);
		a.add(30);
		solve(a);
		System.out.println(		solve(a));

	}
	public static int solve(ArrayList<Integer> A) {

		int currentGCD= Integer.MIN_VALUE;
		int finalGCD =		 Integer.MIN_VALUE;
		ArrayList<Integer> prefixA = new ArrayList<Integer>();
		prefixA.add(A.get(0));

		for(int i=1; i<A.size(); i++) {
			int n = solve(prefixA.get(i-1), A.get(i));	
			prefixA.add(n);
		}


		ArrayList<Integer> suffixA = new ArrayList<Integer>(Collections.nCopies(A.size(), 0));
		suffixA.set(A.size()-1, A.get(A.size()-1));    	
		for(int i=A.size()-1; i>0; i--) {
			int n = solve(suffixA.get(i), A.get(i-1));	
			suffixA.set(i-1,n);
		}



		for(int i=0; i<A.size(); i++) {
			if(i==0) {
				currentGCD =  suffixA.get(i+1);
				finalGCD = Math.max(currentGCD, finalGCD);
			}else if(i==A.size()-1) {
				currentGCD = prefixA.get(A.size()-2);
				finalGCD = Math.max(currentGCD, finalGCD);
			}
			else {

				currentGCD = solve(prefixA.get(i-1),suffixA.get(i+1));
				finalGCD = Math.max(currentGCD, finalGCD);
			}



		}
		return finalGCD;
	}

	private static int solve(int n1, int n2) {

		while(n1%n2!=0) {
			int rem = n1%n2;
			n1=n2;
			n2=rem;
		}
		int gcd=n2;
		return gcd;


	}
}
