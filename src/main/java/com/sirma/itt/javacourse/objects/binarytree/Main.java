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
		tree.insert(5);
		tree.insert(5);
		tree.insert(-1);

		// tree.traverse();
		System.out.println(tree.search(1009));

	}

}
