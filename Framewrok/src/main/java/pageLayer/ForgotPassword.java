package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class ForgotPassword extends TestBase
{
	public ForgotPassword()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='text-muted']")
	private WebElement forgotPassword;
	
	public void forgotpassword()
	{
		forgotPassword.click();
	}
}
