package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import main.java.com.sirma.itt.javacourse.objects.homogeneoustree.Element;
import main.java.com.sirma.itt.javacourse.objects.homogeneoustree.List;

import org.junit.Test;

/**
 * Run test class. Inserting some data into arrayList and tree and then search
 * for it in the tree.
 * 
 * @author radoslav
 */
public class Homogenoustreetest {

	@Test
	public void test() {
		List tester = new List();
		ArrayList<Element<?, ?>> elem = new ArrayList<>();
		Element<String, Integer> e;
		for (int i = 0; i < 10000; i++) {
			e = new Element<String, Integer>("saps", i);
			elem.add(e);
		}

		for (int i = 0; i < elem.size(); i++) {
			tester.insert(elem.get(i));
		}
		for (int i = 0; i < elem.size(); i++) {
			assertEquals(elem.get(i), tester.search(elem.get(i)).getData());
		}

	}

	@Test
	public void test1() {
		List tester = new List();
		ArrayList<Element<?, ?>> elem = new ArrayList<>();
		Element<String, Integer> e;
		Element<Integer, Integer> k;
		for (int i = 0; i < 10000; i++) {
			e = new Element<String, Integer>("saps", i);
			k = new Element<Integer, Integer>(i * i, i + 2);
			elem.add(e);
			elem.add(k);
		}

		for (int i = 0; i < elem.size(); i++) {
			tester.insert(elem.get(i));
		}

		for (int i = 0; i < elem.size(); i++) {
			assertEquals(elem.get(i), tester.search(elem.get(i)).getData());
		}
	}

	@Test
	public void test2() {
		List tester = new List();
		ArrayList<Element<?, ?>> elem = new ArrayList<>();
		Element<String, Integer> e;
		Element<Integer, Integer> k;
		Element<Integer, Boolean> b;
		for (int i = 0; i < 8000; i++) {
			e = new Element<String, Integer>("saps", i);
			k = new Element<Integer, Integer>(i * i, i + 2);
			b = new Element<Integer, Boolean>(i + 2, i % 2 == 0);
			elem.add(e);
			elem.add(k);
			elem.add(b);
		}

		for (int i = 0; i < elem.size(); i++) {
			tester.insert(elem.get(i));
		}

		for (int i = 0; i < elem.size(); i++) {
			assertEquals(elem.get(i), tester.search(elem.get(i)).getData());
		}
	}

}
