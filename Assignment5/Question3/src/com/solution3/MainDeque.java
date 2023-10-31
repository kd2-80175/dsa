package com.solution3;

public class MainDeque {
	public static void main(String[] args) {
		Deque d1=new Deque();
		 d1.addFirst(80);
		 d1.addFirst(77);
		 d1.addFirst(33);
		 d1.addFirst(111);
		 d1.addFirst(115);
		 d1.fDisplay();
		 d1.deleteFirst();
		 d1.fDisplay();
		 d1.addLast(63);
		 d1.addLast(23);
		 d1.addLast(20);
		 d1.addLast(19);
		 d1.addLast(27);
		 d1.fDisplay();
		 d1.deleteLast();
		 d1.fDisplay();
	}

}
