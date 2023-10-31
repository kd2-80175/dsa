package com.solution2;

public class ListStack {
public class Node{
	private int data;
	private Node prev;
	private Node next;
	public Node(int value) {
		data=value;
		prev=null;
		next=null;
	}
	
}
private Node top;

public ListStack() {
	top=null;
	
	
}
public boolean isEmpty() {
	return top==null;
}
public void pushFirst(int value) {
	Node nn=new Node(value);
	if(nn==null) {
		System.out.println("stack is full");
		return;
	}
	nn.data=value;
	nn.next=top;
	top=nn;
	
		
}
public int peek() {
	if(!isEmpty()) {
		return top.data;
	}
	else {
		System.out.println("Stack is empty");
		return -1;
	}
}
public void popFirst() {
	if(top==null) {
		System.out.println("Stcak is empty");
		return;
	}
	top=(top).next;
}
public void display() {
	if(top==null) {
		System.out.println("Stack is empty");
	}
	Node trav=top;
	System.out.println("forward display: ");
	while(trav!=null) {
		System.out.println(" "+trav.data);
		trav=trav.next;
	}
	System.out.println("");
}

}
