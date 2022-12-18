package com.scaler.advance;

import java.math.BigInteger;
import java.util.ArrayList;

public class Day60_Q1 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		int c = solve(a);
		System.out.println(c);
		

	}
    public static int solve(ArrayList<Integer> c) {
		
    	ArrayList<ArrayList<Integer>> ls =printSubsequences(c);
    	int ans=0;
		for(ArrayList<Integer> a: ls) {
			if(a.size()>1) {
				int start = a.get(0);
				int end = a.get(a.size()-1);
				ans = ans+(end-start);
			}
		}
    	return ans;
    }
    
	static ArrayList<ArrayList<Integer>> printSubsequences(ArrayList<Integer> c)
	{

		int d= c.size();

		int opsize = (int)Math.pow(2, d);

		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		for (int counter = 1; counter < opsize; counter++)
		{		ArrayList<Integer> list = new ArrayList<>();
			for (int j = 0; j < d; j++)
			{

				  
				if ( java.math.BigInteger.valueOf(counter).testBit(j))
					list.add(c.get(j));
			}
			a.add(list);

		}
		return a;
	}
}
