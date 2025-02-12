package com.scaler.advance;

public class Day71_Q1 {

	public static void main(String[] args) {
		ListNode A = new ListNode(1);
		A.next = new ListNode(2);
		A.next.next = new ListNode(8);


		
		ListNode B = new ListNode(5);



		mergeTwoLists(A, B);
	}
    public static ListNode mergeTwoLists(ListNode A, ListNode B) {
    	ListNode head =null;
    	ListNode t=null;
		ListNode ref =null;
    	while(A!=null && B!=null) {
    		if(A.val>B.val) {
    			head=new ListNode(B.val);
    			if(t!=null) {
    				while(t.next!=null) {
    					t=t.next;
    				}
    			t.next=head;
    			}else {

    				t=head;
    				ref=t;
    			}
    			head.next=null;
    			B=B.next;

    		}else if(A.val<B.val) {
    			
    			head=new ListNode(A.val);
    			if(t!=null) {
    				while(t.next!=null) {
    					
    					t=t.next;

    				}

					t.next=head;
    			}else {
    				t=head;
    				ref=t;
    			}
    			head.next=null;
    			A=A.next;
    		}
    	}
    	ListNode s=ref; // always use ref not s here onward
    	if(B!=null) {
    		while(ref.next!=null) {
    			ref=ref.next;
    		}
    		while(B!=null) {

    			ref.next=B;
    			ref=ref.next; // this line could help me in slove problem
    			B=B.next;
    		}
    	}else if(A!=null) {
    		while(ref.next!=null) {
    			ref=ref.next;
    		}
    		while(A!=null) {
    			ref.next=A;
    			ref=ref.next; 
    			A=A.next;
    		}
    	}
    	
		return s;
    }
}
