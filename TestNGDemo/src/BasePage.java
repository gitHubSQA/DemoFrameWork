import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	
	//Constructor to initialize all the WebElements in THIS page.
	public BasePage(WebDriver driver){
		PageFactory.initElements(driver, this);	
	}
	
	// -------------- Properties -------------------------
	
	@FindBy(id="email")
	public WebElement txtUsername;
	
	@FindBy(id="pass")
	public WebElement txtPassword;
	
	@FindBy(id="u_0_x")
	public WebElement btnLogIn;
	
	
	// -------------- Methods -------------------------
	
	public void setTxtUserName(){
		txtUsername.sendKeys("Test ................");
		//txtUsername.clear();
	}
	

}
