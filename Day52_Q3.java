package com.scaler.advance;

public class Day52_Q3 {

	public static void main(String[] args) {
		int A= 2;
		int B= 4;
		int C= 1;


		System.out.println(pow(A,B,C));
	}
	public static int pow(int A, int B, int C) {
		int ans=1;

		
		int nn=B;
		if(nn==0){
			return 1;
		}
		while(nn>0) {
			if(nn%2==0) {
				A=A*A;
				nn=nn/2;

			}else {
				ans=ans*A;
			 nn--;
			}
		}
		System.out.println("power"+ ans);

		ans =Math.floorMod(ans, C);

	
		return ans;
	}
}
