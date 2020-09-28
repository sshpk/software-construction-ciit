package testing;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExamTest {
	@Test
	public void cToFTest() {
		assertEquals(32, Exam.cToF(0));
		assertEquals(98, Exam.cToF(37));
		assertEquals(212, Exam.cToF(100));
	}

	@Test
	public void fToCTest() {
		assertEquals(0, Exam.fToC(32));
		assertEquals(37, Exam.fToC(100));
		assertEquals(100, Exam.fToC(212));
	}
	
	@Test
	public void removeExclaimationTest(){
		assertEquals("hello How are you", Exam.removeExclaimation("hello! How are you!"));
	}
	
	@Test
	public void currentDayTest(){
		assertEquals(10, Exam.currentDay());
	}
	@Test
	public void currentMonthTest(){
		assertEquals(6, Exam.currentMonth());
	}
	@Test
	public void currentYearTest(){
		assertEquals(2020, Exam.currentYear());
	}
}
