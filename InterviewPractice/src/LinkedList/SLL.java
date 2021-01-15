package LinkedList;

import Node.Node;

public class SLL<T> {

	//pointer to a node
	Node<T> head;	
	
	Node<T> tail;
	// 1 -> 2 -> 4 -> 1 -> null
	
	//3
	
	// 3 -> null
	
	// 3 -> 1 -> 2 -> 7 -> 4 -> 1 -> 5 -> null
	
	// -> 3 -> 1 -> 2 -> 4 -> 1 -> null
	
	// 3 -> 1 -> 2 -> 7 -> 4 -> 1 -> 5 -> null
	
	//10 -> null
	
	// 3 -> 1 -> 2 -> 7 -> 4 -> 1 -> 5 -> 10 -> null
	
	/*
	 * Duplicates are allowed
	 * 
	 */
	
	//hello world
	//1 -> null
	public SLL(Node<T> head) {
		this.head = head;
		this.tail = null;
	}
	
	//run once to find the tail
	//O(n), n is the size of the LL
	private void setTail() {
		Node<T> current = this.head;
		while(current != null) {
			this.tail = current;
			current = current.getNext();
		}
	}
	
	//O(1) work
	public void insertFront(T value) {
		
		//next is null
		Node<T> node = new Node<T>(value);
		node.setNext(head);
		this.head = node;
	}
	
	//O(n) 
	public void insertEnd(T value) {
		Node<T> node = new Node<T>(value);
		
		if(this.tail == null) {
			setTail(); // go through the whole LL to find tail
		}
		
		this.tail.setNext(node);
		//changing tail pointer is important. 
		this.tail = node;
	}
	
	public void print() {
		Node<T> current = head;
		
		while(current != null) {
			System.out.print(current.getValue() + " -> ");
			current = current.getNext();
		}
		
		System.out.println("null");
	}
	/*
	public boolean remove(Node<T> node) {
		
	}
	*/
	
	//changes value of this.head
	//1 -> 2 -> 3 -> null
	//3 -> 2 -> 1 -> null
	public void reverse() {
		Node<T> current = this.head;
		Node<T> result = null;
		while(current != null) {
			if(result == null) {
				result = new Node<T>(current.getValue());
				result.setNext(null);
				System.out.println("here");
				
				//if null, sets the first node to be last by making it pt to null;
			}
			else {
				//result != null, so 1 -> null
				//now pts to 2 -> 
				//make 2 -> 1 -> null
				
				//no changes to current. 
				Node<T> temp = new Node<T>(current.getValue()); 
				temp.setNext(result);
				result = temp;
				Node<T> prnt = result;
				System.out.println("printing out the node");
				while(prnt != null) {
					System.out.print(prnt.getValue() + " -> ");
					prnt = prnt.getNext();
				}
				System.out.println();
			}
			current = current.getNext();
		}
		
		this.head = result;
	}
	
	public boolean remove(T node) {
		Node<T> current = this.head;
		// 1 -> 2 -> 3 -> null
		
		while(current.getNext() != null) {
			if(current.getNext().getValue() == node) {
				//remove
				Node<T> prev = current;
				Node<T> next = current.getNext().getNext();
				return true;
				
				//bridge
			}
			current = current.getNext();
		}
		
		//check the last thing
		
		return false;
	}
	
	//runner code
	public static void main(String [] args) {
		Node<Integer> node = new Node<Integer>(1);
		node.setNext(new Node<Integer>(2));
		SLL<Integer> ll = new SLL<Integer>(node);
		//ll.print();
		ll.insertFront(3);
		//ll.print();
		//ll.setTail();
		//System.out.println("Tail -> " + ll.tail); //gibberish
		ll.insertEnd(6);
		//ll.print();
		ll.insertEnd(6);
		ll.print(); //3 -> 1 -> 2 -> 6 -> 6 -> null
		System.out.println("reversing");
		ll.reverse();
		System.out.println("done");
		ll.print();
		
		// 1 -> 2 -> null

		//3
		
		//3 -> null
		
		//tail
		
		// 1 -> 2 -> 3 -> null
	}
}
