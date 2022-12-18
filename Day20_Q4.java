package com.scaler.advance;

public class Day20_Q4 {

	public static void main(String[] args) {
		int A=1065024;
		
		System.out.println(solve(A));
	}
	public static int solve(int A) {
		int lo=0;
		int hi=A/2;

		while(lo<=hi) {

			long mid=  lo+(hi-lo)/2;
			long sq=mid*mid;
			if(sq==A) {
				return (int) mid;
			}else if(sq>A) {
				hi=(int) (mid-1);
			}else if(sq<A) {
				lo=(int) (mid+1);
			}
			
			
		}

		return -1;
	}
}
