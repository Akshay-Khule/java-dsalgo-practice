package com.scaler.advance;

import java.util.ArrayList;

public class Day62_Q2 {

	public static void main(String[] args) {
		//		A = [5, 17, 100, 11]// 5, 10, 20, 100, 105
		//		B = 130
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		A.add(100);

		int B=10;
		
		System.out.println(solve(A, B));

	}
	public static int solve(ArrayList<Integer> A, int B) {
		

		
		
		int lo=1;
		int hi=A.size();
		int ans=0;

		while(lo<=hi) {
			int mid=(lo+hi)/2;

			if(check(A, mid,  B)) {
				ans=Math.max(ans, mid);
				lo=mid+1;
			}else {
				hi=mid-1;
			}
		}

		return ans;
	}



	private static boolean check(ArrayList<Integer> a, int k, int c) {

		int i=0;
		int j=0;

		int ans=0;

		while(j<a.size()) {
			ans=ans+a.get(j);
			if(ans>c) {
				return false;
			}
			if(k==j-i+1) {
				ans=ans-a.get(i);
				i++;
			}
			j++;
		}
		return true;
	}	
	//	private static int getSubarray(int mid, ArrayList<Integer> A) {
	//
	//		for(int i=0; i<A.size(); i++) {
	//			for(int j=i; j<=A.size()-1; j++ ) {
	//				for(int k=i; k<=j; k++) {
	//					System.out.print(A.get(k)+ " ");
	//				}
	//				System.out.println();
	//			}
	//			System.out.println();
	//		}
	//
	//		return 0;
	//	}
}
