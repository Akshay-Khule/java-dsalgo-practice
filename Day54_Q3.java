package com.scaler.advance;

public class Day54_Q3 {

	public static void main(String[] args) {
		int A=8;
		
		System.out.println(solve(A));
	}
    public static int solve(int A) {

    	int ans=0;
    	for(int i=1; i<=8; i++) {
    		int ct=0;
    		for(int j=1;j<=i; j++) {
    			if(i%j==0) {
    				if(isPrime(j)) {
    				ct++;	
    				}
    			}
    		}
    		
    		if(ct==2)
    			ans++;

    	}
    	
    	return ans;
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
