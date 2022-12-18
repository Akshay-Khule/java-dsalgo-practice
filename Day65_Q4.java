package com.scaler.advance;

import java.util.ArrayList;
import java.util.HashMap;

public class Day65_Q4 {

	public static void main(String[] args) {
		// A = -19, 8, 2, -8, 19, 5, -2, -23
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(-19);
		A.add(8);
		A.add(2);
		A.add(-8);
		A.add(19);
		A.add(5);
		A.add(-2);
		A.add(23);

		lszero(A);
	}
	public static ArrayList<Integer> lszero(ArrayList<Integer> A) {
		ArrayList<Long> prefix = new ArrayList<Long>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		HashMap<Long,Long> map = new HashMap<Long,Long>();
		prefix.add(A.get(0).longValue());
		long start=0;
		long end=0;
		long max=Integer.MIN_VALUE;
		map.put(prefix.get(0), Long.valueOf(0));
		for(int i=1; i<A.size(); i++) {
			prefix.add(i, (prefix.get(i-1)+A.get(i).longValue()));

			if(prefix.get(i)==0) {
				start=0;
				end=i;
			}

			if(map.containsKey(prefix.get(i))) {
				long index = map.get(prefix.get(i));
				index=index+1;

				if(i-index+1>max) {
					start=index;
					end=i;
					max=i-index+1;
				}
			}else {
				map.put(prefix.get(i), Long.valueOf(i));
			}


		}
		if(start==0 && end==0  ) {

			if(A.get(0)==0) {
				ans.add((A.get((0))));
			}
		}else {
			for(long i=start; i<=end; i++) {
				ans.add((A.get((int) i)));
			}
		}



		int l=0;
		int m=0;
		int ct=0;
		int mx=Integer.MIN_VALUE;
		ArrayList<Integer> ans1 = new ArrayList<Integer>();
		int s1 = 0;
		int e1 = 0;
		boolean b=false;
		while(m<A.size()) {
			ct=ct+A.get(m);

			if(ct==0) {
				b=true;
				if(m-l>mx) {

					mx=m-l;
					s1=l;
					e1=m;

				}
			}
			m++;

		}

		if(b) {
		for(int i=s1; i<=e1; i++) {
			ans1.add(A.get(i));
		}
		}
		if(ans.size()>ans1.size()) {
			return ans;
		}else
			return ans1;

	}
}
