package com.solution2;

public class MainStack {
public static void main(String[] args) {
	ListStack l1=new ListStack();
	l1.pushFirst(11);
	l1.pushFirst(22);
	l1.pushFirst(40);
	l1.pushFirst(44);
	l1.display();
	System.out.println("Top Element is "+l1.peek());
	l1.popFirst();
	l1.display();
	System.out.println("Top Element is "+l1.peek());
	System.out.println("***************QUEUE****************");
	QueueLList l2=new QueueLList();
	l2.addFirst(44);
	l2.addFirst(77);
	l2.addFirst(69);
	l2.addFirst(15);
	l2.addFirst(79);
	l2.display();
	System.out.println("Top Element is "+l2.peek());
	l2.deleteLast();;
	l2.display();
	
}
}
