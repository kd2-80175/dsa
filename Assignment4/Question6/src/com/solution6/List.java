package com.solution6;



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
	
	public void swapNodes(int x, int y) {
        // Nothing to do if x and y are the same
        if (x == y) {
            return;
        }
    
        // Search for x (keep track of prevX and currX)
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }
    
        // Search for y (keep track of prevY and currY)
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }
    
        // If either x or y is not present, nothing to do
        if (currX == null || currY == null) {
            return;
        }
    
        // If x is not head of linked list
        if (prevX != null) {
            prevX.next = currY;
        } else {
            // Else make y as new head
            head = currY;
        }
    
        // If y is not head of linked list
        if (prevY != null) {
            prevY.next = currX;
        } else {
            // Else make x as new head
            head = currX;
        }
    
        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
 
    
	
	
	public void bubbleSort() {
        if (head == null) {
            return;
        }
 
        int count = 0;
        Node start = head;
        while (start != null) {
            count++;
            start = start.next;
        }
 
        // Traverse through all nodes of linked list
        for (int i = 0; i < count; i++) {
            // Last i elements are already in place
            Node curr = head;
            while (curr != null && curr.next != null) {
                // Swap adjacent nodes
                if (curr.data > curr.next.data) {
                    swapNodes(curr.data, curr.next.data);
                }
                curr = curr.next;
            }
        }
    }
	public void displayList() {
		Node trav=head;
		System.out.println("List: ");
		while(trav!=null) {
			System.out.println(" "+trav.data);
			trav=trav.next;
		}
		System.out.println("");
	}
}
