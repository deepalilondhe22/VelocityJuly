package neoStoxTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoStoxBase.BaseNew;
import neoStoxPOM.NeoStoxHomePaage;
import neoStoxPOM.NeoStoxLoginPage;
import neoStoxPOM.NeoStoxPasswordPage;
import neoStoxPOM.NeoStoxSigninPage;
import neoStoxUtility.UtilityNew;



public class ValidateNeoStoxAccBalnce2 extends BaseNew
{
	NeoStoxLoginPage login;
	
	NeoStoxPasswordPage password;
	
	NeoStoxHomePaage home;
	
	NeoStoxSigninPage signin;
	
	@BeforeClass
	
	public void launchNeoStox() throws InterruptedException, IOException
	{
		launchBrowser();// from Base class
		
		 login    = new NeoStoxLoginPage(driver);
		 
		 password = new NeoStoxPasswordPage(driver);
		 
		 home     = new NeoStoxHomePaage(driver);
		 
		 signin   = new NeoStoxSigninPage(driver);
		 
	}
	
	@BeforeMethod
	public void loginNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
	{
		signin.ClickonSigninButton(driver);
		
		login.SendMobileNo(driver, UtilityNew.readDatafromPropertyFile("MoblieNo"));
		
		login.ClickonSignInButton(driver);
		
		UtilityNew.wait(driver, 3000);
		
		password.enterPassword(driver,UtilityNew.readDatafromPropertyFile("Password"));
		
		Thread.sleep(2000);
		
		password.ClickonSubmitButton(driver);
		
		Thread.sleep(4000);
		
		home.HandlePopUp(driver);
		
		
		
		
	}
	@Test
	public void ValidateAccBalance() throws IOException, InterruptedException
	{
		Thread.sleep(1000);
		
		Assert.assertNotNull(home.getAccBalance(driver),"TC failed if unable to featch account balance");
		
		Reporter.log("get Account balance", true);
		
		//UtilityNew.screnshot(driver, "Account Balance");
		
		Assert.fail();
		
		Thread.sleep(1000);
		
	}
	
	
  @Test(priority = 0)
  public void validateUserID() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  Assert.assertEquals(home.getActualUserName(driver), UtilityNew.readDatafromPropertyFile("username"),"TC is failed actual and expected are not matched");
	  
	  
	  
	 // UtilityNew.screnshot(driver,home.getActualUserName(driver));
	  
	  Thread.sleep(1000);
  }
  
  @AfterMethod
  public void LogOUT() throws InterruptedException
  {
	  
	  home.ClickLogout(driver);
	  
  }
  
 
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
	  Reporter.log("Closing Browser", true);
  }
}
