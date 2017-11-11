package Ecommerce.HomeAdvisor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FindPros {
	
	@Test
	public void tofindPros()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\donbo\\Desktop\\QA Tools\\Selenium\\geckodriver.exe");
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.homeadvisor.com/");
		wd.findElement(By.xpath(".//*[@id='homepage-predictive-search']/div/div/input")).clear();
		wd.findElement(By.xpath(".//*[@id='homepage-predictive-search']/div/div/input")).sendKeys("Kitchen");
		wd.findElement(By.xpath(".//*[@id='homepage-predictive-search']/input")).click();
		wd.findElement(By.id("item-5")).click();
		wd.findElement(By.id("conZip" )).clear();
		wd.findElement(By.id("conZip" )).sendKeys("08902");
		wd.findElement(By.xpath(".//*[@id='fullpage']/div[3]/div[2]/div/div[1]/form/div[6]/input")).click();;
	}
	

}
