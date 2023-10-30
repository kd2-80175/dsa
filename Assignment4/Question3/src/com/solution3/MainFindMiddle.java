package com.solution3;

public class MainFindMiddle {
public static void main(String[] args) {
	List l1=new List();
	System.out.println("**********FOR ODD*********");
	l1.add(55);
	l1.add(44);
	l1.add(17);
	l1.add(32);
	l1.add(15);
	l1.displayList();
	l1.printMiddle();
	System.out.println("**********FOR EVEN*********");
	List l2=new List();
	l2.add(55);
	l2.add(44);
	l2.add(17);
	l2.add(32);
	
	l2.displayList();
	l2.printMiddle();
	
}
}
