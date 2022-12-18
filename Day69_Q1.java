package com.scaler.advance;

class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { 
		val = x; 
		next = null; 
	}
}

public class Day69_Q1 {

	public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next= new ListNode(2);
		
		l.next.next=new ListNode(3);
		l.next.next.next= new ListNode(4);
		l.next.next.next.next= new ListNode(5);

		
		solve(l);

	}
	public static ListNode solve(ListNode A) {
		if(A.next==null) {
			return null;
		}
		int count=0;
		ListNode head=A;
		ListNode tmp=A;
		while(A!=null) {
			A=A.next;
			count++;
		}
		
		int middle=count/2;
		int i=1;
		while(i<middle ) {
			tmp=tmp.next;
			i++;
		}
		tmp.next=tmp.next.next;
		
		return head;
	}
}
