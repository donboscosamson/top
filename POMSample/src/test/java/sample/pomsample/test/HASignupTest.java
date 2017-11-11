package sample.pomsample.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import sample.pomsample.pages.HASignupPage;
import sample.pomsample.pages.SignupResponsePage;

public class HASignupTest {

private WebDriver driver;
@Test
public void testSignup()
{
	System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.homeadvisor.com/signup");
	HASignupPage signupPage=PageFactory.initElements(driver,HASignupPage.class );
	
	signupPage.setEmail("joseboghg2009@gmail.com");
	signupPage.setNames("josed", "nathand");
	signupPage.setPasswords("donbosco2005","donbosco2005");
	signupPage.setZip("08908");
	signupPage.sigupClick();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	SignupResponsePage response=PageFactory.initElements(driver,SignupResponsePage.class);
	Assert.assertTrue(response.getWelcomeMsg().equals("Welcome, jose!"), "SignUp Test Failed");

}
@Test
public void testVerifyPassword()
{
	System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.homeadvisor.com/signup");
	HASignupPage signupPage=PageFactory.initElements(driver,HASignupPage.class );
	
	signupPage.setEmail("josebose2008@gmail.com");
	signupPage.setNames("jose", "nathan");
	signupPage.setPasswords("don","don");
	signupPage.setZip("23343");
	signupPage.sigupClick();
	System.out.println("Error Msg : "+ signupPage.getPassErr());
	Assert.assertEquals(signupPage.getPassErr(), "Password must be between 8 and 25 characters.","Password err msg not displayed");
}



	

}
