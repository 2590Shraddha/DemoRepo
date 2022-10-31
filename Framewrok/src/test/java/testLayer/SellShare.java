package com.testLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.pageLayer.Dashboard;
import com.pageLayer.ExchangeBuy;
import com.pageLayer.ExchangeSell;
import com.pageLayer.LoginPage;
import com.testBase.TestBase;

public class SellShare extends TestBase
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
		dash.enterCompnayName("Axis");
		Thread.sleep(2000);
		dash.clickOnCompanyOption();
		Thread.sleep(2000);
		
		ExchangeSell exchange = new ExchangeSell();
		exchange.clickOnSellButton1();
		Thread.sleep(2000);
		exchange.enterSellQuantity("2");
		Thread.sleep(2000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0,100)");
		exchange.clickOnSellButton2();
		Thread.sleep(2000);
		Assert.assertEquals(exchange.getStatusMsg(), expected_msg);
	}

}
