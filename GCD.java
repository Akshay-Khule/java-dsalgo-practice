package com.scaler.advance;

public class GCD {

	public static void main(String[] args) {
		int n2=4;
		int n1=4;

		solve(n1,n2);
		

	}

	private static int solve(int n1, int n2) {
		
		int a=n1;
		int b= n2;
        int result = Math.min(a, b); // Find Minimum of a nd b
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        System.out.println(result);
        //return result; // return gcd of a nd b

		int ans = Integer.MIN_VALUE;
		for(int i=1; i<=n1; i++) {
			if(n1%i==0 && n2%i==0) {
				ans =Math.max(ans, i);
			}
		}
		//System.out.println(ans);
		return ans;
		
//		while(n1%n2!=0) {
//			int rem = n1%n2;
//			n1=n2;
//			n2=rem;
//		}
//		int gcd=n2;
//		System.out.println(gcd);
		
//		if(n1==n2) {
//			return n1;
//		}
//		if(n1==0)
//			return n2;
//		if(n2==0)
//			return n1;
//			
//		
//		if(n1>n2) {
//		return solve( n1-n2,  n2);
//		}else {
//		return solve( n2-n1,  n1);	
//		}
//		

	}

}
