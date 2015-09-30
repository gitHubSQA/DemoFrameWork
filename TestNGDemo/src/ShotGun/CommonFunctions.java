package ShotGun;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {

	/*
	 * @Param: an instance of the WebDriver, and the Web App URL
	 * @Author: Jefry Denny
	 * Date: September 29, 2015
	 * Description: Open the Browser with the URL provided
	 */
	public void openBrowser(WebDriver driver, String strURL){
		driver.navigate().to(strURL);
		//Explicit wait - presenceOfElementLocated
		//WebElement myDynamicElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.id("u_0_s")));
	}
	
	/*
	 * @Param: an instance of the WebDriver
	 * @Author: Jefry Denny
	 * Date: September 29, 2015
	 * Description: 
	 */
	public void closeBrowser(WebDriver driver){
		driver.close();
	}
	
}
