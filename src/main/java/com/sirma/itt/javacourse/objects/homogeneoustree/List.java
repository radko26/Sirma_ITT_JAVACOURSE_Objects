package main.java.com.sirma.itt.javacourse.objects.homogeneoustree;

import main.java.com.sirma.itt.javacourse.objects.homogeneoustree.Node;

/**
 * List class, own implementation.Every element has its own adress via node.
 * 
 * @author radoslav
 */

public class List {

	private Node root;

	/**
	 * Initialize the first element of the list
	 */
	public List() {
		root = null;
	}

	/**
	 * Insert method.
	 * 
	 * @param current
	 *            current node
	 * @param data
	 *            value of the element
	 * @param parent
	 *            the node from which we came here
	 * @return
	 */
	public Node insert(Node current, Element<?, ?> data, Node parent) {
		if (current == null) {
			current = new Node();
			current.setParent(parent);
			current.setData(data);
		} else {
			current.setNext(insert(current.getNext(), data, current));
		}
		return current;
	}

	/**
	 * Predefined method insert.
	 * 
	 * @param data
	 */
	public void insert(Element<?, ?> data) {
		root = insert(root, data, null);
	}

	/**
	 * Search for specific element in the list by checking if the current
	 * element's value is what is looked for.
	 * 
	 * @param current
	 * @param data
	 *            the value of the element
	 */
	public void search(Node current, Element<?, ?> data) {
		if (current.getData() == data) {
			System.out.println(data.toString());
			return;
		} else if (current.getNext() == null) {
			return;
		} else
			search(current.getNext(), data);
	}

	/**
	 * Predefined method search.
	 * 
	 * @param data
	 */
	public void search(Element<?, ?> data) {
		search(root, data);
	}
}