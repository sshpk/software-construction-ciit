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
	public void testAdd2() {
		Calculator calc = new Calculator();
		assertEquals(0,calc.subtract(1, 5));
	}
	@Test(expected=IllegalArgumentException.class)
	public void testDevide(){
		Calculator calc = new Calculator();
		calc.devide(10, 0);
	}

}
