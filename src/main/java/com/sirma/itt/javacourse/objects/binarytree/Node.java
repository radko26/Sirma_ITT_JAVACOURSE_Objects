package main.java.com.sirma.itt.javacourse.objects.binarytree;

public class Node {
	private Node left;
	private Node right;
	private Node parent;
	private int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
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
