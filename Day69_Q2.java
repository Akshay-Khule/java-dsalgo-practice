package com.scaler.advance;

public class Day69_Q2 {

	public static void main(String[] args) {

		//		 A = [1, 2, 3, 4, 5, 6]
		//				 B = 2		
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5);
		node.next.next.next.next.next = new ListNode(6);
		int B=3;
		reverseList(node, B);
	}
	public static ListNode reverseList(ListNode A, int B) {
		ListNode head=A;
		
		return A;
	}
}
