package com.solution2;

public class List {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node tail;
	private int count;

	public List() {
		tail = null;
		count = 0;
	}

	public int getCount() {
		return count;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			newnode.next=newnode;
			tail=newnode;
		}
		else {
			newnode.next =tail.next;
			tail.next = newnode;
		}

		count++;
	}
	public void addLast(int value) {
		Node newnode=new Node(value);
		if(isEmpty()) {
			newnode.next=newnode;
			tail=newnode;
		}
		else {
			newnode.next=tail.next;
			tail.next=newnode;
			tail=newnode;
		}
	}
	public void addPosition(int value,int pos) {
		if(pos<1||pos>count+1)
			return;
		//1.create node
		Node newnode=new Node(value);
		if(isEmpty()) {
			tail=newnode;
			tail.next=tail;
		}
		else if(pos==1) {
			addFirst(value);
		}
		else {
			Node trav=tail;
			for(int i=1;i<pos-1;i++)
				trav=trav.next;
			newnode.next=trav.next;
			trav.next=newnode;
		}
		count++;
	}
	public void deleteFirst() {
		if(isEmpty()) {
			System.out.println("LIST IS EMPTY");
			return;
		}
		else if(tail.next==tail) {
			tail=null;
		}
		else {
//			Node trav=tail;
//			while(trav.next!=tail)
//				trav=trav.next;
//			trav.next=tail.next;
//			tail=tail.next;
			tail.next=tail.next.next;
			//tail=trav;
		}
	} public void deleteLast() {
		//1. if list is empty
		if(isEmpty()) {
			// print msg and return
			System.out.println("List is empty");
			return;
		}
		//2. if list has single node
		else if(tail.next == tail)
			//a. make head = null
			tail = null;
		//3. if list has multiple nodes
		else {
			//a. traverse till second last node
			Node trav = tail;
//			for( ; trav.next.next != tail ; trav = trav.next);
//			
//			//b. add first node into next of second last node
//			trav.next = tail;
//		}
			while(trav.next!=tail) {
				trav=trav.next;
				}
			trav.next=tail.next;
			}
		// decreament count
		//count--;
	}

	public void displayList() {
		if (isEmpty())
			return;
		System.out.println("List: ");
		Node trav = tail.next;
		do {
		//	System.out.println("hi");
			System.out.println(" " + trav.data);
			trav = trav.next;
			// trav.next=trav;
		} while (trav != tail.next);

//	while(trav!=tail) {
//		System.out.println(" "+trav.data);
//		trav.next=tail;
//	}
		System.out.println("");
	}
}
