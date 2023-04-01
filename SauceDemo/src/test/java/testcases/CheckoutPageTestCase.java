package testcases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import Pages.CheckOutOverView;
import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.ProductPage;
import Pages.YourCartPage;
import Utility.BaseClass;

public class CheckoutPageTestCase extends BaseClass{

	// hamesha method bnate hia  pehle
	// jo test case hota hia sabke heda pe @test likte hia
	// fir use import krte hia
	// ab test case likugi
	// steps deko ab - > login ->  click on cart - click on checkout fill adress
	// sabsse pehle login ktna hia to login k step likehe kyuki pehle se like hai to copy kr liye main
	// driver ka error aye to ectends Base class kro 
	// nect step jis page  pe hoga uska obhect bna k usk amethod call krayenge
	// fir se nect step jis page  pe hoga uska obhect bna k usk amethod call krayenge
	@Test
	void  verifyEmptyCart()
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
		product.addoCart();
		
		
		YourCartPage cart  = new YourCartPage(driver);
		cart.clickOnCheckoutButton();
		
		
		CheckoutPage checkout = new CheckoutPage(driver);
		checkout.setfirstname("yogita");
		checkout.setLastname("abc");
		checkout.setpostalcode("410206");
		checkout.clickcontinuebutton();
		CheckOutOverView cooverview = new CheckOutOverView(driver);
		String realval =cooverview.gettotallabel();
		Assert.assertEquals(realval, "Total: $0.00"); // ye empty cart hia iska value o hona ch
		

	}
	
	
	@Test
	 void verifyFilledCart() throws InterruptedException
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
		YourCartPage cart  = new YourCartPage(driver);
		cart.clickOnCheckoutButton();
		CheckoutPage checkout = new CheckoutPage(driver);
		checkout.setfirstname("yogita");
		checkout.setLastname("abc");
		checkout.setpostalcode("410206");
		checkout.clickcontinuebutton();
		CheckOutOverView cooverview = new CheckOutOverView(driver);
		System.out.println(cooverview.gettotallabel());
		String realval =cooverview.gettotallabel();
		Assert.assertEquals(realval, "Total: $10.79");
		
		
	 }
}
