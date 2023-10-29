package com.solution2;


import java.util.Scanner;

public class StackMain {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
Stack st=new Stack(5);
	int max=0;
	
	System.out.println("hi");
	
	for(int i=0;i<st.arr.length;i++) {
		System.out.println("Enter data at "+i+":");
		int data =sc.nextInt();
	if(data>max) {
		max=data;
	}
	st.push(data);
	}

	System.out.println(st.peek());
	System.out.println("max value at stack: "+max);
	
}
}
