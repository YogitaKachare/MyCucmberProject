package demo.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleProduct {

	WebDriver driver;
	
	@Given("User login to application")
	public void user_login_to_application() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com");
			
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	}

	@When("click on product with Name as{string}")
	public void click_on_product_with_Name_as(String string) {
		driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).click();
	}

	@Then("Product page should open")
	public void product_page_should_open() {
		System.out.println("product page should open");
	}
	
	@Then("Add to cart")
	public void add_to_cart() {
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();	
	}
	
	@And("back to product")
	public void backToProduct() {
		driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
	}
	
	
	@When("Click on image of product")
	public void click_on_image_of_product() {
		driver.findElement(By.xpath("//img[@alt='Sauce Labs Bike Light']")).click();
	}
	
	@Then("add to basket")
	public void add_to_basket() {
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();	
	}
	
	/*
		@When("Click On Shopping Cart")
		public void click_On_Shopping_Cart() {
			driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		}

		@Then("Visible product with Name as {string}")
		public void visible_product_with_Name_as(String string) {
			System.out.println("Visible product in cart is Sauce Labs Backpack");
		}
	 */
	}

