package main.java.com.sirma.itt.javacourse.objects.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Sumator Class: For given 2 numbers it calculates their sum
 * 
 * @author Radoslav
 */

public class Sumator {
	private BigInteger sumBigInteger;
	private BigDecimal sumBigDecimal;

	/**
	 * via the Sumator() constructor the initialization of variables is done
	 * 
	 */
	public Sumator() {
		sumBigInteger = new BigInteger("0");
		sumBigDecimal = new BigDecimal(0);
	}

	/**
	 * 
	 * @param a
	 *            numberA (int)
	 * @param b
	 *            numberB (int)
	 * @return their sum (int)
	 */
	public int sum(int a, int b) {
		return a + b;
	}

	// same as the int type
	public float sum(float a, float b) {
		return a + b;
	}

	/**
	 * Making a new BigInteger object and add both @param a , @param b to it
	 * 
	 * 
	 * @param a
	 *            BigInteger object
	 * @param b
	 *            BigInteger object
	 * @return String representation of the new BigInteger object in which we
	 *         keep the sum
	 */
	public String sum(BigInteger a, BigInteger b) {
		sumBigInteger = sumBigInteger.add(a);
		sumBigInteger = sumBigInteger.add(b);
		return sumBigInteger.toString();
	}

	// same as BigInteger type
	// only the @param a,b are BigDecimal
	// and we store the sum in BigDecimal object
	public String sum(BigDecimal a, BigDecimal b) {
		sumBigDecimal = sumBigDecimal.add(a);
		sumBigDecimal = sumBigDecimal.add(b);
		return sumBigDecimal.toString();
	}

	/**
	 * Summing 2 string numbers, requires own implementation or making a
	 * BigInteger object with the string's value. Here we use the build in
	 * java.math.BigInteger
	 * 
	 * @param a
	 *            number is passed in a string
	 * @param b
	 *            number is passed in a string
	 * @return the String representation of the BigInteger object
	 */
	public String sum(String a, String b) {
		BigInteger numA = new BigInteger(a);
		BigInteger numB = new BigInteger(b);

		sumBigInteger = sumBigInteger.add(numA);
		sumBigInteger = sumBigInteger.add(numB);
		return sumBigInteger.toString();
	}

}
