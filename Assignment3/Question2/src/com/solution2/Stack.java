package com.solution2;

public class Stack {
int top;
int arr[];
int SIZE;
public Stack(int size) {
	SIZE=size;
 top=-1;
	arr=new int[SIZE];
	}
public int push(int data) {
	if(isFull()) {
		System.out.println("Stack is full");
	}
	top++;
	arr[top]=data;
	return arr[top];
}
public int pop() {
	if(isEmpty()) {
		System.out.println("Stack is empty");
	}
	int data=arr[top];
	top--;
	return data;
	}
public int peek() {
	if(isEmpty()) {
		System.out.println("stack is empty");
	}
	return arr[top];
}
public boolean isEmpty() {
	return top==-1;
}
public boolean isFull() {
	return top==SIZE-1;
}
}
