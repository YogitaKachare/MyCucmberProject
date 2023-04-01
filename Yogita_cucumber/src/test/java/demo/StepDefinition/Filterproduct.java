package demo.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Filterproduct {

	
	   WebDriver driver;
		
		@Given("Open product page")
		public void open_product_page() {
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.saucedemo.com");
				
			driver.findElement(By.name("user-name")).sendKeys("standard_user");
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		}

		@When("Apply filter by (.*) of the filter")
		public void apply_filter_by_of_the_filter(String string ) {
			
			System.out.println(string);
	        driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
			driver.findElement(By.xpath("//option[contains(text),'"+string+"')]")).click();
		}
}

