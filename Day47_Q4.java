package com.scaler.advance;

import java.util.ArrayList;


class Interval {
	int start;
	int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
}

public class Day47_Q4 {

	public static void main(String[] args) {
		
		Interval a = new Interval();
		a.end=3;
		a.start=1;


		Interval b = new Interval();
		b.end=9;
		b.start=6;

		

		
		Interval newInterval = new Interval();
		newInterval.start=2;
		newInterval.end=6;

		ArrayList<Interval> intervals = new ArrayList<Interval>();
		intervals.add(a);
		intervals.add(b);
	
	
		
		insert(intervals,newInterval);
	}
	
	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		ArrayList<Interval> ans = new ArrayList<Interval>();
		
		int x=intervals.get(0).start;
		int y=intervals.get(0).end;
		boolean check=false;
		for(int i=0; i<intervals.size(); i++) {
			if(newInterval.start<=intervals.get(i).end ) {

				y=Math.max(y, newInterval.end);
				newInterval.end=y;
				Interval c = new Interval(x,y);
				ans.add(c);
				check=true;
				System.out.println(x+" "+y);
			}else {
				x= intervals.get(i).start;
				y= intervals.get(i).end;
				Interval c = new Interval(x,y);
				ans.add(c);
				System.out.println(x+" "+y);
		}

		}
		return ans;
	}
}
	

