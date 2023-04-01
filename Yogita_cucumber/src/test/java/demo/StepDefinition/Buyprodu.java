package demo.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

 
public class Buyprodu {
	
	WebDriver driver;
	@Given("login to the home page")
	public void login_to_the_home_page() {WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.saucedemo.com");
		
	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();

}
		
	

	@Then("select the product")
	public void select_the_product() throws InterruptedException {
		driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Fleece Jacket']")).click();
		Thread.sleep(5000);
	}
	
	
    
    
	@Then("add to cart")
	public void add_to_cart() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(5000);

		
	}

	@Then("Checkout")
	public void checkout() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		Thread.sleep(5000);
	}

	@Then("Continue to buy")
	public void continue_to_buy() {
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Yogita");
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Kachare");
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("412206");
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//button[@id='finish']")).click();

	}



}
