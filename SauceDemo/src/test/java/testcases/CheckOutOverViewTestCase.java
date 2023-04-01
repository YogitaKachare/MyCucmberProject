package testcases;

import org.junit.Test;
import org.testng.Assert;

import Pages.CheckOutOverView;
import Pages.CheckoutPage;
import Pages.LoginPage;
import Utility.BaseClass;

public class CheckOutOverViewTestCase extends BaseClass{
	
	@Test

	void VerifyFullCart()
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
	
		CheckoutPage checkout = new CheckoutPage(driver);
		checkout.setfirstname("yogita");
		checkout.setLastname("abc");
		checkout.setpostalcode("410206");
		checkout.clickcontinuebutton();
		CheckOutOverView cooverview = new CheckOutOverView(driver);
		String realval =cooverview.gettotallabel();
		Assert.assertEquals(realval, "Total: $0.00"); 
	}
	

	
	
	
}

	
	

