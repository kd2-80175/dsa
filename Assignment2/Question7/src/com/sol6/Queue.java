package com.sol6;
/*7. Write program to implement 
 * linear queue in which front and rear starts at 0.*/
public class Queue {
private int arr[];
private final int Size;
private int rear ,front;
public Queue(int size) {
	Size=size;
	arr=new int[Size];
	front=0;
	rear=0;
}
public void push(int data) {
	rear++;
	arr[rear]=data;
}
public void pop() {
	front++;
}
public int peek() {
	return arr[front+1];
	
}
public boolean isFull() {
	return rear ==Size-1;
}
public boolean isEmpty() {
	return rear ==front;
}
	

}
