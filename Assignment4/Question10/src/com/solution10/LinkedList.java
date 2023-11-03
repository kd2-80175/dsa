package com.solution10;

public class LinkedList {
public class Node{
	private Employees data;
	private Node next;
	public Node (Employees employees) {
		data=employees;
		next=null;
		}
	
}
private Node head;
public LinkedList() {
	head=null;
}
public boolean isEmpty() {
	return head==null;
}
public void addFirst(Employees employees) {
	Node nn=new Node(employees);
	if(isEmpty())
		head=nn;
	else {
		nn.next=head;
		head=nn;
	}
}
public Employees searchByName(String name) {
	if(isEmpty())
		return null;
	Node trav=head;
	while(trav.next!=null) {
		if(trav.data.getName().equals(name))
			return trav.data;
	trav=trav.next;
	}
	if(trav.next==null&&trav.data.getName().equals(name))
		return trav.data;
	return null;
}
public Node searchById(int id) {
	if (isEmpty())
		return null;
	else if (head.next == null) {
		if (head.data.getEmpid() == id)
			return head;
		else
			return null;
	} else if (head.data.getEmpid() == id) {
		return head;
	} else {
		Node trav = head;
		while (trav.next != null) {
			if (trav.data.getEmpid() == id)
				return trav;

			trav = trav.next;
		}
		if (trav.next == null && trav.data.getEmpid() == id)
			return trav;
		else
			return null;
	}
}
	
			
private void delFirst() {
if(isEmpty())
	System.out.println("List is empty");
else head=head.next;
	
}
private void delLast() {
	if (this.isEmpty())
		System.out.println("List is empty.");

	
	else {
		Node trav = head;
		while (trav.next.next != null) {
			trav = trav.next;
		}
		trav.next = null;	
	}
	
}

public void display() {
	Node trav=head;
	System.out.println("List: ");
	while(trav!=null) {
		System.out.println(" "+trav.data);
		trav=trav.next;
	}
	System.out.println("");
}
public void deleteById(int id) {
	if(isEmpty()) {
		System.out.println("List is empty");
	return;}
	else if(head.next==null) {
		if(head.data.getEmpid()==id) {
			head=null;
			System.out.println("Employee deleted succesfully.");
			return;
		}
		else System.out.println("ID does not exist.");
	}
	else if(head.data.getEmpid()==id) {
		delFirst();
		System.out.println("Employee deleted successfully.");
		return;
	}
	else {
		Node trav=head;
		while(trav.next!=null) {
			if(trav.next.data.getEmpid()==id) {
				trav.next=trav.next.next;
				System.out.println("Employee deleted successfully.");
				return;
			}
			trav=trav.next;
		}
		if(trav.next==null&&trav.data.getEmpid()==id)
			delLast();
		else 
			System.out.println("Id does not exist.");
		
		
	}
		
}

public boolean updateSalary(int id,double salary) {
	Node node=searchById(id);
	if(node!=null) {
		node.data.setSalary(salary);
		return true;
	}else
		return false;
}

}
