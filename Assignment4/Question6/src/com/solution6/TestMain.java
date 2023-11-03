package com.solution6;

public class TestMain {
	


public static void main(String[] args) {
	List l1=new List();
     l1.addFirst(22);
	l1.addFirst(69);
	l1.addFirst(44);
    l1.addFirst(23);
	l1.addFirst(38);
	l1.displayList();
	System.out.println("********After Sorting*******");
	l1.bubbleSort();
	l1.displayList();
	
}


}
