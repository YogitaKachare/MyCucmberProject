package StepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleUserLogin {
	WebDriver driver;
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
	    System.out.println("Visating to home page :: https://www.saucedemo.com/");
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(DataTable usercredentials) {
		//List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
		for (Map<Object, Object> data : usercredentials.asMaps(String.class, String.class)) {
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(data.get("Username").toString()); 
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(data.get("Password").toString());
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
		}
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() throws InterruptedException {
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {
			Thread.sleep(3000);
			System.out.println("User Logged In Successfully");
		}else {
			Thread.sleep(5000);
			System.out.println("Invalid User");
		}
	}

	
}
