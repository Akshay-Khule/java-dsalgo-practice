package com.scaler.advance;

import java.util.ArrayList;

public class Day60_Q2 {

	public static void main(String[] args) {


		// A = [1, 4, 10, 2, 1, 5]
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(3);
		list.add(8);
		list.add(15);
		list.add(14);
		list.add(22);
		list.add(23);
		list.add(32);
		list.add(45);
		list.add(12);
		list.add(90);
		list.add(22);
		list.add(25);
		list.add(66);
		list.add(46);
		list.add(97);
		list.add(15);
		list.add(14);
		list.add(22);
		list.add(23);
		list.add(32);
		list.add(45);
		list.add(12);
		list.add(90);
		list.add(15);
		list.add(14);
		list.add(22);
		list.add(23);
		list.add(32);
		list.add(45);
		list.add(12);
		list.add(90);
		solve(list);
	}

	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		int s=0;
		int e=A.size()-1;
		
		sort(A,s,e);
		System.out.println(A);
		return A;
	}

	private static void sort(ArrayList<Integer> a, int s, int e) {
		
		if(s>=e) {
			return;
		}
			
		int index= arearragne(a,s,e );
		//System.out.println(index);
		sort(a, s, index-1);
		sort(a,index+1,e);
	}


	private static int arearragne(ArrayList<Integer> a, int s, int e) {

		// int reference = a.get(s);
		int p1=s+1; //all ele lesser that 10
		int p2=e;  //all ele greter that 10
		while(p1<=p2) {
			if(a.get(p1)<a.get(s)) {
				p1++;
			}else if(a.get(p2)>a.get(s)) {
				p2--;
			}else {		
				swap(a, p1, p2);
				p1++;
				p2--;
			}
		}
		swap(a, s, p2);

		return p2;


	}

	private static void swap(ArrayList<Integer> a, int i, int j) {
		int tmp =  a.get(i);
		a.set(i, a.get(j));
		a.set(j, tmp);

	}
}
