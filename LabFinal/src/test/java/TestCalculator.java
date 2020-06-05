import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;

import pk.edu.cuiatd.labfinal.Calculator;
public class TestCalculator {
	private static Calculator calculator;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
		calculator = new Calculator();
	}
	@Test  
	public void testFindMax1(){  
		assertEquals(4,calculator.findMax(1,3,4));  
	} 
	@Test  
	public void testFindMax2(){  
		assertEquals(-1,calculator.findMax(-12,-1,-2));  
	} 
	@Test  
	public void testFindMax3(){  
		assertEquals(2,calculator.findMax(0,-7,2));  
	} 
	@Test  
	public void testSquare1(){  
		assertEquals(9,calculator.square(3));  
	}
	@Test  
	public void testSquare2(){  
		assertEquals(25,calculator.square(5));  
	}
	@Test (expected = IllegalArgumentException.class) 
	public void testSquare3(){  
		calculator.square(-1);  
	}
	@AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  
}
