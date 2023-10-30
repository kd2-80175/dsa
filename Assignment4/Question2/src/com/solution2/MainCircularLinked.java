package com.solution2;

public class MainCircularLinked {
public static void main(String[] args) {
	List l1=new List();
	//l1.addLast(49);
	l1.addFirst(77);
	l1.addFirst(88);
	l1.addFirst(90);
	l1.addFirst(55);
	l1.displayList();
	System.out.println("*******************");
	l1.addLast(49);
	l1.displayList();
	System.out.println("*******************");
	l1.addPosition(13, 3);
	l1.displayList();
	
	System.out.println("*******************");
	l1.deleteFirst();
	l1.displayList();
	System.out.println("*******************");
	l1.deleteLast();
	l1.displayList();
}
}
