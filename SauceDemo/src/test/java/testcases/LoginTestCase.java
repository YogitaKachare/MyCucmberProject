package testcases;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Utility.BaseClass;

public class LoginTestCase extends BaseClass {
	
	@DataProvider
	Object readData() 
	{
		Object[][] data = new Object[4][2];  
		
		data[0][0]= "standard_user";      data[0][1]= "secret";   
		
		data[1][0]= "standard";           data[1][1]= "secret_sauce"; 
		
		data[2][0]= "standard_user";      data[2][1]= "secret"; 
		
		data[3][0]= "standard";           data[3][1]= "secret_sauce"; 
		
		return data;
	}
	
	
	@Test(dataProvider = "readData")
	void verifyUser(String user, String pass)
	{
		
		System.out.println(user);
		System.out.println(pass);
		System.out.println(driver);
		driver.get("https://www.saucedemo.com/");
		log.info("opened hoem page");
		System.out.print(driver+"in test up");	
		LoginPage login  = new LoginPage(driver);
		
		
		login.setUserName(user);
		log.info("setting username as"+user);
		
		login.setPassword(pass);
		log.info("settimg password as "+pass);
		
		login.clickButton(); 
		log.info("clicking on login button");
		
	
	}

	
	
	}
