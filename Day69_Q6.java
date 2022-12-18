package com.scaler.advance;
class Node {
	int value;
	Node next;
	public Node(int value) {
		this.value = value;
		this.next = null;
	}
}
public class Day69_Q6 {

	public static void main(String[] args) {
		insert_node(3,10);

	}
	public static void insert_node(int position, int value) {
		int size = 10;
		Node head =null;
		if (position <= 0)
			return;

		else if(position==1) {
			Node newnode = new Node(value);
			newnode.next=head;
			head=newnode;
					
		}else if(position>1 && position<=size-1) {
			Node curr=head;
			for(int i=0; i<position - 1; i++) {
				curr=curr.next;
			}
		}

	}
}
