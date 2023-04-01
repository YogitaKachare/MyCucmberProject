package Pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverView {
	
WebDriver ckpdriver;
	
	public CheckOutOverView(WebDriver driver)
	{
	
	ckpdriver=driver;
	PageFactory.initElements(driver, this);	
}
	
	@FindBy(xpath=" //div[@class='summary_info_label summary_total_label']")
	WebElement totalabel;
	
	public String  gettotallabel()
	{
		return totalabel.getText();
	}

	

}
