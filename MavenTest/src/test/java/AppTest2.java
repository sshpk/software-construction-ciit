import org.junit.Assert;
import org.junit.Test;

public class AppTest2 {

	@Test
	public void testPrintHelloWorld() {

		Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");

	}

}