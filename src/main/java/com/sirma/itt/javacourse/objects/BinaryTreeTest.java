package main.java.com.sirma.itt.javacourse.objects;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import main.java.com.sirma.itt.javacourse.objects.binarytree.BinaryTree;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for testing BinaryTree structure.
 * 
 * @author radoslav
 */
public class BinaryTreeTest {

	private BinaryTree tree;
	private ArrayList<Integer> inputValues;

	/**
	 * Initializes the binary tree and a ArrayList for testing. Adds data to the
	 * tree and to the ArrayList.
	 */
	@Before
	public void init() {
		tree = new BinaryTree();
		inputValues = new ArrayList<>();
		for (int i = 0; i < 8000; i++) {
			int value = (int) ((Math.random() * (-1512) + 580) * (Math.random()
					* (-51251) + 5125)) % 1205210;
			tree.insert(value);
			if (!inputValues.contains(value)) {
				inputValues.add(value);
			}
		}
	}

	/**
	 * Compare the result of the search with ArrayList built in method.
	 */
	@Test
	public void testSearch() {
		for (int i = 1; i <= 5000; i++) {
			assertEquals(inputValues.contains(i), tree.search(i));
		}
	}

	/**
	 * Compare the returned output from the tree with the ArrayList
	 */
	@Test
	public void testTraverse() {
		tree.traverse();
		Collections.sort(inputValues);
		assertEquals(true, inputValues.equals(tree.getTraverseArray()));
	}

}
