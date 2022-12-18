package com.scaler.advance;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Day49_Q2 {


	public static void main(String[] args) {


		//		 A = [   [5, 17, 100, 11]
		//		         [0, 0,  2,   8]    ]

				ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		
				ArrayList<Integer> a = new ArrayList<Integer>();
				a.add(1);
				a.add(5);
				a.add(2);
				a.add(3);
		
				ArrayList<Integer> b = new ArrayList<Integer>();
				b.add(7);
				b.add(2);
				b.add(3);
				b.add(4);
		
				ArrayList<Integer> c = new ArrayList<Integer>();
				c.add(3);
				c.add(4);
				c.add(2);
				c.add(5);

				ArrayList<Integer> d = new ArrayList<Integer>();
				d.add(8);
				d.add(4);
				d.add(1);
				d.add(3);				
				
				A.add(a);
				A.add(b);
				A.add(c);
				A.add(d);
		
		
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(1);
		B.add(1);

		ArrayList<Integer> C = new ArrayList<Integer>();
		C.add(1);
		C.add(4);		

		ArrayList<Integer> D = new ArrayList<Integer>();
		D.add(2);
		D.add(2);			

		ArrayList<Integer> E = new ArrayList<Integer>();
		E.add(2);
		E.add(4);		
//
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		ArrayList<Integer> b = new ArrayList<Integer>();
//		ArrayList<Integer> c = new ArrayList<Integer>();
//		a.add(1);
//		a.add(2);
//		a.add(3);
//
//		b.add(4);
//		b.add(5);
//		b.add(6);
//
//
//		c.add(7);
//		c.add(8);
//		c.add(9);
//
//		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
//		A.add(a);
//		A.add(b);
//		A.add(c);



		solve( A, B, C, D, E);

	}
	public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D, ArrayList<Integer> E) {

		ArrayList<ArrayList<Integer>> preA = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> preB = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> preC = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ans = new ArrayList<Integer>();

		for(int i=0; i<A.size(); i++) {
			ArrayList<Integer> prea = new ArrayList<Integer>();
			prea.add(0, A.get(i).get(0));
			for(int j=1; j<A.get(i).size(); j++) {
				prea.add(prea.get(j-1) + A.get(i).get(j));
			}
			preA.add(prea);
		}



		int size=preA.get(0).size();		
		for(int i=0; i<size; i++) {
			ArrayList<Integer> preb = new ArrayList<Integer>();
			preb.add(0, preA.get(0).get(i));
			for(int j=1;j<preA.size(); j++) {
				preb.add(preb.get(j-1)+preA.get(j).get(i));
			}
			preB.add(preb);
		}


		if(A.size()!=A.get(0).size()) {

			for(int i=0; i<preB.get(i).size(); i++) {
				ArrayList<Integer> prec = new ArrayList<Integer>();
				for(int j=0; j<preB.size(); j++) {
					prec.add(preB.get(j).get(i))	;
				}
				preC.add(prec);
			}
		}

		if(A.size()==A.get(0).size()) {
			preC=preB;
		}else if(A.size()!=A.get(0).size()) {
			preC=preC;
		}

		for(int i=0; i<2; i++) {

			if(B.get(i)==1 && C.get(i)==1) {
				int e1 =D.get(i)-1;
				int e2 =E.get(i)-1;
				int sum =	preC.get(e1).get(e2);
				ans.add(sum);
			}

			else  {

				int r2 =D.get(i)-1;
				int c2 =E.get(i)-1;

				int endSum =	preC.get(r2).get(c2);
				int r1 =	B.get(i-1);
				int c1 = C.get(i-1);

				endSum = endSum -preC.get(r2).get(c1-1)-preC.get(r1-1).get(c2)+preC.get(r1-1).get(c1-1);
				ans.add(endSum);
			}


		}


		return E;
	}
}
