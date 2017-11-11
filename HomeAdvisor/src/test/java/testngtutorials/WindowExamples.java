package testngtutorials;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowExamples {
	
	public static WebDriver driver;

	@Test

	public void verifySearchInNewWindow() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\donbo\\Desktop\\QA Tools\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.homeadvisor.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='footer']/div[2]/div/div[1]/div/a[1]")).click();
		String newTitle = getCurrentWindowTitle();
		System.out.println("Main window title: " + newTitle);
		waitForNewWindowAndSwitchToIt(driver);
		

	}

	public static String getCurrentWindowTitle() {
		
		String windowTitle = driver.getTitle();
		return windowTitle;
	}

	public static void waitForNewWindowAndSwitchToIt(WebDriver driver) throws InterruptedException {
		String cHandle = driver.getWindowHandle();
		System.out.println("Parent Window handle:" + cHandle);
		String newWindowHandle = null;
		for (int i = 0; i < 20; i++) {
			Set<String> allWindowHandles = driver.getWindowHandles();
			System.out.println("Size : " + allWindowHandles.size());
			if (allWindowHandles.size() > 1) {
				for (String currHandle : allWindowHandles) {
					if (!currHandle.equals(cHandle))
						newWindowHandle = currHandle;
					System.out.println("Found new handle " + newWindowHandle + " after " + i + "seconds");

				}
				driver.switchTo().window(newWindowHandle);
				System.out.println("New Window Title : " + driver.findElement(By.id("email")).isDisplayed());

				break;
			} else {
				Thread.sleep(1000);
			}
		}

	}

}
