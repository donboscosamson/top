package Ecommerce.HomeAdvisor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BrowserCommands 

{

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
		wd.findElement(By.id("companyName")).clear();
		wd.findElement(By.id("companyName")).sendKeys("Flooring");
		wd.findElement(By.id("firstName")).clear();
		wd.findElement(By.id("firstName")).sendKeys("Kavitha");
		wd.findElement(By.id("lastName")).clear();
		wd.findElement(By.id("lastName")).sendKeys("Nalan");
		wd.findElement(By.xpath(".//*[@id='sp-enroll-business-phone']")).clear();
		wd.findElement(By.xpath(".//*[@id='sp-enroll-business-phone']")).sendKeys("946289");
		Select dropdown=new Select(wd.findElement(By.name("pwcTypeDD")));
		dropdown.selectByVisibleText("Plumber");
		wd.findElement(By.xpath(".//*[@id='createAccountForm']/button")).click();
		String error=wd.findElement(By.xpath(".//*[@id='businessPhone.errors']")).getText();
		error.contentEquals("Please enter a valid phone number");
		System.out.println("The Error is : " +error);
		
		
		
	}

}
