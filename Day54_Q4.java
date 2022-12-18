package com.scaler.advance;

import java.util.ArrayList;

public class Day54_Q4 {

	public static void main(String[] args) {
		//A = [1, 2, 3]
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		solve(A);

	}
    public static int solve(ArrayList<Integer> A) {
    	int[] arr = new int[A.size()];
    	for(int i=0; i<A.size(); i++) {
    		arr[i]=A.get(i);
    	}
    	ArrayList<Integer> ds = new ArrayList<Integer>();
    	
    	printSubsequence(arr,0,ds);

    	return 0;
    }
    
	private static void printSubsequence(int[] arr, int i, ArrayList<Integer> ds) {
		boolean check=false;
		int ct=0;
		if(i>=arr.length) {
			for(int k=0; k<ds.size(); k++) {
				check = isPrime(ds.get(k));
				if(check==false)
					break;
			}
			if(check) {
				ct++;
			}
			System.out.println(ct);
			return ;
		}
		
		ds.add(arr[i]);
		printSubsequence(arr, i+1, ds);
		ds.remove(ds.size()-1);
		printSubsequence(arr, i+1, ds);
	}
	
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i <=Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
  
        return true;
}
}
