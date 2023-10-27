package com.sol6;

import java.util.Scanner;

public class LinearQueue {
public static void main(String[] args) {
	Queue q=new Queue(4);
	int choice;
	Scanner sc=new Scanner(System.in);
	do {
		System.out.println("******************");
		System.out.println("0.Exit");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Peek");
		System.out.print("Enter Choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1: 
			if(q.isFull())
				System.out.println("Queue is full");
			else {
				System.out.println("Enter data: ");
				int data=sc.nextInt();
				q.push(data);
			}
			break;
		case 2: 
			if(q.isEmpty())
				System.out.println("Queue is Empty");
			else 
				q.pop();
			break;
		case 3: if(q.isEmpty())
			System.out.println("Queue is empty");
		else
			System.out.println("Peeked data: "+q.peek());
		break;
			
		}
	}while(choice!=0);
	sc.close();
}
}
