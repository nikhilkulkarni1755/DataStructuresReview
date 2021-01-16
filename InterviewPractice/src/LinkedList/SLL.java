package LinkedList;

import Node.Node;

public class SLL<T> {

	//pointer to a node
	private Node<T> head;	
	
	private Node<T> tail;
	
	private int size;
	
	/*
	 * Duplicates are allowed
	 * 
	 */
	
	//hello world
	//1 -> null
	public SLL(Node<T> head) {
		this.head = head;
		this.tail = null;
		checkSize();
	}
	
	public Node<T> getHead() {
		return this.head;
	}
	
	public void setHead(Node<T> head) {
		this.head = head;
	}
	
	private void checkSize() {
		this.size = 0;
		Node<T> current = this.head;
		while(current != null) {
			size++;
			current = current.getNext();
		}
		
		
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
		size++;
	}
	
	//O(n) 
	public void insertEnd(T value) {
		Node<T> node = new Node<T>(value);
		
		setTail();
		
		this.tail.setNext(node);
		//changing tail pointer is important. 
		this.tail = node;
		size++;
	}
	
	public void print() {
		Node<T> current = head;
		
		while(current != null) {
			System.out.print(current.getValue() + " -> ");
			current = current.getNext();
		}
		
		System.out.println("null");
	}
	
	//recursive reverse
	//how would one go about doing something like this
	//put all the info in the parameters
	//base case -> if current == null, return
	public void reverseRec() {
		Node<T> current = this.head; 
		this.head = reverseRec(current, null);
	}
	
	private Node<T> reverseRec(Node<T> current, Node<T> result) {
		//base case
		
		if(current == null) {
			return result;
		}
		//current != null
		//result is null or it isnt
		if(result == null) {
			result = new Node<T>(current.getValue());
			result.setNext(null);
		}
		else {
			Node<T> temp = new Node<T>(current.getValue());
			temp.setNext(result);
			result = temp;
		}
		
		return reverseRec(current.getNext(), result);
	}
	
	//changes value of this.head
	//1 -> 2 -> 3 -> null
	//3 -> 2 -> 1 -> null
	//to reverse, make first node value point to null
	//make subsequent nodes point to this first node we have
	public void reverse() {
		Node<T> current = this.head;
		Node<T> result = null;
		while(current != null) {
			if(result == null) {
				result = new Node<T>(current.getValue());
				result.setNext(null);
				//System.out.println("here");
				
				//if null, sets the first node to be last by making it pt to null;
			}
			else {
				//result != null, so 1 -> null
				//now pts to 2 -> 3 -> null
				//make 2 -> 1 -> null
				
				//no changes to current. 
				Node<T> temp = new Node<T>(current.getValue()); 
				temp.setNext(result);
				result = temp;
				//Node<T> prnt = result;
				//System.out.println("printing out the node");
				//while(prnt != null) {
				//	System.out.print(prnt.getValue() + " -> ");
				//	prnt = prnt.getNext();
				//}
				//System.out.println("null");
			}
			current = current.getNext();
		}
		
		this.head = result;
	}
	
	//3 -> 2 -> 1 -> null
	//2
	//3 is prev
	//2 is current
	//3 -> 1 -> null
	//3.setNext(1)
	/**
	 * 
	 * @param node
	 * @return First node with value of T
	 */
	public boolean remove(T node) {
		Node<T> current = this.head;
		// 1 -> 2 -> 3 -> null
		Node<T> prev = null;
		while(current != null) {
			if(current.getValue() == node) {
				
				if(prev != null) {
					prev.setNext(current.getNext());
				}
				else {
					//removing first node
					//1 -> 2 -> 3 -> null
					//2 -> 3 -> null
					//1 -> null
					Node<T> temp = current.getNext();
					this.head = temp;
				}
				this.size--;
				return true;
			}
			
			prev = current;
			current = current.getNext();
		}
		size--;
		//check the last thing
		
		return false;
	}
	
	public boolean remove(T node, int index) {
		int found = 1;
		Node<T> current = this.head;
		// 1 -> 2 -> 3 -> null
		Node<T> prev = null;
		while(current != null) {
			if(current.getValue() == node && (found == index)) {
				
				if(prev != null) {
					prev.setNext(current.getNext());
				}
				else {
					//removing first node
					//1 -> 2 -> 3 -> null
					//2 -> 3 -> null
					//1 -> null
					Node<T> temp = current.getNext();
					this.head = temp;
				}
				this.size--;
				return true;
			}
			else if(current.getValue() == node){
				found++;
				prev = current;
				current = current.getNext();
			}
			else { 
				prev = current;
				current = current.getNext();
			}
			
			
		}
		size--;
		//check the last thing
		
		return false;
	}
	
	public int getSize() {
		return this.size;
	}
}
