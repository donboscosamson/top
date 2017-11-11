package testngtutorials;

import org.testng.annotations.Test;

public class DemoTest {
	
	
	@Test(priority=3,description="This testcase will verify TC1")
	public void testcase1()
	{
		System.out.println("Test case 3 executed");
	}
	
	
	@Test(priority=2,description="This testcase will verify TC2")
	public void testcase2()
	{
		System.out.println("Test case2 executed");
	}
	
	
	@Test(priority=1,description="This testcase will verify TC3")
	public void testcase3()
	{
		System.out.println("Test case1 executed");
	}
}
