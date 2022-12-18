package com.scaler.advance;

import java.util.ArrayList;
import java.util.List;

public class Day58_Q1 {

	public static void main(String[] args) {
    	List<Integer> A = new ArrayList<Integer>();
    	List<Integer> B = new ArrayList<Integer>();
    	

    	A.add(1);
    	A.add(1);
    	A.add(3);
    	

    	B.add(2);
    	B.add(5);
    	B.add(6);
    	
    	solve(A,B);
	}
    public static ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
//    	A = [4, 7, 9 ]
//    	B = [2, 11, 19 ]
    	boolean check=true;
    	int p1=0;
    	int p2=0;
    	List<Integer> ans = new ArrayList<Integer>();
    	
 
    	
    	while(p1<A.size()&&p2<B.size()) {
    		if(A.get(p1)<=B.get(p2)) {
    			ans.add(A.get(p1));
    			p1++;
    		}else if(B.get(p2)<=A.get(p1)) {
       			ans.add(B.get(p2));
    			p2++;   			
    		}
    	}
    	

//    	if(p1>p2) {
//    	
//    		for(int b=p2; b<B.size(); b++) {
//    			ans.add(B.get(b));
//    		}
//    		
//    	}else if(p2>p1) {
//    		for(int b=p1; b<A.size(); b++) {
//    			ans.add(A.get(b));
//    		}
//    	}
//    	else {
//    		if(A.size()>B.size()) {
//        		for(int b=p1; b<A.size(); b++) {
//        			ans.add(A.get(p1));
//        		}
//    			
//    		}else {
//        		for(int b=p1; b<B.size(); b++) {
//        			ans.add(B.get(p1));
//        		}
//    		}
//    	}
    	while(p1<A.size()) {

    		ans.add(A.get(p1));
    		p1++;

    	}
    	while(p2<B.size()) {

    		ans.add(B.get(p2));
    		p2++;

    	}
    	

    	
    	
    	return (ArrayList<Integer>) ans;
    }
}

