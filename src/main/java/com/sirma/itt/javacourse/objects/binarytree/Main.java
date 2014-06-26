package main.java.com.sirma.itt.javacourse.objects.binarytree;

/**
 * Class for testing the Binary Tree structure
 * 
 * @author radoslav
 */
public class Main {
	/**
	 * Added few elements to show how it works
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.insert(10);
		tree.insert(2);
		tree.insert(6);
		tree.insert(1);
		tree.insert(5765);
		tree.insert(5623);
		tree.insert(512);
		tree.insert(241);
		tree.insert(12);
		tree.insert(21895);
		tree.insert(-64);
		tree.insert(-86);
		tree.insert(-1);

		tree.traverse();
		for (int i = 0; i < tree.getTraverseArray().size(); i++) {
			System.out.println(tree.getTraverseArray().get(i));
		}
		System.out.println(tree.search(1009));

	}

}
