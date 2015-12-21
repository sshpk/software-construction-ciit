package pk.ciit.Money2;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class MoneyTest {
	private Money f12CHF;
	private Money f14CHF;

	@Before public void setUp() {	// create the test data
		f12CHF = new Money(12, "CHF");
		f14CHF = new Money(14, "CHF");
	}
	@Test public void testEquals() {
		assertNotNull(f12CHF);
		assertEquals(f12CHF, f12CHF);
		assertEquals(f12CHF, new Money(12, "CHF"));
		assertFalse(f12CHF.equals(f14CHF));
	}

	@Test public void testSimpleAdd() {
		Money expected = new Money(26, "CHF");
		Money result = f12CHF.add(f14CHF);
		assertEquals(expected, result);
	}

}

