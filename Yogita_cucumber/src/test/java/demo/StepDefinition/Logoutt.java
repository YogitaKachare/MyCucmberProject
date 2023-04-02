package demo.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Logoutt {

	
	WebDriver driver;
	
	
	@Given("user login to the home page")
	public void user_login_to_the_home_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com");
			
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
		
	
	@When("click on login button")
	public void click_on_login_button() {
		
	
	}

	
	@Then("Home page Appear")
	public void home_page_Appear() throws InterruptedException {
		System.out.println(" Landing to HomePage");
		Thread.sleep(5000);
	}
	
	
	@Then("click on header menu  button")
	public void click_on_header_menu_button( String string) {
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']\r\n"
				+ "String")).click();

	}

	@Then("click on  logout button")
	public void click_on_logout_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		Thread.sleep(5000);

	}


}
