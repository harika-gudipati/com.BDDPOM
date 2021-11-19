package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {

	
	//Locate the elements 
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	WebElement forgotpwd;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	//Login
	public void login(String strname, String strpwd)
	{
		username.sendKeys(strname);
		pwd.sendKeys(strpwd);
		login.click();
		
	}
	
}
