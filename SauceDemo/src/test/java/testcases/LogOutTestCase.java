package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.CheckOutOverView;
import Pages.CheckoutPage;
import Pages.FinishAndLogout;
import Pages.LoginPage;
import Pages.MultipleProduct;
import Utility.BaseClass;

public class LogOutTestCase extends  BaseClass{

	
	@Test
	public void  addMultiProdToCartShoppAndLogOut() throws  InterruptedException
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
		
		MultipleProduct mp  = new MultipleProduct(driver);
		Thread.sleep(3000);
		mp.selectProucts();  
		mp.clickShoppingBagAndCheckout();
	    System.out.println("Product Added");
	    CheckoutPage checkout = new CheckoutPage(driver);
		checkout.setfirstname("yogita");
		checkout.setLastname("abc");
		checkout.setpostalcode("410206");
		checkout.clickcontinuebutton();
		CheckOutOverView cooverview = new CheckOutOverView(driver);
		String realval =cooverview.gettotallabel();
		Assert.assertEquals(realval, "Total: $60.45");
		
		FinishAndLogout finLogOut = new FinishAndLogout(driver);
		finLogOut.finish();
		finLogOut.logout();
	}  
	
}
