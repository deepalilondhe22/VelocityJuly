package selenumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationOfTitle {

	public static void main(String[] args)
	{

		WebDriverManager.chromedriver();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/");
		
		String actualTitle = "Kane Williamson  Test captaincy']";
		
		Reporter.log("Actual Title is" +actualTitle,true);
		
		String expectedTitle = driver.getTitle();
		
		Reporter.log("Expected title is "+expectedTitle,true);
		
		Assert.assertEquals(actualTitle,expectedTitle,"Actual title and expected Title is not matching TC is failed");
		
		
		
		
		
		
		
	}

}
