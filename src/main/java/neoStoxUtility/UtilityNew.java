package neoStoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityNew 
{

	// Commonly used method
	
	//screenshot wait scrolling excel reading
	
	public static String readDatafromPropertyFile(String key) throws IOException
	{
		//create object of properties class--->java
		
		Properties prop = new Properties();
		
		// create obj of fileinputStream and pass property file as parameter
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\MySelenium\\src\\NeoStox.Properties");
	
		prop.load(myfile);
		
		String value = prop.getProperty(key);
		
		Reporter.log("Reading"+key+" from property file", true);
		
		
		
		
		return value;
	}
		
	
	
	public static void screnshot(WebDriver driver,String screenShotName) throws IOException
	{
		wait(driver,500);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		File dest= new File("C:\\Users\\admin\\Desktop\\SS\\"+screenShotName+".png");
		
		FileHandler.copy(src,dest );	
	     
	   Reporter.log("taking screnShot", true);
	   
	}
	
	public static void scrollingintoView(WebDriver driver, WebElement element)
	{
		wait(driver, 500);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("argument[0].scrollingintoView(true)", element);
		
		Reporter.log("Scrolling into view", true);
	}
	
	public static void wait(WebDriver driver,int waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		
		Reporter.log("Waiting for"+waitTime+"ms", true);
		
	}
	
	
	
}
