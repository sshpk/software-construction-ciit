package pk.ciit.JunitMaven;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class CalculatorTest {
	private static ICalculator calculator;
	
	@BeforeClass
	public static void initCalculator(){
		calculator = new Calculator();
		System.out.println("This is executed before class");
	}
	
	@Before
	public void beforeEachTest(){
		System.out.println("This is executed before each Test");
	}
	@After
	public void afterEachTest(){
		System.out.println("This is exceuted after each Test");
	}
	@Test
	public void testAdd(){
		int result = calculator.add(3, 4);
		
		assertEquals(7, result);
	}
	@Test
	public void testSubtract(){
		int result = calculator.subtract(10, 3);
		
		assertEquals(7, result);
	}
	@Test
	public void testDevide(){
		int result = calculator.devide(10, 2);
		
		assertEquals(5, result);
	}
	@Ignore
	@Test (expected = ArithmeticException.class)
	public void testDevideException() throws ArithmeticException{
		calculator.devide(10, 0);
	}
}