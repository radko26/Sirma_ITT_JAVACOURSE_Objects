package main.java.com.sirma.itt.javacourse.objects.homogeneoustree;

/**
 * Node class
 * 
 * @author radoslav
 */
public class Node {

	private Node next;
	private Node parent;
	private Element<?, ?> data;

	/**
	 * 
	 * @return the element class variable
	 */
	public Element<?, ?> getData() {
		return data;
	}

	/**
	 * 
	 * @return the node of the element which is next to the current one
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * 
	 * @return the node of the element which is our "parent", the previous one
	 *         to the current
	 */
	public Node getParent() {
		return parent;
	}

	/**
	 * Set methods for giving the private variables value
	 * 
	 * @param data
	 */
	public void setData(Element<?, ?> data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

}
