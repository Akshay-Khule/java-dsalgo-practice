package com.scaler.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Day52_Q5 {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(4);
		A.add(8);
		A.add(12);
		A.add(6);

		//5, 17, 100, 11

		int B=2;


		System.out.println(solve(A,B));
	}
	public static int solve(ArrayList<Integer> A, int B) {
		int modulus = 1000000007;
		int ans=0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<A.size(); i++) {

			Integer reminder = A.get(i)%B;

			if(reminder==0 && !map.containsKey(0)) {

				map.put(reminder,1);
			}else if (reminder==0  && map.containsKey(0)) {


				ans=ans+map.get(0);
				map.put(reminder, map.get(reminder)+1);
			}



			if(reminder!=0) {
				if(!map.containsKey(reminder)) {

					if ( i!=0 && map.containsKey(B-reminder)) {
						ans=ans+map.get(B-reminder);
					}	
					map.put(reminder, 1);
				}else {

					if ( map.containsKey(B-reminder)) {
						ans=ans+map.get(B-reminder);
					}
					map.put(reminder, map.get(reminder)+1);
				}
			}
		}

		return  (int) ((ans)%modulus);


	}
}
