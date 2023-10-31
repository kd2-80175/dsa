package com.solution1;

public class MainCIRCULAR {
	public static void main(String[] args) {
		CircleQueue c1=new CircleQueue();	
		c1.addFirst(66);
		c1.addFirst(77);
		c1.addFirst(33);
		c1.addFirst(90);
		c1.addFirst(88);
		c1.fdisplay();
		System.out.println("---------after adding at position----------");
		c1.addPosition(59, 3);
		c1.fdisplay();
		System.out.println("----------after deleting from position----------");
		c1.deletePosition(4);
		c1.fdisplay();
	}


}
