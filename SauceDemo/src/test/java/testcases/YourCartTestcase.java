package testcases;

import Pages.LoginPage;
import Pages.ProductPage;
import Pages.YourCartPage;
import Utility.BaseClass;

public class YourCartTestcase  extends BaseClass{
	
	void verifyourCart()
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
	
	
		
		YourCartPage cart  = new YourCartPage(driver);
		cart.clickOnCheckoutButton();
		
		
	}

}
