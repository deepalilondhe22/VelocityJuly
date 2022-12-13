package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.UtilityNew;



  public class NeoStoxPasswordPage 
 {
	@FindBy(id = "txt_accesspin")private WebElement passwordField;
	
	@FindBy(xpath = "//a[text()='Submit']") private WebElement submittButton;
	
	public  NeoStoxPasswordPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(WebDriver driver, String pass) throws InterruptedException
	{
		UtilityNew.wait(driver, 1000);
		
		passwordField.sendKeys(pass);
		
		Thread.sleep(1000);
		
		Reporter.log("Entering password", true);
		
	}
	
	public void ClickonSubmitButton(WebDriver driver) throws InterruptedException
	{
		//Utility.wait(driver,1000);
		submittButton.click();
		
		
		Thread.sleep(2000);
		
		Reporter.log("Clicliking on Submit button", true);
	}
 }

   
