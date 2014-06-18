package main.java.com.sirma.itt.javacourse.objects.homogeneoustree;

/**
 * Generic type class
 * 
 * @param <T>
 *            type
 * @param <V>
 *            value
 * @author radoslav
 */

public class Element<T, V> {
	private T type;
	private V value;

	public Element(T type, V value) {
		this.type = type;
		this.value = value;
	}

	/**
	 * Return methods for the private variables
	 * 
	 * @return
	 */
	public T getType() {
		return type;
	}

	public V getValue() {
		return value;
	}

	public String toString() {
		return type + ": " + value;
	}

}
