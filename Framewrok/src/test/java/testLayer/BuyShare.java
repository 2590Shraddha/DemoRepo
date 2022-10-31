package com.testLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.Dashboard;
import com.pageLayer.ExchangeBuy;
import com.pageLayer.LoginPage;
import com.testBase.TestBase;

public class BuyShare extends TestBase
{
String expected_msg = "Order Created successfully";
	
	@Test
	public void BuyShare() throws InterruptedException
	{
		LoginPage login = new LoginPage();
		
		login.enterEmailAddress();
		login.enterPassword();
		login.clickOnLoginButton();
		Thread.sleep(3000);
		
		Dashboard dash = new Dashboard();
		Thread.sleep(2000);
		dash.enterCompnayName("Wipro");
		Thread.sleep(2000);
		dash.clickOnCompanyOption();
		Thread.sleep(2000);
		
		ExchangeBuy exchange = new ExchangeBuy();
		exchange.clickOnBuyButton1();
		exchange.enterQuantity("2");
		Thread.sleep(2000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0,100)");
		exchange.clickOnBuyButton2();
		Thread.sleep(2000);
		Assert.assertEquals(exchange.getStatusMsg(), expected_msg);
	}
}
