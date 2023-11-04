package com.solution6;

public class CustomQueue {
private int arr[];
private int front,rear;
private final int Size;
public CustomQueue(int size) {
	Size=size;
	arr=new int[Size];
	front=-1;
	rear=-1;
}
public void enqueue(int data) {
	if(isFull()) {
		throw new IllegalStateException("Queue");
	}
	if(isEmpty()) {
		front =rear=0;
	}
	else {
		rear=(rear+1)%Size;
	}
	arr[rear]=data;
}
public int dequeue() {
	if(isEmpty()) {
		throw new IllegalStateException("Queue is empty");
	}
	int data=arr[front];
	if(front==rear) {
		front =rear=-1;
	}else {
		front=(front+1)%Size;
	}
	return data;
}
public int peek() {
    if (isEmpty()) {
        throw new IllegalStateException("Queue is empty");
    }
    return arr[front];
}

public int size() {
    if (isEmpty()) {
        return 0;
    }
    return (rear - front + Size) % Size + 1;
}

public boolean isFull() {
    return (rear + 1) % Size == front;
}

public boolean isEmpty() {
    return front == -1;
}
}
