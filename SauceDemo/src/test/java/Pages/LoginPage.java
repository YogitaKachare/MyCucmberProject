package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

//load the element which required for testing
//doing action using these element
public class LoginPage  extends BaseClass{
	
	

		
		WebDriver ldriver;
		
	  public LoginPage(WebDriver driver)
		{
		    ldriver= driver;
			System.out.print(driver+"in pagep");	
			PageFactory.initElements(driver, this);
		}
		
			
		@FindBy(id="user-name")
		WebElement usernameElement;
		

		@FindBy(id="password")
		WebElement passwordElement;

		

		@FindBy(id="login-button")
		WebElement buttonElement;
		
		
		public void setUserName(String username)
		{
			usernameElement.sendKeys(username);
		}
		
		
		public void setPassword(String password)
		{
			passwordElement.sendKeys(password);
		}
		
		
		public  void clickButton()
		 {
			buttonElement.click();
		 }
		
		
		

		
		
	}