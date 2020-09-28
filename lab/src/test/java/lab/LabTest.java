package lab;

import org.junit.Test;

//import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;

public class LabTest {
	@Test
	public void cToFTest() {
		assertEquals(32, Lab.centigradeToFahrenheit(0));
		assertEquals(98, Lab.centigradeToFahrenheit(37));
		assertEquals(212, Lab.centigradeToFahrenheit(100));
	}

	@Test
	public void fToCTest() {
		assertEquals(0, Lab.fahrenheitToCentigrad(32));
		assertEquals(37, Lab.fahrenheitToCentigrad(100));
		assertEquals(100, Lab.fahrenheitToCentigrad(212));
	}

	@Test
	public void removeExclaimationTest(){
		assertEquals("hello How are you", Lab.removeExclaimation("hello! How are you!"));
	}

	@Test
	public void currentDayTest(){
		assertEquals(10, Lab.getCurrentDay());
	}
	@Test
	public void currentMonthTest(){
		assertEquals(6, Lab.getCurrentMonth());
	}
	@Test
	public void currentYearTest(){
		assertEquals(2020, Lab.getCurrentYear());
	}
}
