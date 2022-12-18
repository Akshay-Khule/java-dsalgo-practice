package com.scaler.advance;

import java.util.ArrayList;

public class Day64_Q1 {

	//	 A = [1, 2, 3, 4, 5]
	//			 B = 5	


	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		
		int B=5;
		
		System.out.println(solve(A,B));


	}
	public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
		
		int i=0;
		int j=0;
		
		int sum=0;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ArrayList<Integer> empty = new ArrayList<Integer>();
		empty.add(-1);
		while(j<A.size()) {
			sum=sum+A.get(j);
			ans.add(A.get(j));
			j++;
			
			if(sum==B) {
				return ans;
			}else if(sum>B) {
				while(sum>B) {
					sum=sum-A.get(i);
					ans.remove(A.get(i));
					i++;
				}
				if(sum==B)
					return ans;
			}
		}
		
		return empty;
	}
}
