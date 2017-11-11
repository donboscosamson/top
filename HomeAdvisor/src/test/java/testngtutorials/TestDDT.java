package testngtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDDT {

	@Test(dataProvider = "testdata")
	public void TestFireFox(String uname, String password) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\donbo\\workspace\\pageObjectSamplePrj\\drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("http://www.facebook.com");
		System.out.println(" Title  : "+driver.getTitle() );
		driver.findElement(By.id("email")).clear();

		driver.findElement(By.id("email")).sendKeys(uname);

		driver.findElement(By.id("pass")).clear();

		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(
				By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input"))
				.click();
		System.out.println(" New Title  : "+driver.getTitle() );
  
		Assert.assertTrue(driver.getTitle().equals("Facebook"), "User is unable to login");
		System.out.println("Page title verified - User is logged in");
		driver.close();

	}

	@DataProvider(name = "testdata")
	public Object[][] TestDataFeed() {

		Object[][] facebookdata = new Object[2][2];

		facebookdata[0][0] = "josebose2007@gmail.com";

		facebookdata[0][1] = "nikhil2008";

		facebookdata[1][0] = "Selenium2@gmail.com";

		facebookdata[1][1] = "Password2";

		return facebookdata;
	}

}
