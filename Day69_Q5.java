package com.scaler.advance;

public class Day69_Q5 {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5);
		node.next.next.next.next.next = new ListNode(6);

		reverseList(node);

	}
	public static ListNode reverseList(ListNode A) {
		
		ListNode curr=A;
		ListNode prev=null;
		
		while(curr!=null) {
			ListNode tmp =curr.next;
			curr.next=prev;
			prev=curr;
			curr=tmp;
		}
		return prev;
		
	}
}
