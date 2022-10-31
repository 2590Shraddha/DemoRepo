package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class ExchangeSell extends TestBase
{
	public ExchangeSell()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-----------obj repo -----------------
	
	private By sell_btn1 = By.xpath("//a[contains(text(),'Sell')]");
	private By quantity_txtbox = By.xpath("//input[@id='quantity']"); 
	private By sell_btn2 = By.xpath("//button[contains(text(),'Sell')]");
	private By status = By.xpath("//div[text()='Order Created successfully']");
	
	//----------action methods-------------
	public void clickOnSellButton1()
	{
		driver.findElement(sell_btn1).click();
	}
	
	public void enterSellQuantity(String count)
	{
		WebElement quantity=driver.findElement(quantity_txtbox);
		quantity.click();
		quantity.sendKeys(count);
	}
	
	public void clickOnSellButton2()
	{
		driver.findElement(sell_btn2).click();
	}
	
	public String getStatusMsg()
	{
		String msg = driver.findElement(status).getText();
		return msg;
	}
}
