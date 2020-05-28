package pk.cuiatd.sc.calc;
import static org.junit.Assert.*;
import org.junit.Test;

public class CustomDateTest {
	@Test
	public void testDateBasic(){
		CustomDate date = new CustomDate("07/01/2020");
		assertEquals(7, date.getDay());
		assertEquals(1, date.getMonth());
		assertEquals(2020, date.getYear());
	}
	@Test
	public void testDateAcrossMonth(){
		CustomDate date = new CustomDate("32/01/2020");
		assertEquals(1, date.getDay());
		assertEquals(2, date.getMonth());
		assertEquals(2020, date.getYear());
	}
	@Test
	public void testNextDay(){
		CustomDate date = new CustomDate("07/01/2020");
		date.nextDay();
		assertEquals(8, date.getDay());
		assertEquals(1, date.getMonth());
		assertEquals(2020, date.getYear());
	}
	@Test
	public void testAddDaysAcrossMonth(){
		CustomDate date = new CustomDate("30/12/2019");
		date.addDays(20);
		assertEquals(19, date.getDay());
		assertEquals(1, date.getMonth());
		assertEquals(2020, date.getYear());
	}
}
