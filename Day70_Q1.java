package com.scaler.advance;

import java.util.HashSet;

public class Day70_Q1 {

	public static void main(String[] args) {

		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next=node.next.next.next;
		//		node.next.next.next.next = new ListNode(5);
		//		node.next.next.next.next.next = new ListNode(6);
		//		node.next.next.next.next.next.next = new ListNode(7);
		//		node.next.next.next.next.next.next.next = new ListNode(8);
		//		node.next.next.next.next.next.next.next.next = node.next.next.next.next.next;
		detectCycle(node);
	}
	public static ListNode detectCycle(ListNode a) {

		HashSet<ListNode> s = new HashSet<ListNode>();
		//		ListNode fast=a;
		//		ListNode slow=a;
		//		
		//		while( fast.next!=null && fast.next.next!=null  ) {
		//			slow=slow.next;
		//			fast=fast.next.next;
		//			if(slow==fast) {
		//				return fast;
		//			}
		//		}
		while(a!=null) {

			if(s.add(a)) {
				a=a.next;
				continue;
			}else {
				return a;
			}

		}

		return null;
	}
}
