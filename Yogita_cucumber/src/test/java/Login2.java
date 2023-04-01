import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login2 {

	WebDriver driver;
	
	@Given("landing page is open")
	public void landing_page_is_open() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("entered username")
	public void entered_username() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("entered password")
	public void entered_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("click on button")
	public void click_on_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("home page should appear")
	public void home_page_should_appear() {
		System.out.println("My home page open ");
	    driver.close();
	}

	@Then("User Should Stay on login page")
	public void user_Should_Stay_on_login_page() {
	  System.out.println("its still on the login page");  
	}


}
