package com.scaler.advance;

import java.util.HashSet;

public class Day70_Q2 {

	public static void main(String[] args) {
		ListNode node = new ListNode(3);
		node.next = new ListNode(2);
		node.next.next = new ListNode(4);
		node.next.next.next = new ListNode(5);
		node.next.next.next.next = new ListNode(6);
		node.next.next.next.next.next=node.next.next;		
		solve(node);

	}
	public static ListNode solve(ListNode A) {
		HashSet<ListNode> s = new HashSet<ListNode>();
		ListNode prev=null;
		ListNode head=A;
		while(A!=null) {
			if(s.add(A)) {
				prev=A;
				A=A.next;
			}else {
				prev.next=null;
				break;
			}

		}

		return head;
	}
}
