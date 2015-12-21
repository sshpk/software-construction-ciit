import org.junit.Assert;
import org.junit.Test;

public class AppTest1 {

	@Test
	public void testPrintHelloWorld() {

		Assert.assertEquals(App.getHelloWorld(), "Hello World");

	}

}