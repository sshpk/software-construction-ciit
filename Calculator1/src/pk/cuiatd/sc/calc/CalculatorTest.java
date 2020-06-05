package pk.cuiatd.sc.calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		assertEquals(6,calc.add(1, 5));
	}
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		assertEquals(-4,calc.subtract(1, 5));
	}
	@Test(expected=IllegalArgumentException.class)
	public void testDevide1(){
		Calculator calc = new Calculator();
		calc.devide(10, 0);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testDevide2(){
		Calculator calc = new Calculator();
		calc.devide(10, 2);
	}

}
