package testngtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DynamicXPathDemo 

{
@Test
public void facebook()
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\donbo\\Desktop\\QA Tools\\Selenium\\geckodriver.exe");
	WebDriver wd= new FirefoxDriver();
	wd.navigate().to("http://www.homeadvisor.com/");
	System.out.println(wd.getTitle());
	wd.findElement(By.xpath("//a[@class='footer-share-bar-social-link footer-share-bar-social-facebook template-sprite footer__sprites --facebook social--links']")).click();
	//wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
}

}