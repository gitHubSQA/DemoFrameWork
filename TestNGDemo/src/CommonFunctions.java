import org.openqa.selenium.WebDriver;

public class CommonFunctions {

	public void openBrowser(WebDriver driver){
		driver.navigate().to("http://www.facebook.com");
	}
	
	public void closeBrowser(WebDriver driver){
		driver.close();
	}
	
}
