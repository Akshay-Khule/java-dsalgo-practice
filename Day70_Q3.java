package com.scaler.advance;

import java.util.ArrayList;

public class Day70_Q3 {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		//		node.next = new ListNode(2);
		//		node.next.next = new ListNode(3);
		//		node.next.next.next = new ListNode(4);
		//		node.next.next.next.next = new ListNode(5);
		//		node.next.next.next.next.next = new ListNode(6);
		//		node.next.next.next.next.next.next = new ListNode(7);
		//		node.next.next.next.next.next.next.next = new ListNode(8);
		////		node.next.next.next.next.next.next.next.next = new ListNode(9);
		//1,2,3,4,5,6,7,8,9
		//1,9,2,8,3,7,4,6,5		

		reorderList(node);

	}
	public static ListNode reorderList(ListNode A) {

		ArrayList<ListNode> list = new ArrayList<>();

		if(A.next==null) {
			return A;
		}

		while(A!=null) {
			list.add(A);
			A=A.next;
		}

		int i=0;
		int j=list.size()-1;

		ListNode t = null;
		ListNode B =null;
		while(i<=j) {
			if(t==null) {
				t = new ListNode(list.get(i).val);
				t.next = new ListNode(list.get(j).val);
				B=t;
				t=t.next;
				i++;
				j--;
			}else {
				ListNode tmp = new ListNode(list.get(i).val);
				t.next=tmp;
				if(i==j)
					break;
				t.next.next = new ListNode(list.get(j).val);
				t=t.next.next;
				i++;
				j--;
			}
		}

		return B;
	}
}
