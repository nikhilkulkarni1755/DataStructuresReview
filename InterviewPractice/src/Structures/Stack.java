package Structures;

import Node.Node;

public class Stack<T> {

	private SLL<T> stack;
	//private Node<T> head;
	//idk if we need ptr var, but we shall see
	//private Node<T> ptr;
	//private int size;
	
	//no need for getters or setters here. 
	
	public Stack(T data) {
//		this.head = new Node<T>(data);
		Node<T> node = new Node<T>(data);
		this.stack = new SLL<T>(node);
		//size = 1;
	}
	
	public int getSize() {
		return this.stack.getSize();
	}
	
	public void push(T data) {
		stack.insertFront(data);
		//this.head = 
		//size++;
	}
	
	public boolean pop() {
		//stack.remove(node);
		
		//remove the front of the sll
		//size--;
		return stack.removeFront();
		
	}

	public void peek() {
		System.out.println("Peek() -> " + this.stack.getHead().getValue() );
	}
	
	public void print() {
		stack.print();
	}
	//Stack is based on singly linkedlist
	
	//1
	//2
	//3
	//4
	
	//push(9)
	
	//9
	//1
	//2
	//3
	//4
	
	//pop()
	//1
	//2
	//3
	//4
	
}
