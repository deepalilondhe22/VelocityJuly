package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.UtilityNew;



public class NeoStoxSigninPage 
{
	@FindBy(xpath = "(//a[text()='Sign In'])[1]") private WebElement signINButton;
	
	public NeoStoxSigninPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickonSigninButton(WebDriver driver)
	{
		UtilityNew.wait(driver, 1000);
		signINButton.click();
		Reporter.log("Clicking on Signin button", true);
	}

}
