package testngtutorials;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

	@Test
	public void test2()
	{
		String mystring="Selenium is open source";
		Assert.assertTrue(mystring.contains("opensource"),"Words Mismatch");
	}
}