package testngtutorials;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo2 {

	
	@Test
	public void test1()
	{
		Assert.assertEquals(20,30);
	}
	@Test
	public void test2()
	{
		Assert.assertEquals("Test", "Test","words dont match");
	}
}
