package com.demo.prac;


public class DoublyLinkedlist {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int x) {
			data = x;
			next = null;
			prev = null;
		}	
	}
	public DoublyLinkedlist( ) {
		head = null;
	}
	
	public void addNode(int n) {
		Node newNode=new Node(n);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.prev=temp;
			
		}
		
	}
	public void Adddata(int value, int num) {
		Node newNode=new Node(num);

			Node temp=head;
			while(temp.next!=null && temp.data!= value) {
				temp=temp.next;
			}
			if(temp.next!=null) {
			newNode.next=temp.next;
			newNode.prev=temp;
			temp.next=newNode;
			temp.next.prev=newNode;
			
		}
			System.out.println("not found");
	}
	
	public void display() {
		if(head==null) {
			System.out.println("Empty List");
		}
		else {
		Node temp=head;
		for(temp=head; temp!=null;temp=temp.next) {
			System.out.print(temp.data+"------>");
		}
		}
	}
	
	
	

}
