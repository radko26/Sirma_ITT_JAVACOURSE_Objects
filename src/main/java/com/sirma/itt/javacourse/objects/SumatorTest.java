package main.java.com.sirma.itt.javacourse.objects;

import static org.junit.Assert.*;
import main.java.com.sirma.itt.javacourse.objects.sumator.Sumator;

import org.junit.Before;
import org.junit.Test;

/**
 * Test Sumator class
 * 
 * @author radoslav
 */

public class SumatorTest {

	private Sumator testerSumator;

	/**
	 * Initialize variables.
	 */
	@Before
	public void init() {
		testerSumator = new Sumator();
	}

	/**
	 * Tests the sum of two integers.
	 */
	@Test
	public void testSumWithInt() {
		for (int i = 0; i < 12000; i++) {
			int firstNumber = (int) (Math.random() * (-25) + 1251);
			int secondNumber = (int) (Math.random() * 10 + 1251);
			assertEquals(firstNumber + secondNumber,
					testerSumator.sum(firstNumber, secondNumber));
		}
	}

	/**
	 * Tests the sum of two float numbers.
	 */
	@Test
	public void testSumWithDouble() {
		for (int i = 0; i < 12000; i++) {
			float firstNumber = (float) (Math.random() * (-25) + 1251);
			float secondNumber = (float) (Math.random() * 10 + 1251);
			assertEquals(firstNumber + secondNumber,
					testerSumator.sum(firstNumber, secondNumber), 0);
		}
	}

	/**
	 * Tests the sum of two numbers represented by strings.
	 */
	@Test
	public void testSumWithStrings() {
		for (int i = 0; i < 12000; i++) {
			int firstNumber = (int) (Math.random() * 1 + 12000);
			int secondNumber = (int) (Math.random() * 1 + 12511);

			assertEquals(
					Integer.toString(firstNumber + secondNumber),
					testerSumator.sum(Integer.toString(firstNumber),
							Integer.toString(secondNumber)));
		}
	}

}
