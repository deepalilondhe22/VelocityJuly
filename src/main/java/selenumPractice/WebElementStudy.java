package selenumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementStudy {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		Thread.sleep(1000);
	   WebElement name = driver.findElement(By.xpath("(//input[@id='name'])[1]"));
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
	   // js.executeScript("arguments[0].value='Elena';", name);
		
	    name.sendKeys("Stafen");
	    Thread.sleep(2000);
	    
	    name.clear();
	    
	    WebElement checkbox = driver.findElement(By.xpath("//input[@id='bmwradio']"));
	    
	    checkbox.click();
		System.out.println(checkbox.isSelected());
		
		WebElement text = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		text.sendKeys("abc");
		
		WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		
		WebElement show = driver.findElement(By.xpath("//input[@id='show-textbox']"));
		
		hide.click();
		
		Thread.sleep(2000);
		
	
		System.out.println(text.isDisplayed());
		
		WebElement disable = driver.findElement(By.id("disabled-button"));
		
		WebElement enable = driver.findElement(By.id("enabled-button"));
		
		WebElement textbox = driver.findElement(By.xpath("//input[@id='enabled-example-input']"));
		
		textbox.sendKeys("xyz");
		
		
		System.out.println(textbox.isEnabled());
		
		
		
	}

}
