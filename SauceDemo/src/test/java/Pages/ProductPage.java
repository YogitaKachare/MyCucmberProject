package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility.BaseClass;


public class ProductPage extends BaseClass {


	WebDriver pdriver;
	
	public ProductPage(WebDriver driver)
	{
		pdriver=driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath=("//div[normalize-space()='Sauce Labs Bike Light']"))
	WebElement SauceLabsBikeLight;
	@FindBy(xpath=("//button[@id='add-to-cart-sauce-labs-bike-light']"))
    WebElement addToCart;
    @FindBy(xpath=("//a[@class='shopping_cart_link']"))
    WebElement cart;
    
    @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addbackpacttocart;
    
	public void selectSauceLabsBikeLight()
	{
		SauceLabsBikeLight.click();
		addToCart.click();
		cart.click();
	}
	
	public void selectSauceBackpack()
	{
		addbackpacttocart.click();
	}
	
	
	public void addoCart()
	{
		cart.click();
	}

}		  
		    
		    
	


