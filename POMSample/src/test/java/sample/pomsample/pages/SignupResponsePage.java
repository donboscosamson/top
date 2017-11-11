package sample.pomsample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupResponsePage {
@FindBy(xpath=".//*[@id='content']/div/div/div[2]/div[5]/div/div/div/h1")
private WebElement welcomeMsg;
	
public String getWelcomeMsg()
{
	return this.welcomeMsg.getText();
}
	
}
