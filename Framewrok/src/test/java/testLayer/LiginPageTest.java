package testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageLayer.LoginPage;
import testBase.TestBase;
import utility.UtilClass;

public class LiginPageTest extends TestBase
{
	String expected_url = "https://www.apps.dalalstreet.ai/dashboard";
	
	@Test
	public void verifyLoginTest() throws InterruptedException
	{
		//create object for login page
		LoginPage login = new LoginPage();
		UtilClass util = new UtilClass();
		
		//calling login page methods
		login.enterEmailAddress();
		login.enterPassword();
		login.clickOnLoginButton();
		Thread.sleep(3000);
		String actual_url = util.getUrl();
		Assert.assertEquals(actual_url, expected_url);	
	}

}
