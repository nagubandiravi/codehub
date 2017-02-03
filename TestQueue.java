package com.ds.queue;

public class TestQueue {
	
	int[] queue = {};
	int count = 0;
	
	public TestQueue(int size) {
		queue = new int[size];
	}
	
	public void insert(int element) {
		if (queue.length == count) {
			System.out.println("Queue is Full.");
		} else {
			queue[count] = element;
			count++;
		}
	}
	
	public void delete() {
		if (queue.length == 0) {
			System.out.println("Queue is Empty.");
		} else {
			System.out.println("Element Deleted is:"+queue[0]);
			for (int i=1; i<queue.length;i++) {
				queue[i-1] = queue[i]; 
			}
			count--;
		}
	}
	
	public void displayFront() {
		System.out.println("Front Element is:"+queue[0]);
	}
	
	public void displayRear() {
		System.out.println("Rear Element is:"+queue[count-1]);
	}
	
	public void display() {
		System.out.print("[");
		for (int i=0; i<queue.length; i++) {
			System.out.print(" "+queue[i]+" ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void main(String[] args) {
		TestQueue obj = new TestQueue(5);
		obj.insert(1);
		obj.display();
		obj.insert(2);
		obj.display();
		obj.insert(3);
		obj.display();
		obj.delete();
		obj.display();
		obj.displayFront();
		obj.displayRear();
		obj.insert(4);
		obj.display();
		obj.insert(5);
		obj.display();
		obj.displayFront();
		obj.insert(6);
		obj.display();
		obj.displayRear();
	}

}
