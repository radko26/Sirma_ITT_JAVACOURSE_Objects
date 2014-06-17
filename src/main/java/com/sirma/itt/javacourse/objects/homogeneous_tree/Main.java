package main.java.com.sirma.itt.javacourse.objects.homogeneous_tree;

/**
 * Main class to run it
 * 
 * 
 * @author radoslav
 */

public class Main {

	public static void main(String[] args) {

		Element<String, Integer> s = new Element<String, Integer>("name", 1);
		Element<Integer, Integer> p = new Element<Integer, Integer>(12, 543);
		Element<Double, Integer> r = new Element<Double, Integer>(84.65, 5653);
		Element<Integer, Boolean> v = new Element<Integer, Boolean>(1112, false);

		List l = new List();
		l.insert(s);
		l.insert(p);
		l.insert(r);
		l.insert(v);

		l.search(s);
		l.search(p);
		l.search(r);
		l.search(v);

	}

}
