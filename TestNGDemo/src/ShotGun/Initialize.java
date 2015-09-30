package ShotGun;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Initialize {

	//Constructor
	public WebDriver Initialize(){
		
		//Create an instance of the WebDriver
		WebDriver driver = new FirefoxDriver();
		return driver;
		
	}
	
}
