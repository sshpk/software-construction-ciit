package pk.ciit.bank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestCalculator {
	static Calculator calc;

	@BeforeClass
	public static void setUp() {
		calc = new Calculator();
	}
	@Ignore
	@Test
	public void testFindMaxPositive() {
		System.out.println("test case find max");
		assertEquals(4, calc.findMax(1, 3, 4));

	}

	@Test
	public void testFindMaxPositiveNegative() {
		System.out.println("test case find max");
		assertEquals(-2, calc.findMax(-2, -3, -4));

	}
}
