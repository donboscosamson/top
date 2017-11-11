package Ecommerce.HomeAdvisor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class IsSelectedDemo {
	
	@Test
	public void launchapp()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\donbo\\Desktop\\QA Tools\\Selenium\\geckodriver.exe");
		WebDriver wd=new FirefoxDriver();
		wd.get("http://homeadvisor.com");
		wd.findElement(By.linkText("Are You a Quality Pro?")).click();
//		wd.manage().window().maximize();
//		wd.navigate().back();
		wd.findElement(By.id("zipCode")).clear();
		wd.findElement(By.id("zipCode")).sendKeys("08902");	
		wd.findElement(By.className("t-button-standard")).click();
		
		Select  sel=new Select(wd.findElement(By.id("pwcTypeDD")));
		sel.selectByValue("60");
		System.out.println(wd.findElement(By.id("pwcTypeDD")).isSelected());
		
	}
	

}
