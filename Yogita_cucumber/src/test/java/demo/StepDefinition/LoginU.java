package demo.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginU {
WebDriver driver;
	
	@Given("open the landing page")
	public void open_the_landing_page() {
		System.out.println("Home page is open");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
 	}

	@When("username as {string} in usernamefield")
	public void username_as_in_usernamefield(String string) {
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		
 	}

	@When("password as {string} in passwordfield")
	public void password_as_in_passwordfield(String string) {
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secert_sauce");
	}

	@When("click on login button LoginU")
	public void click_button() throws InterruptedException {
		WebElement login =driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
         
 	}

	@Then("homepage should appear")
	public void homepage_should_appear() throws InterruptedException {
		System.out.println("Homepage should Appear");
		Thread.sleep(3000);
	}

	@Then("User should Stay on login Page")
	public void user_should_Stay_on_login_Page() {
       System.out.println("User should Stay on login Page");
	}
	
}


