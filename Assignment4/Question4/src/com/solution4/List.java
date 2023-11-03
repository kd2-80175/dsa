package com.solution4;
public class List {
	public class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data=value;
			next =null;
		}
	}
	private Node head;
	private Node tail;
	public List() {
		head=null;
		tail=null;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public void addFirst(int value) {
		Node newnode=new Node(value);
		if(isEmpty()) {
			head=newnode;
			tail=newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
			
		}
	}
	public void addLast(int value) {
		Node newnode=new Node(value);
		if(isEmpty()) {
			head=newnode;
			tail=newnode;
		}
		else {
			
			tail.next=newnode;
			//tail=newnode;
			tail=tail.next;
		}
	}
	public void deleteFirst() {
		if(isEmpty())
			System.out.println("List is empty");
		else head=head.next;
	}
	public void deleteLast() {
		if(isEmpty())
			System.out.println("List is empty");
		else if(head.next==null)
			head=null;
		else {
			Node trav=head;
			while(trav.next.next!=null)
				trav=trav.next;
			trav.next=null;
			tail=trav;
		}
	}
	public void displayList() {
		Node trav=head;
		System.out.println("List: ");
		while(trav!=null) {
			//System.out.println(" "+trav.data);
			System.out.print(trav.data+"->");
			trav=trav.next;
		}
		System.out.println("");
	}
	public void reverseList() {
		Node trav1=head;
		Node trav2=head.next;
		head.next=null;
		System.out.println("REVERSE LIST:");
		while(head!=null) {
			//System.out.println(trav2.data+"->");
			head=trav2.next;
			
			trav2.next=trav1;
		}
	}
}
