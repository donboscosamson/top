package Ecommerce.HomeAdvisor;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	@Test
	public void testHomepage()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\donbo\\Desktop\\QA Tools\\Selenium\\geckodriver.exe");
		WebDriver wd= new FirefoxDriver();
		wd.navigate().to("http://www.homeadvisor.com/");
		wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		String text=wd.findElement(By.xpath(".//*[@id='find-pros']/div[2]/div[3]/div/h2")).getText();
		text.isEmpty();
		//assertEquals(actual, expected);
		System.out.println("Is String there? "+text);
		Boolean result =text.equalsIgnoreCase("find trusted home improvement pros");		
		System.out.println("Result is "+result);
		
		
	}
	
	

}
