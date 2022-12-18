package com.scaler.advance;

import java.util.ArrayList;

public class Day64_Q3 {

	public static void main(String[] args) {
		//A = [1, 5, 4, 3]

		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);

		maxArea(A);
	}
	public static int maxArea(ArrayList<Integer> A) {
		
		int i=0;
		int j=A.size()-1;
		int ans=0;
		
		while(i<j) {
			
			int min = Math.min(A.get(i), A.get(j));
			int c= j-i;
			ans = Math.max(ans, min*c);
			
			if(min==A.get(i))
				i++;
			else if(min==A.get(j))
				j--;
		}
		
		return ans;
	}
}
