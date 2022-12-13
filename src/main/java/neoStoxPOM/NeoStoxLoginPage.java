package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.UtilityNew;



public class NeoStoxLoginPage 
{
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement moblieNoField;
	
	
	@FindBy(xpath ="(//a[text()='Sign In'])[2]" )private WebElement SignInButton;
	
	public NeoStoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SendMobileNo(WebDriver driver,String mobNum)
	{
		UtilityNew.wait(driver, 1000);
		
		moblieNoField.sendKeys(mobNum);
		
		Reporter.log("Entering Mobile Number", true);
		
	}
	public void ClickonSignInButton(WebDriver driver)
	{
		UtilityNew.wait(driver, 1000);
		
		SignInButton.click();
		
		Reporter.log("Clicking on SigninButton", true);
		
	}

}
