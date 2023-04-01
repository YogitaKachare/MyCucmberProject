package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class CheckoutPage extends BaseClass{

	WebDriver ckpdriver;
	
	public CheckoutPage(WebDriver driver)
	{
	
	ckpdriver=driver;
	PageFactory.initElements(driver, this);	
}
@FindBy(xpath="//a[@class='shopping_cart_link']")
WebElement proeedAddtocart;



@FindBy(xpath="//input[@id='first-name']")
WebElement FirstName;

@FindBy(xpath="//input[@id='last-name']")
WebElement LastName;

@FindBy(xpath="//input[@id='postal-code']")
WebElement PostalCode;

@FindBy(xpath="//input[@id='continue']")
WebElement Continue;

@FindBy(xpath="//button[@id='finish']")
WebElement finish;

@FindBy(xpath="//h2[normalize-space()='Thank you for your order!']")

public WebElement orderSuccessAlert;

public final String orderSucessAlertMessage = "Thank you for your order!";


public void ClickonCart()
{
	proeedAddtocart.click();
}

public void setfirstname(String firstname)
{
	FirstName.sendKeys(firstname);
}
public void setLastname(String Lastname)
{
	LastName.sendKeys("Lastname");
				
}
public void setpostalcode(String postalcode)
{
	PostalCode.sendKeys(postalcode);
}
public void clickcontinuebutton()
{
	Continue.click();
}
}

