package ShotGun;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	//Constructor to initialize all the WebElements in THIS page.
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);	
	}
	
	// -------------- Properties -------------------------
	
	//Locator: Username Textbox
	@FindBy(id="user_login")
	public WebElement txtUsername;

	//Locator: Password Textbox
	@FindBy(id="user_password")
	public WebElement txtPassword;
	
	//Locator: Sign In button
	//@FindBy(id="commit")
	@FindBy(xpath=".//*[@id='ext-gen7']/div[2]/div[3]/form/div[3]/inputSIGN IN")
	public WebElement btnSignIn;
	
	
	// -------------- Methods -------------------------
	
	//Method: Enter username in the User Name textbox 
	public void setTxtUserName(){
		txtUsername.clear();
		txtUsername.sendKeys("Test ................");
	}
	
	//Method: Enter username in the User Name textbox 
	public void setTxtPassword(){
		txtPassword.clear();
		txtPassword.sendKeys("Test ................");
	}
	
	//Method: Click on Sign In button 
	public void clickSignIn(){
		btnSignIn.click();
	}

}
