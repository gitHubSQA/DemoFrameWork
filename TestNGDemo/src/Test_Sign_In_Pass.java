
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ShotGun.CommonFunctions;
import ShotGun.LoginPage;

public class Test_Sign_In_Pass {
  
	//Create an instance of the WebDriver
	WebDriver driver = new FirefoxDriver();
			
	//Create an instance of the Common Class where common custom-built functions are stored.
	CommonFunctions common = new CommonFunctions();

	LoginPage pagelogin = new LoginPage(driver);
	
	@BeforeClass
	public void openBrowser(){
		common.openBrowser(driver, "https://jefry-denny.shotgunstudio.com");	
	}
	
	@Test
	public void SignIn() {
	pagelogin.setTxtUserName();
	pagelogin.setTxtPassword();
	pagelogin.clickSignIn();
	Assert.assertEquals(true, true);	
	

	
  }
}
