package com.ds.stack;

public class TestStack {
	
	int[] stack = {};
	int count = 0;
	int top = 0;
	
	TestStack(int size) {
		stack = new int[size];
	}
	
	public void push(int value) throws Exception {
		if (stack.length == count) {
			System.out.println("Stack is Full.");
		} else {
			stack[count] = value;
			count++;
			top++;
			display();
		}
	}
	
	public void pop() throws Exception {
		if (stack.length == 0) {
			System.out.println("Stack is Empty.");
		} else {
			count--;
			int value = stack[count];
			stack[count] = 0;
			top--;
			System.out.println("Pop Element:"+value);
			display();
		}
	}
	
	public void peek() throws Exception {
		if (stack.length == 0) {
			System.out.println("Stack is Empty.");
		} else {
			System.out.println("Top Element:"+stack[top-1]);
		}
	}
	
	public void display() {
		System.out.print("[");
		for (int i=0; i<stack.length; i++) {
			System.out.print(" "+stack[i]+" ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void main(String[] args) throws Exception {
		TestStack obj = new TestStack(5);
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.peek();
		obj.push(4);
		obj.push(5);
		obj.pop();
		obj.peek();
		obj.push(5);
		obj.push(6);
	}

}

