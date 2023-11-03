package com.solution4;



public class MainReverse {
public static void main(String[] args) {
	List l1=new List();
	
	l1.addFirst(55);
	l1.addFirst(44);
	l1.addFirst(17);
	l1.addFirst(32);
	l1.addFirst(15);
	l1.displayList();
	System.out.println("********REVERSE LINKEDLIST********");
	l1.reverseList();
	l1.displayList();
}
}
