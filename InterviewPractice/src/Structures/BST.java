package Structures;

import TreeNode.TreeNode;

/*
 * 					10
 * 				4			16
 * 			1	  7		12		18
 * 
 */

public class BST<T> {

	private TreeNode<T> root;
	
	public BST(T value) {
		TreeNode<T> root = new TreeNode<T>(value);
		this.root = root;
		//left and right should be null
	}
	
	//duplicates not allowed
	//if greater than root, go to the right
	//if less than, then go left
	//go till find null, then add
	public void add(T value) {
		if(this.root.getValue() == value) {
			return;
		}
		
		TreeNode<T> current = this.root;
		add(current, value);
	}
	
	private void add(TreeNode<T> node, T value) {
		if(node.getValue() == value) {
			return;
		}
		
//		else if(node.getValue() > 0) {
//			
//		}
//		else {
//			
//		}
	}
	
	public void delete() {
		
	}
	
}
