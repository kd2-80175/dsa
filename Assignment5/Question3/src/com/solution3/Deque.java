package com.solution3;

public class Deque {
public class Node{
	private int data;
	private Node next;
	private Node prev;
	public Node(int value) {
		data =value;
		next=null;
		prev=null;
	}
	
}
private Node front ;
private Node rear;
public Deque() {
	front=null;
rear=null;
}
public boolean isEmpty() {
	return front==null&&rear==null;
}
public void addFirst(int value) {
	Node nn=new Node(value);
	if(isEmpty()) {
		front=rear=nn;
	}
	else {
		nn.next=front;
		front.prev=nn;
		front=nn;
	}
}
public void addLast(int value) {
	Node nn=new Node(value);
	if(isEmpty())
		front=rear=nn;
	else {
		nn.prev=rear;
		rear.next=nn;
		rear=nn;
		}
}
public void deleteFirst() {
	if(isEmpty()) {
		System.out.println("Deque is full");
	}
	else if(front.next==null)
		front=rear=null;
	else {
		front=front.next;
		front.prev=null;
	}
	
}
public void deleteLast() {
	if(isEmpty())
		return;
	else if(front.next==null)
		front=rear=null;
	else {
		rear=rear.prev;
		rear.next=null;
	}
}
public void fDisplay() {
	//1. create trav and start at head
	Node trav = front;
	System.out.print("Forward : ");
	while(trav != null) {
		//2. visit current node
		System.out.print(" " + trav.data);
		//3. go on next node
		trav = trav.next;
	}//4. repeat step 2 and 3 till last node
	System.out.println("");
}
}
