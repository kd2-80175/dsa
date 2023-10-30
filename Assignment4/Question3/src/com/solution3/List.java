package com.solution3;



public class List {
public class Node{
	private int data;
	private Node next;
	public Node(int value) {
		data=value;
		next=null;
		}
	}
private Node head;
public void printMiddle() {
	Node slow_ptr=head;
	Node fast_ptr=head;
	while(fast_ptr!=null && fast_ptr.next!=null) {
		fast_ptr=fast_ptr.next.next;
		slow_ptr=slow_ptr.next;
	}
	System.out.println("The middle element is: "+slow_ptr.data);
}
public void add(int new_data) {
	Node newnode=new Node(new_data);
	newnode.next=head;
	head=newnode;
}
public void displayList() {
	Node trav=head;
	System.out.println("List: ");
	while(trav!=null) {
		System.out.print(trav.data+"->");
		trav=trav.next;
	}
	System.out.println("");
}
}
