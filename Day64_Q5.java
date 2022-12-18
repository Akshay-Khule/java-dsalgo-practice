package com.scaler.advance;

import java.util.ArrayList;
import java.util.HashMap;

public class Day64_Q5 {

	public static void main(String[] args) {
		// 2, 2, 3, 4, 4, 5, 6, 7, 10
		//B=8
		ArrayList<Integer> A= new ArrayList<Integer>();
		A.add(2);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(4);
		A.add(5);
		A.add(6);
		A.add(7);
		A.add(10);
		int B=8;
		solve(A, B);
	}
	public static int solve(ArrayList<Integer> A, int B) {
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

		for(int i=0; i<A.size(); i++) {
			if(!map.containsKey(A.get(i))) {
				map.put(A.get(i), 1);
			}else {
				map.put(A.get(i), map.get(A.get(i))+1) ;
			}
		}


		int i=0;
		int j=A.size()-1;




		int count=0;
		int mod = 1000*1000*1000+7;
		while(i<j) {
			if(A.get(i)+A.get(j)>B) {
				j--;
			}else if(A.get(i)+A.get(j)<B) {
				i++;
			}else {
				int a =map.get(A.get(i));
				int b =map.get(A.get(j));
				if(A.get(i)!=A.get(j)) {


					int c=0;
					c=a*b%mod;
					count=count+c;
				}else {
					int x=j-i+1;
					x=map.get(A.get(i));
					count=(count+(x*(x-1)/2))%mod;
				}

				i=i+a;
				j=j-b;
			}

		}



		return count;
	}
}
