package TreeNode;

public class TreeNode<T> {
	private T value;
	private TreeNode<T> left;
	private TreeNode<T> right;
	
	public TreeNode(T value) {
		this.value = value;
		this.left = null; 
		this.right = null; 
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return this.value; 
	}
	
	public TreeNode<T> getLeft() {
		return this.left;
	}
	
	public TreeNode<T> getRight() {
		return this.right;
	}
	
	public void setLeft(T value) {
		TreeNode<T> node = new TreeNode<T>(value); 
		this.left = node;
	}
	
	public void setLeft(TreeNode<T> node) {
		this.left = node;
	}
	
	public void setRight(T value) {
		TreeNode<T> node = new TreeNode<T>(value);
		this.right = node;
	}
	
	public void setRight(TreeNode<T> node) {
		this.right = node;
	}
	
	//checks only the value, not left and right subtrees
	public boolean equals(TreeNode<T> node) {
		if(this.getValue() == node.getValue()) {
			return true; 
		}
		return false;
	}
}
