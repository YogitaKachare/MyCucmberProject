package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleProduct {

	

	WebDriver mpdriver;
	
	public MultipleProduct(WebDriver driver)
	{
		mpdriver=driver;
		PageFactory.initElements(driver, this);

	}
	
	
	
	   //1.Saucebackpack 
	    @FindBy(xpath=("//div[normalize-space()='Sauce Labs Backpack']"))
	    WebElement selectproduct1;
	    @FindBy(xpath=("//button[@id='add-to-cart-sauce-labs-backpack']"))
	    WebElement addToCart1;
    	
        //2.SauceLabsBikeLight
    	@FindBy(xpath=("//div[normalize-space()='Sauce Labs Bike Light']"))
 	    WebElement selectproduct2;
 	    @FindBy(xpath=("//button[@id='add-to-cart-sauce-labs-bike-light']"))
 	    WebElement addToCart2;
 	  
     	//3.Sauce Labs Bolt T-Shirt
     	@FindBy(xpath=("//div[normalize-space()='Sauce Labs Bolt T-Shirt']"))
 	    WebElement selectproduct3;
 	    @FindBy(xpath=("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"))
 	    WebElement addToCart3;
 	  
 	    @FindBy(xpath=("//button[@id='back-to-products']"))
	    WebElement backToProducts;
 	   

     	
    	public void selectProucts()
    	{
    		selectproduct1.click();
    		addToCart1.click();
    		backToProducts.click();
    		selectproduct2.click();
    		addToCart2.click();
    		backToProducts.click();
    		selectproduct3.click();
    		addToCart3.click();
    		backToProducts.click();
    	}


    	@FindBy(xpath=("//span[@class='shopping_cart_badge']"))
 	    WebElement clickToShoppBag;
    	
    	@FindBy(xpath=("//button[@id='checkout']"))
 	    WebElement checkout;
		public void clickShoppingBagAndCheckout() {
			clickToShoppBag.click();
			checkout.click();
		}
    	

		  
}
