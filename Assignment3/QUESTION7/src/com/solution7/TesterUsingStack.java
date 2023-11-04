package com.solution7;
public class TesterUsingStack{
public static void main(String[] args) 
{
	
	QueueStack que=new QueueStack(3);
	que.add(10);
	que.add(20);
	que.add(30);
	
	System.out.println("Elements in the queue are:");
	System.out.println(que.pop());
	System.out.println(que.pop());
	System.out.println(que.pop());
	
}
}