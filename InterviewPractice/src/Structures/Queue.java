package Structures;

import Node.Node;

public class Queue<T> {

	private SLL<T> queue;
	private int size;
	
	public Queue(T data) {
		Node<T> node = new Node<T>(data);
		queue = new SLL<T>(node);
		size = 1;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void enqueue(T data) {
		this.queue.insertFront(data);
	}
	
	//this means that we are removing the last element, instead of the first as in a stack. 
	
	public void dequeue() {
		
	}
	
}
