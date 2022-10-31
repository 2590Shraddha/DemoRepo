package testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase 
{
	public static WebDriver driver;
	
	public static Logger loger;
	
	@BeforeClass
	public void start()
	{
		loger = Logger.getLogger("Framewrok Started");
		PropertyConfigurator.configure("Log4j.properties");
		loger.info("Framework Execution Will be Started..");
	}
	
	@AfterClass
	public void finished()
	{
		loger.info("Framework Finished");
	}
	
	
	@BeforeMethod
	//generic information / common information in program
	public void setBrowser()
	{
		String br = "Chrome";
		if(br.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if(br.equalsIgnoreCase("FireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else if(br.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	//close all the windows / quit the pgm
	public void tearDown()
	{
		//driver.quit();
	}
	
}
