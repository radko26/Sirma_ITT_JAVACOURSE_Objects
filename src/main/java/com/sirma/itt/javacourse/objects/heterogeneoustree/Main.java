package main.java.com.sirma.itt.javacourse.objects.heterogeneoustree;

/**
 * Main class , declares a tree and use it.
 * 
 * 
 * @author radoslav
 */

public class Main {
	public static void main(String[] args) {
		Element<String, Integer> s = new Element<String, Integer>("name", 1);
		Element<String, String> s1 = new Element<String, String>("name",
				"kroasan");
		Element<Integer, Integer> p = new Element<Integer, Integer>(12, 543);
		Element<Integer, Integer> p1 = new Element<Integer, Integer>(12, 681);
		Element<Integer, Integer> p2 = new Element<Integer, Integer>(12, 982);

		Tree l = new Tree();
		l.insert(s);
		l.insert(p);
		l.insert(p1);
		l.insert(p2);
		l.insert(s1);

		l.search(s);
		l.search(p);
		l.search(p2);
	}
}
