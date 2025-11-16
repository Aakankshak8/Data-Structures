package com.demo.prac;

public class Singlylist {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int x) {
			
			data = x;
			next = null;
		}
	}
	public Singlylist() {
		
		head=null;
	}
	
	public void addnode(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;	
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
	}
	public void display() {
		if(head==null) {
			System.out.println("Empty List");
		}
		else {
		Node temp=head;
		for(temp=head;temp!=null;temp=temp.next) {
			System.out.print(temp.data+ "------->");
		}
		System.out.println("Null");
		}
	}
	
	public void Reverselist() {
		Reverlist(head);
	}

	private void Reverlist(Node head) {
		// TODO Auto-generated method stub
		
		if(head==null) {
			System.out.println();
			return;
		}
		else {
			Reverlist(head.next);
			System.out.print(head.data+"--->");
		}
		
	}
	
	
	

}
