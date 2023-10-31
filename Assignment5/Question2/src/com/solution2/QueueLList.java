package com.solution2;

public class QueueLList {
public class Node{
	private int data;
	private Node next;
	private Node prev;
	public Node(int value) {
		data=value;
		next=null;
		prev=null;
	}
	
	}
Node front ,rear;
public QueueLList() {
	front=rear=null;
}
public boolean isEmpty() {
	return front==null&&rear==null;
}
public void addFirst(int value) {
	Node nn=new Node(value);
	if(isEmpty())
		front=rear=nn;
	else {
		nn.next=front;
		front.prev=nn;
		front=nn;
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
public int peek() {
	if(!isEmpty())
		return rear.data;
	else {
		System.out.println("Queue is empty");
		return -1;
		
	}
}
public void display() {
	Node trav=front;
	System.out.println("forward display: ");
	while(trav!=null) {
		System.out.println(" "+trav.data);
		trav=trav.next;
	}
	System.out.println("");
	}

}
