package ShotGun;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FirstDemo {

	public static void main(String[] args) {

		//Create an instance of the WebDriver
		WebDriver driver = new FirefoxDriver();
				
		//Create an instance of the Common Class where common custom-built functions are stored.
		CommonFunctions common = new CommonFunctions();
		
		//Create an instance of the BasePage Class.
		BasePage basepage = new BasePage(driver);
		
		//Experimental - not being used at the moment
		Initialize init = new Initialize();

		
		//Open the browser.
		common.openBrowser(driver, "http://www.facebook.com");
		
		//Verify that you are in the correct page by checking the Title.
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
			
		//Explicit wait - presenceOfElementLocated
		WebElement myDynamicElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.id("u_0_s")));
		


		
		
		
		//Assertion: Verify that login is successful by checking the Title of the new page - the .contains allow us to verify a not exact words. 
		//When Facebook has notifications, it usually pre-fixes it with the title. e.g 2 Facebook
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		
		
		
		//To logout from fb. To open the drop-down
		//driver.findElement(By.id("userNavigationLabel")).click();
		//driver.findElement(By.xpath("//input[@value='Log Out']")).click(); 

		

		
		common.closeBrowser(driver);
					  
			}

}
