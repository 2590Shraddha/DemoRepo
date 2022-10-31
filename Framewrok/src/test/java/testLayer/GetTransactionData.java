package com.testLayer;

import org.testng.annotations.Test;

import com.pageLayer.Dashboard;
import com.pageLayer.TransactionPage;
import com.testBase.TestBase;

public class GetTransactionData extends TestBase
{
		@Test
		public void getData() throws InterruptedException
		{
			TransactionPage tran = new TransactionPage();
			Dashboard dash=new Dashboard();
			Thread.sleep(3000);
			dash.clickOnTransactionLink();
			Thread.sleep(3000);
			tran.getTransactionData();	
		}

}
