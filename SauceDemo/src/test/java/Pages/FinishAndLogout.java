package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishAndLogout {

	WebDriver ckpdriver;

	public FinishAndLogout(WebDriver driver)
	{
		ckpdriver=driver;
		PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//button[@id='finish']")
	WebElement finish;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement burgerMenuBtn;
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logoutBtn;
	public void  finish()
	{
		finish.click();
	}
	public void  logout()
	{
		try {
		
		burgerMenuBtn.click();
		Thread.sleep(2000);
		logoutBtn.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
