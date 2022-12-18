package com.scaler.advance;

public class Day62_Q1 {

	public static void main(String[] args) {
		int A=2144;

		System.out.println(sqrt(A));
	}
	public static int sqrt(int A) {       
	int lo=1; int hi=A;
	int ans=0;
	while(lo<=hi) {
		int mid=(lo+hi)/2;

		if(mid*mid==A) {
			return mid;
		}else if(mid*mid>=A) {
			hi=mid-1;
			ans=hi;
		}else if(mid*mid<=A) {
			lo=mid+1;
			ans=lo;
		}
	}

	return ans;
	}
}
