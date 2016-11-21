package pk.ciit.Calc;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	private static ICalculator calculator;
	
	@BeforeClass
	public static void beforeClass(){
		calculator = new Calculator();
		System.out.println("this is executed before class");
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("this is executed after class");
	}
	@Before
	public void before(){
		System.out.println("this is executed before each test");
	}
	@After
	public void after(){
		System.out.println("this is executed after each test");
	}
	@Test
	public void addTest(){
		int result = calculator.add(3, 2);
		
		assertEquals(5, result);
		System.out.println("tested the add method");
	}
	@Ignore
	@Test
	public void subtractTest(){
		int result = calculator.subtract(5, 2);
		
		assertEquals(-3, result);
		System.out.println("tested the subtract method");
	}
	@Test
	public void multiplyTest(){
		int result = calculator.multiply(3, 2);
		
		assertEquals(6, result);
		System.out.println("tested the multiply method");
	}
	@Test
	public void devideTest(){
		int result = calculator.devide(6, 2);
		
		assertEquals(3, result);
		System.out.println("tested the devide method");
	}
	@Test (expected = ArithmeticException.class)
	public void testDevideException() throws ArithmeticException{
		calculator.devide(6, 0);
	}
	

}
