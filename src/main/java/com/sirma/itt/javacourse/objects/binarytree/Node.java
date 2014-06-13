package main.java.com.sirma.itt.javacourse.objects.binarytree;

/**
 * Node class Keeps the information about the node - its left/right child and
 * its value
 * 
 * @author radoslav
 */
public class Node {
	private Node left;
	private Node right;
	private Node parent;
	private int data;

	/**
	 * Get methods for getting the desired value of the Node
	 * 
	 * @return
	 */
	public int getData() {
		return data;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public Node getParent() {
		return parent;
	}

	/**
	 * Set methods to fill in the Node's fields
	 * 
	 * @param
	 */

	public void setData(int data) {
		this.data = data;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

}
