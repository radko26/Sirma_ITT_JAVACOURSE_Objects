package main.java.com.sirma.itt.javacourse.objects.binarytree;

import java.util.ArrayList;

/**
 * Binary tree implementation with search,traverse and add functions
 * 
 * @author radoslav
 */
public class BinaryTree {
	private Node root;
	private ArrayList<Integer> traverseArray;

	/**
	 * Initialize the root of the tree
	 */
	public BinaryTree() {
		root = null;
		traverseArray = new ArrayList<>();
	}

	/**
	 * Inserts a new query, which position depends if it is greater or smaller
	 * than the parent At the beginning we initialize the first query as a root
	 * 
	 * @param current
	 *            current node
	 * @param data
	 *            current value
	 * @param parent
	 *            the parent of the current node
	 * @return the new tree
	 */
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

	/**
	 * The root of the subtree is the newly added element
	 * 
	 * @param data
	 */
	public void insert(int data) {
		root = insert(root, data, null);
	}

	/**
	 * Traversing the Binary tree and looking for a specified information If the
	 * data is greater than the parent , search in the right children if not
	 * then search in the left
	 * 
	 * @param current
	 *            current node
	 * @param data
	 *            the value
	 * @return True if the data was found and false if it wasn't
	 */
	public boolean search(Node current, int data) {
		if (current == null) {
			return false;
		}
		if (current.getData() == data) {
			return true;
		}
		if (data < current.getData()) {
			return search(current.getLeft(), data);
		}
		return search(current.getRight(), data);
	}

	/**
	 * Start the search from the root
	 * 
	 * @param data
	 *            value
	 * @return true if the tree contains the value and false if does not.
	 */
	public boolean search(int data) {
		return search(root, data);
	}

	/**
	 * Traverse the left children and find the minimum
	 * 
	 * @return the min
	 */
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

	/**
	 * If the root is reached stop else visit the left then the root and then
	 * right child
	 * 
	 * @param current
	 *            the current node
	 */
	public void traverse(Node current) {
		if (current == null) {
			return;
		}
		traverse(current.getLeft());
		traverseArray.add(current.getData());
		traverse(current.getRight());
	}

	public ArrayList<Integer> getTraverseArray() {
		return traverseArray;
	}

	/**
	 * Starts the traverse from the sub/root of the tree
	 */
	public void traverse() {
		traverse(root);
	}
}
