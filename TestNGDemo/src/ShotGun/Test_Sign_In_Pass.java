package ShotGun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Sign_In_Pass {
  
	//Create an instance of the WebDriver
	WebDriver driver = new FirefoxDriver();
			
	//Create an instance of the CommonFunctions Class.
	CommonFunctions common = new CommonFunctions();

	//Create an instance of the LoginPage.
	LoginPage pagelogin = new LoginPage(driver);
	
	@BeforeMethod
	public void openBrowser(){
		common.openBrowser(driver, "https://jefry-denny.shotgunstudio.com");	
	}
	
	@Test
	public void SignIn() {
	pagelogin.setTxtUserName();
	pagelogin.setTxtPassword();
	pagelogin.clickSignIn();
	Assert.assertEquals(true, true);	
	
	
//	@AfterMethod
//	public void closeBrowser(){
//		common.closeBrowser(driver);
//	}
	
  }
}
