package com.scaler.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Day59_Q2 {

	public static void main(String[] args) {
		// A = [3, 30, 34, 5, 9]

		List<Integer> A = new ArrayList<Integer>();
		A.add(0);
		A.add(0);
		A.add(0);
		A.add(0);

		largestNumber(A);
	}
	public static String largestNumber(final List<Integer> A) {
		List<String> str = new ArrayList<String>();
		for(int i=0; i<A.size(); i++) {
			str.add(A.get(i).toString());
		}

		Collections.sort(str, new Comparator<String>() {

			@Override
			public int compare(String x, String y) {
				String xy=x+y;
				String yx=y+x;
				if(xy.compareTo(yx)>0) {
					return -1;
				}else
					return 1;
				}
		});
		

		
		
		String ans="";
		for(String s: str) {
			if(s.equals("0"))
				return "0";
			ans=ans+s;
		}
		
		return ans;


	}
}
