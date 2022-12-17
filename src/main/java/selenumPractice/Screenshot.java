package selenumPractice;

import java.io.File;
import java.io.IOException;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriverManager.chromedriver();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/");
		
		WebElement div = driver.findElement(By.xpath("//a[text()='	Kane Williamson relinquishes Test captaincy']"));
		
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		
//		js.executeScript("arguments[0].scrollingIntoView(true)", div);
		
		
		// Using Action class for taking Screenshot
		
//		Actions act= new Actions(driver);
//		
//		act.scrollToElement(div).perform();
//		Thread.sleep(1000);
//		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		// by using random
		
		String random = RandomString.make(3);
		
		File des = new File("C:\\Users\\admin\\Desktop\\SS\\Don"+random+"d.png");
		
		FileHandler.copy(src, des);
		
		//FileUtils.copyFile(src, des);
	}

}
