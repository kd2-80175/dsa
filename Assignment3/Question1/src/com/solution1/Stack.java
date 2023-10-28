package com.solution1;

public class Stack {
	private int top;
	private final int SIZE;
	private int arr[];

	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}

	public void push(int data) {
		if (top == this.SIZE - 1) {
			System.out.println("Stack Full");
		}
		top++;
		arr[top] = data;
	}

	public int pop() {
		if (top == this.SIZE - 1) {
			System.out.println("Empty");
		}
		int data = arr[top];
		top--;
		return data;
	}

	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

}
