package com.scaler.advance;

public class Day69_Q3 {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5);
		node.next.next.next.next.next = new ListNode(6);
		solve(node);
	}
	public static int solve(ListNode A) {
		ListNode tmp=A;
		int count =0;
		while(A!=null) {
			A=A.next;
			count++;
		}
		int middle=count/2;
		if(count%2==0) {
			middle=middle+1;
		}

		if(count%2==0) {
			int c=0;
			while(c<middle-1) {
				tmp=tmp.next;
				c++;
			}
		}else {

			int c=0;
			while(c<middle) {
				tmp=tmp.next;
				c++;
			}



		}

		return tmp.val;
	}
}
