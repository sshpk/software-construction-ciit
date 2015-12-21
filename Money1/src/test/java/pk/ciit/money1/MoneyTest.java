package pk.ciit.money1;
import junit.framework.*;


public class MoneyTest extends TestCase {
	private Money f12CHF;			// fixtures
	private Money f14CHF;

	protected void setUp() {		// create the test data
		f12CHF = new Money(12, "CHF");
		f14CHF = new Money(14, "CHF");
	}
    public void testAdd() {				// create the test data
		Money expected = new Money(26, "CHF");
		assertEquals("amount not equal",
                     expected,f12CHF.add(f14CHF));
	}
}

