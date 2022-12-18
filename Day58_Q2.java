package com.scaler.advance;

import java.util.ArrayList;
import java.util.List;

public class Day58_Q2 {

	public static void main(String[] args) {

		//		A = [2, 1, 4, 3, 2]
		//				B = 3
		List<Integer> A = new ArrayList<Integer>();
		A.add(3);
		A.add(1);
		A.add(4);
		A.add(5);
		A.add(2);
		A.add(9);
		
		int B=1;

		
		System.out.println(kthsmallest(A,B));

	}
	public static int kthsmallest(final List<Integer> A, int B) {
		
		List<Integer>  list = new ArrayList<Integer>();
		for(int i=0; i<A.size(); i++) {
			list.add(A.get(i));
		}

		int k=1;
		int z=0;
		for(int i=0; i<B; i++) {
			int max=Integer.MAX_VALUE;
			for(int j=0; j<list.size()-i; j++) {
				if(list.get(j)<max) {
					max=list.get(j);
					z=j;
				}
			}
			swap(list, z, list.size()-k-i);

		}
		
		int res = list.get(list.size()-B);

		return res;
	}
	private static void swap(List<Integer> A, int z, int last) {

		int tmp=A.get(last);
		A.set(last, A.get(z));
		A.set(z, tmp);


	}
}
