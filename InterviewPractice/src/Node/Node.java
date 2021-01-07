package Node;

// <T> means of type T, which will be determined during runtime.
public class Node<T> {
	
	//instance variables
	
	private T value;
	
	// -> T1 -> T2 -> null
	
	private Node<T> next;
	
	//constructor -> node object
	public Node(T value) {
		this.value = value;
		this.next = null;
	}
	
	//getters and setters
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public T getValue() {
		return this.value;
	}
	
	public Node<T> getNext() {
		return this.next;
	}
	
	public String toString() {
		return this.getValue() + "";
	}
}
