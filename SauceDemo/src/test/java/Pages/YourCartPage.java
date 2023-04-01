package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {
	
WebDriver ckpdriver;
	
	public YourCartPage(WebDriver driver)
	{
		ckpdriver=driver;
		PageFactory.initElements(driver, this);	
	}

	//button[@id='checkout']
	@FindBy(xpath="//button[@id='checkout']")
	WebElement Checkout;
	public void clickOnCheckoutButton()
	{
		Checkout.click();
	}
}
