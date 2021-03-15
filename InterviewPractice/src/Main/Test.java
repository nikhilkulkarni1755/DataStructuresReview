package Main;

import Structures.*;
import Node.*;

public class Test {

	public static void main(String [] args) {
		
		//Singly Linked List Testing
		
		Node<Integer> node = new Node<Integer>(1);
		node.setNext(new Node<Integer>(2));
		SLL<Integer> ll = new SLL<Integer>(node);
		//ll.print();
		ll.insertFront(3);
		ll.insertEnd(6);
		//System.out.println(ll.getSize());
		System.out.println(ll.getSize());
		ll.insertEnd(6);
		ll.print(); //3 -> 1 -> 2 -> 6 -> 6 -> null
		System.out.println(ll.getSize());
		ll.reverse();
		ll.print();
		
		
		System.out.println("Remove -:> " + ll.remove(6));
		ll.print();
		System.out.println(ll.getSize());
		System.out.println("Remove -:> " + ll.remove(3));
		ll.print();
		System.out.println("Reversing using rec");
		ll.reverseRec();
		ll.print();
		ll.insertEnd(2);
		ll.print();
		ll.remove(2, 2);
		ll.print();
		ll.remove(2);
		ll.print();
		ll.insertFront(3);
		ll.print();
		ll.removeFront();
		ll.print();
		ll.removeFront();
		ll.print();
		ll.removeFront();
		ll.print();

		
		//STACK TESTING
		
/*
 * 		Stack<Integer> stack = new Stack<Integer>(2);
		
		stack.push(3);
		stack.print();
		

		stack.peek();
		stack.print();
		stack.push(3);
		stack.print();
		stack.push(4);
		stack.print();
		stack.peek();
		
		stack.pop();
		stack.print();
		stack.peek();
 */
		 
		Stack<String> stack = new Stack<String>("a");
		stack.push("b");
		
		stack.push("c");
		stack.print();
//		System.out.println(stack.getSize());
		stack.pop();
		stack.print();
		stack.peek();
//		System.out.println(stack.getSize());
		System.out.println(stack.pop());
		stack.print();
		System.out.println(stack.pop());
		stack.print();
		
		HashTable h = new HashTable();
		System.out.println(h.getHash());
	}
}
