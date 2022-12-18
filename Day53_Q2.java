package com.scaler.advance;

public class Day53_Q2 {

	public static void main(String[] args) {
		String A = "1";
		String B = "4232323233";


		
		System.out.println(solve(A, B));

	}
	public static String solve(String A, String B) {

		long a = Long.valueOf(A);
		long b= Long.valueOf(B);

		long n = solve(a, a+1);

		for(long i=a+2; i<=b; i++) {
			n= solve(n,i);
		}


		return  String.valueOf(n);
	}

	private static long solve(long n1, long n2) {

		while(n1%n2!=0) {
			long rem = n1%n2;
			n1=n2;
			n2=rem;
		}
		long gcd=n2;
		return gcd;


	}
}
