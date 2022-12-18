package com.scaler.advance;

public class Day61_Q2 {

	public static void main(String[] args) {
	
		int[] arr = new int[] {1};

		
		
		System.out.println(solve(arr));
	}
	
    public static int solve(int[] A) {
    	
    	int lo=0;
    	int hi=A.length-1;
    	
    	if(A.length==1)
    		return A[0];
    	
    	while(lo<=hi) {
    		int mid=(lo+hi)/2;
    		
    		if(mid==0 &&  A[mid+1]>A[mid]) {
    			return A[mid+1];
    		}else if(mid==0 && A[mid]>A[mid+1]) {
    			return A[mid];
    		}else if(mid==A.length-1 && A[mid]>A[mid-1]) {
    			return A[mid];
    		}else if(A[mid]>=A[mid-1] && A[mid]>=A[mid+1]) {
    			return A[mid];
    		}else if(A[mid+1]>A[mid]) {
    				lo=mid+1;
    		}else if(A[mid-1]>A[mid]) {
    			hi=mid-1;
    		}
    	}
    	
    	
    	
		return -1;
    }

}
