package neoStoxPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.UtilityNew;

public class NeoStoxHomePaage 
{

	@FindBy(xpath = "(//a[text()='OK'])[2]")private WebElement okButton;
	
	@FindBy(xpath = "(//a[text()='Close'])[5]")private WebElement closeButton;
	
	@FindBy(xpath = "//span[@id='lbl_username']")private WebElement username;
	
	@FindBy(xpath = "//span[@id='lbl_curbalancetop']") private WebElement accBalance;
	
	@FindBy(xpath = "//span[text()='Logout']") private WebElement logOutButton;
	
	public NeoStoxHomePaage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void HandlePopUp(WebDriver driver) throws InterruptedException
	{
		
          Thread.sleep(4000);
          
		if(okButton.isDisplayed())
		{
			Thread.sleep(7000);
			
			//Utility.wait(driver, 1000);
			
			okButton.click();
			
			Reporter.log("Handling PopUp", true);
			
			Reporter.log("Clicking on Ok Button", true);
			
			//Utility.wait(driver, 1000);
			
			Thread.sleep(9000);
			
			closeButton.click();
			
			Reporter.log("Clicking on Close Button", true);
		}
		
		else
			
		{
	      Reporter.log("There is no PopUP", true);
	      
	      Thread.sleep(1000);
		}
	}
	public String getActualUserName(WebDriver driver)
	{
		UtilityNew.wait(driver, 1000);
		
		String actualUsername = username.getText();
		
		String realusername = actualUsername.substring(3);
		
		Reporter.log("Actual username is"+realusername , true);
		
		return actualUsername;
	}
	
	

	public String getAccBalance(WebDriver driver) throws IOException, InterruptedException
	{
		Thread.sleep(1000);
	    String accBalnc = accBalance.getText();
	    
	    //UtilityNew.screnshot(driver, accBalnc);
	    
	    Reporter.log("Getting Acc Balance", true);
	    
	    Reporter.log("Account Balance is"+accBalnc,true);
	    
		return accBalnc;
		
	}
	public void ClickLogout(WebDriver driver) throws InterruptedException
{
	UtilityNew.wait(driver, 1000);	
	
	username.click();
	
	Thread.sleep(1000);
	
	logOutButton.click();
	
	Reporter.log("LogOut", true);
}
}