package testcases;

//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ProductPage;
//import Pages.YourCartPage;
import Utility.BaseClass;

public class ProductPageTestCase extends BaseClass {

	
	
   @Test	
	void  verifyEmptyCart() throws  InterruptedException
	{
		driver.get("https://www.saucedemo.com/");
		log.info("opened hoem page");
		
		LoginPage login  = new LoginPage(driver);
		
	
		login.setUserName(global_username);
		log.info("setting username as"+global_username);
	
		login.setPassword(global_password);
		log.info("settimg password as "+global_password);
		
		login.clickButton(); 
		log.info("clicking on login button");
	
		ProductPage product  = new ProductPage(driver);
		Thread.sleep(3000);
		product.selectSauceLabsBikeLight();
		Thread.sleep(3000);

	    
	    System.out.println("Product Added");
	    Thread.sleep(3000);
	}       

}