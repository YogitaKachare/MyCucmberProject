package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLogoutDemo {

WebDriver driver;
	
	@Given("land to home page")
	public void landToHomePage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
	}
	
	@Given("provide Username")
	public void give_Username() {
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");
	}

	@Given("provide password")
	public void give_password() {
		WebElement userPass = driver.findElement(By.xpath("//input[@id='password']"));
		userPass.sendKeys("secret_sauce");
	}

	@Given("Proceed to login button")
	public void click_on_login_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement loginClick = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginClick.click();
	}

	
	@Then("authenticate user")
	public void verified_user() {
	    System.out.println("Login Success");
	    //driver.close();
	}
	
	
	@Then("Click Main Menu Button To Logout")
	public void clickMenuButtonToLogout() throws InterruptedException {
		Thread.sleep(1000);
		WebElement menuButton = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		menuButton.click();
		Thread.sleep(1000);
		WebElement logOutProject = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		logOutProject.click();
	}
	
}
