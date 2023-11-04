package com.solution7;

import java.util.EmptyStackException;

public class QueueStack {
	private Stack st1;
	private Stack st2;
	private  final  int SIZE;
	
	int counter=-1;
	
public QueueStack(int size)
{
		SIZE=size;
		this.st1 =new Stack(SIZE);
		this.st2 =new Stack(SIZE);
}

void add(int data) 
{
	
	while (!st1.isEmpty())//push all elements into st2
         st2.push(st1.pop()); 

	st1.push(data);	
	counter++;

     while (!st2.isEmpty()) //push all elements again into st1 
         st1.push(st2.pop()); 
}

int pop() 
{
	counter--;
	
		return st1.pop();
		
	
}
boolean isEmpty() {
	return counter==-1;
}

boolean isFull() {
	return counter==SIZE-1;
}
}
