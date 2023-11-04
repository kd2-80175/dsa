package com.solution6;

public class StackUsingQueue {
	private CustomQueue queue1;
    private CustomQueue queue2;

    public StackUsingQueue(int size) {
        queue1 = new CustomQueue(size);
        queue2 = new CustomQueue(size);
    }

    public void push(int data) {
        if (queue1.isFull()) {
            throw new IllegalStateException("Stack is full");
        }

        while (!queue1.isEmpty()) {
            queue2.enqueue(queue1.dequeue());
        }

        queue1.enqueue(data);

        while (!queue2.isEmpty()) {
            queue1.enqueue(queue2.dequeue());
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue1.dequeue();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue1.peek();
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop()); // Output: 30
        System.out.println(stack.pop()); // Output: 20
        System.out.println(stack.pop()); // Output: 10
    }
}


