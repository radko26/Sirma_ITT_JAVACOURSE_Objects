package main.java.com.sirma.itt.javacourse.objects.sumator;

/**
 * Sumator problem main class
 * 
 * @author Radoslav
 */
public class Main {

	private static Sumator sumator;

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		sumator = new Sumator();
		String a = "-5650";
		String b = "1";

		System.out.println(sumator.sum(a, b));

	}

}
