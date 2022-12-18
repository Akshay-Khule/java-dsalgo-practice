package com.scaler.advance;


public class Day69_Q4 {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5);
		node.next.next.next.next.next = new ListNode(6);
		node.next.next.next.next.next.next = new ListNode(7);
		node.next.next.next.next.next.next.next = new ListNode(8);
		node.next.next.next.next.next.next.next.next = new ListNode(9);
		//1-->2--3->4-->5-->6-->7-->8
		int B=2;
		int C=4;
		reverseBetween(node, B, C);
	}
	public static ListNode reverseBetween(ListNode A, int B, int C) {
		ListNode from=null;
		int count =0;


		ListNode dummy= new ListNode(0);

		dummy.next=A;



		ListNode temp=A;;
		while(temp!=null) {
			temp=temp.next;
			count++;
			if(count==B-1) {
				from=temp;
				break;
			}
		}

		ListNode end=new ListNode(0);
		ListNode subhead=from;
		int c2=count;
		while(from!=null) {
			from=from.next;
			c2++;
			if(c2==C-1) {
				end.next=from.next;
				from.next=null;
			}
		}




		System.out.println(end);
		ListNode l2=reverse(subhead);

		ListNode s = getFirst(dummy,B);


		ListNode du = new ListNode(0);
		du=s;

		while(s.next!=null) {
			s=s.next;
			
		}
		s.next=end.next;

		

		
		System.out.println(l2);

		return s;
	}
	


	private static ListNode getFirst(ListNode a, int b) {
		int c=1;
		ListNode t=a;
		while(a.next!=null) {
			c++;
			a=a.next;
			if(c==b) {
				break;
			}
		}
		return t;

	}
	private static ListNode reverse(ListNode subhead) {


		ListNode curr=subhead;
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
