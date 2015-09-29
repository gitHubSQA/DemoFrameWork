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
		
		//Create an instance of the Common Class where common custom built functions are stored.
		CommonFunctions common = new CommonFunctions();
		
		BasePage basepage = new BasePage(driver);
		
		common.openBrowser(driver);
		
		//Verify that you are in the correct page by checking the Title.
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");

			
		//Explicit wait - presenceOfElementLocated
		WebElement myDynamicElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.id("u_0_s")));
		
//		WebElement txtEmail = driver.findElement(By.id("email"));
//		WebElement txtPass = driver.findElement(By.id("pass"));
//		WebElement btnLogIn = driver.findElement(By.id("u_0_x"));

		//basepage.txtUsername.clear();
		basepage.txtUsername.sendKeys("jjdenny@gmail.com");
		
		basepage.txtPassword.clear();
		basepage.txtPassword.sendKeys("php21DAY$$");
		
		basepage.btnLogIn.click();
		
		//Assertion: Verify that login is successful by checking the Title of the new page - the .contains allow us to verify a not exact words. 
		//When Facebook has notifications, it usually pre-fixes it with the title. e.g 2 Facebook
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		
		
		
		//To logout from fb. To open the drop-down
		//driver.findElement(By.id("userNavigationLabel")).click();
		//driver.findElement(By.xpath("//input[@value='Log Out']")).click(); 

		

		
		common.closeBrowser(driver);
					  
			}

}
