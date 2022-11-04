package testLayer;

import org.testng.annotations.Test;

import pageLayer.ForgotPassword;
import testBase.TestBase;

public class ForgotPasswordTest extends TestBase
{
	String expected_url = "https://www.apps.dalalstreet.ai/dashboard";
	
	@Test
	public void verifyForgotPassword() throws InterruptedException 
	{
		ForgotPassword forgotpswd = new ForgotPassword();
		forgotpswd.forgotpassword();
		Thread.sleep(3000);
	}
	
}
