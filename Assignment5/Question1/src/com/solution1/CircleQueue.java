package com.solution1;
/*1. Implement add and delete at position in doubly circular linked list.
*/
public class CircleQueue {
public class Node{
	private int data;
	private Node next;
	private Node prev;
	public Node (int value) {
		data=value;
		next =prev=null;
	}
}
private Node head;
 public CircleQueue()  {
	head=null;
}
 public boolean isEmpty() {
	 return head==null;
 }
 public void addFirst(int value) {
	 Node nn=new Node(value);
	 if(isEmpty()) {
		 head=nn;
		 head.next=nn;
		 head.prev=nn;
	 }
	 else {
		 nn.next=head;
		 nn.prev=head.prev;
		 head.prev.next=nn;
		 head.prev=nn;
		 head=nn;
	 }
 }
 public void addPosition(int value,int pos) {
	 Node nn=new Node(value);
	if(isEmpty())
		head=nn;
	else {
		Node trav=head;
		for(int i=1;i<pos-1;i++)
			trav=trav.next;
		nn.next=trav.next;
		nn.prev=trav;
		trav.next=nn;
		nn.next.prev=nn;
	}
 }
 public void deletePosition(int pos) {
	 if(isEmpty())
		 return;
	 else if(head.next==null)
		 head=null;
	 else {
		 Node trav=head;
		 for(int i=1;i<pos;i++)
			 trav=trav.next;
		 trav.prev.next=trav.next;
		 trav.next.prev=trav.prev;
	 }
 }
 public void fdisplay() {
	 if(isEmpty())
		 return;
	 Node trav=head;
	 System.out.println("Forward List: ");
	 do {
		 System.out.println(" "+trav.data);
		 trav=trav.next;
	 }while(trav!=head);
	 System.out.println("");
 }
 
}
