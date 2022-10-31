package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPage extends TestBase
{
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//------------- Obj repo -----------------
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement  email_txtBox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txtBox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Login_Button;
	
	//--------------Action methods------------ 
	
	public void enterEmailAddress()
	{
		email_txtBox.sendKeys("shraddha.tilekar25@gmail.com");
	}
	public void enterPassword()
	{
		password_txtBox.sendKeys("shr@123456");
	}
	public void clickOnLoginButton()
	{
		Login_Button.click();
	}
}
