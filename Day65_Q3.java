package com.scaler.advance;

import java.util.ArrayList;
import java.util.HashMap;

public class Day65_Q3 {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(4);
		A.add(2);
		A.add(-3);
		A.add(1);
		A.add(3);
		
		solve(A);

	}
    public static int solve(ArrayList<Integer> A) {
    	 Long v =0l;
    	ArrayList<Long> prefix = new ArrayList<Long>();
    	HashMap<Long,Long> map = new HashMap<Long,Long>();
    	prefix.add(A.get(0).longValue());
    	for(int i=1; i<A.size(); i++) {
    		prefix.add(i, (prefix.get(i-1)+A.get(i).longValue()))	;
    		
    		if(map.containsKey(prefix.get(i))) {
    			return 1;
    		}
    		if( prefix.get(i).longValue()==v)
    			return 1;
    		
    		map.put(prefix.get(i), Long.valueOf(i));
    	}
    	
//    	for(int i=0; i<prefix.size(); i++) {
//    		
//    		if(prefix.get(i)==0)
//    			return 1;
//    		
//    		if(!map.containsKey(prefix.get(i))) {
//    			map.put(prefix.get(i), i);
//    		}else {
////    			int index=map.get(prefix.get(i));
////    			int a=index+1;
////    			int b=i;
////    			System.out.println(a+" "+b);
//    			return 1;
//    			
//    		}
//    	}
    	
		return 0;
    }
}
