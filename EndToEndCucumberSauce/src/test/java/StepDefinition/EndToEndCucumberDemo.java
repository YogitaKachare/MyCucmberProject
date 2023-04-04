package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class EndToEndCucumberDemo {
	
	WebDriver driver;
	
	@Given("land to saucedemo home page")
	public void landToHomePage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
	}
	
	@Given("give Username")
	public void give_Username() {
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");
	}

	@Given("give password")
	public void give_password() {
		WebElement userPass = driver.findElement(By.xpath("//input[@id='password']"));
		userPass.sendKeys("secret_sauce");
	}

	@Given("Click on login button")
	public void click_on_login_button() throws InterruptedException {
		Thread.sleep(1000);
		WebElement loginClick = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginClick.click();
	}

	@Then("verified user")
	public void verified_user() {
	    System.out.println("Login Success");
	    //driver.close();
	}
	
	@And("^I have to add the following items into cart by list$")
	public void addMultiProductTOCart(DataTable tables) throws InterruptedException {
		
		List<String> prodList = tables.asList();
		for(int a=0;a<prodList.size();a++) {
			Thread.sleep(1000);
			System.out.println(prodList.get(a));
			WebElement addItemToCart = driver.findElement(By.xpath(prodList.get(a).toString()));
			addItemToCart.click();
		}
		
	}
	
	@Then("locate my shopping cart")
	public void locateMyShoppingCart() throws InterruptedException {
		Thread.sleep(1000);
		WebElement addItemToCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		addItemToCart.click();
	}
	
	@Then("Move to check out page")
	public void moveToCheckOut() throws InterruptedException {
		Thread.sleep(1000);
		WebElement addItemToCart = driver.findElement(By.xpath("//button[@id='checkout']"));
		addItemToCart.click();
	}
	
	@Then("^continueToShop with check out infomation by list$")
	public void checkoutInfomation(DataTable tables) throws InterruptedException {
		
		List<String> checkOutInfoDatat = tables.asList();
		WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
		firstName.sendKeys(checkOutInfoDatat.get(0).toString());
		Assert.assertFalse(firstName.toString().matches("^[A-Za-z0-9]"));
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
		lastName.sendKeys(checkOutInfoDatat.get(1).toString());
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement zipCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
		zipCode.sendKeys(checkOutInfoDatat.get(2).toString());
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement continueToShop = driver.findElement(By.xpath("//input[@id='continue']"));
		continueToShop.click();
		
	}
	
	@Then("Finish Shopping")
	public void finishShopping() throws InterruptedException {
		Thread.sleep(1000);
		WebElement continueToShop = driver.findElement(By.xpath("//button[@id='finish']"));
		continueToShop.click();
	}
	
	@Then("Click Menu Button To Logout")
	public void clickMenuButtonToLogout() throws InterruptedException {
		Thread.sleep(1000);
		WebElement menuButton = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		menuButton.click();
		Thread.sleep(1000);
		WebElement logOutProject = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		logOutProject.click();
	}
}
