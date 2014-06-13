package main.java.com.sirma.itt.javacourse.objects.binarytree;

public class Main {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.insert(10);
		tree.insert(2);
		tree.insert(6);
		tree.insert(1);
		tree.insert(5);
		tree.insert(5);
		tree.insert(-1);

		tree.traverse();

	}

}
