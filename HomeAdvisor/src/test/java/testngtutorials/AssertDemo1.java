package testngtutorials;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertDemo1 {
	
	@Test
	public void test1()
	{

	System.setProperty("webdriver.gecko.driver", "C:\\Users\\donbo\\Desktop\\QA Tools\\Selenium\\geckodriver.exe");
	WebDriver wd= new FirefoxDriver();
	wd.get("https://www.google.com/");
	String s=wd.getTitle();
	System.out.println(s);
	
	Assert.assertEquals("Google", s,"Values Did Not Equal");
	}
}
