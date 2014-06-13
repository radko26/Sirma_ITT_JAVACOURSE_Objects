package main.java.com.sirma.itt.javacourse.objects.binarytree;

public class BinaryTree {
	private Node root;

	public BinaryTree() {
		root = null;
	}

	public Node insert(Node current, int data, Node parent) {
		if (current == null) {
			current = new Node();
			current.setParent(parent);
			current.setLeft(null);
			current.setRight(null);
			current.setData(data);
		} else if (data < current.getData() && !search(data)) {
			current.setLeft(insert(current.getLeft(), data, current));
		} else if (data > current.getData() && !search(data)) {
			current.setRight(insert(current.getRight(), data, current));
		}
		return current;
	}

	public void insert(int data) {
		root = insert(root, data, null);
	}

	public boolean search(Node current, int data) {
		if (current == null) {
			return false;
		}
		if (current.getData() == data) {
			return true;
		}
		if (data < current.getData()) {
			search(current.getLeft(), data);
		}
		return search(current.getRight(), data);
	}

	public boolean search(int data) {
		return search(root, data);
	}

	public Node findMin() {
		Node min = root;
		if (min == null) {
			return null;
		}
		while (min.getLeft() != null) {
			min = min.getLeft();
		}
		return min;
	}

	public void traverse(Node current) {
		if (current == null) {
			return;
		}
		traverse(current.getLeft());
		System.out.println(current.getData());
		traverse(current.getRight());
	}

	public void traverse() {
		traverse(root);
	}
}
