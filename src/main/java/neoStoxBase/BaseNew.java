package neoStoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtility.UtilityNew;

public class BaseNew 
{
	protected WebDriver driver;

	public void launchBrowser() throws InterruptedException, IOException
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver.exe");
		 
			driver=new ChromeDriver();
			
			  
			
			
			driver.manage().window().maximize();
			
			driver.get(UtilityNew.readDatafromPropertyFile("url"));
			
			Reporter.log("Launching Browser", true);
			
			Thread.sleep(1000);
			
	}
	
	
	
	
}
