package com.solution1;

public class MainSLinearLinkedList {
public static void main(String[] args) {
	List l1=new List();
	l1.addFirst(40);
	l1.addFirst(30);
	l1.addFirst(45);
	l1.addFirst(99);
	l1.addFirst(55);
	//l1.deleteFirst();
	l1.deleteLast();
	l1.addLast(66);
	l1.displayList();
}
}
