package main.java.com.sirma.itt.javacourse.objects.Sumator;

/**
 * Sumator problem main class
 * 
 * @author Radoslav
 */
public class Main {

	private static Sumator sumator;

	public static void main(String[] args) {
		/**
		 * @link to the sumator class
		 */
		sumator = new Sumator();
		String a = "-5650";
		String b = "1";

		System.out.println(sumator.sum(a, b));

	}

}
