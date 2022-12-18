package com.scaler.advance;

public class Day52_Q2 {

	public static void main(String[] args) {

		int A=5449763;
		int B=5079530;

		System.out.println(solve(A,B));
	}
	public static int solve(int A, int B) {

		int check=0;
		if(A<B) {
			check=A;
		}else {
			check=B;
		}


		System.out.println(Math.abs(A-B));

		for(int i=check; i>=1; i--) {
			int x=A%check ;
			int y=B%check ;

			if (x == y) {
				return check;
			}

			check--;
		}

		return -1;
	}
}
