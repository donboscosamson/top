package sample.pomsample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HASignupPage {

	@FindBy(id = "email")
	private WebElement email;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "retypePassword")
	private WebElement repass;
	@FindBy(id = "firstName")
	private WebElement firstname;
	@FindBy(id = "lastName")
	private WebElement lastname;
	@FindBy(id = "zip")
	private WebElement zip;
	@FindBy(xpath = ".//*[@id='signupFormVO']/div[8]/div[2]/input")
	private WebElement submit;
	@FindBy(id="password.errors")
	private WebElement passerr;
	@FindBy(xpath=".//*[@id='signupFormVO']/div[3]/div[3]/div[2]")
	private WebElement repasserr;
	

	public void setEmail(String email) {
		this.email.sendKeys(email);

	}

	public void setPasswords(String pass, String rePass) {
		this.password.sendKeys(pass);
		this.repass.sendKeys(rePass);

	}

	public void setNames(String firstName, String lastName) {
		this.firstname.sendKeys(firstName);
		this.lastname.sendKeys(lastName);

	}

	public void setZip(String zip) {
		this.zip.sendKeys(zip);

	}

	public void sigupClick() {
		this.submit.click();

	}
	public String getPassErr()
	{
		return passerr.getText();
	}
	public String getRePassErr()
	{
		return repasserr.getText();
	}

}
