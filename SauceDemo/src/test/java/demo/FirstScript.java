package demo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstScript  {

	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Saucedemo.com/");
		
	//	Set<Cookie> rec=driver.manage().getCookies();
		//System.out.println(rec);
		
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
  		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
  		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
  	
  		username.sendKeys("standard_user");
 		password.sendKeys("secret_sauce");
 		login.click();

	}
}
