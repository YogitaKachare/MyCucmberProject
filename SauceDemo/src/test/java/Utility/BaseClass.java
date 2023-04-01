package Utility;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ReadConfig read=new ReadConfig();
	protected  String global_username=read.getUsername();
	protected  String global_password=read.getPassword();
	protected  String url=read.getUrl();
	protected  String browser=read.getBrowser();
		
	public static Logger log;
		
		protected static WebDriver driver;
		
		@BeforeTest
		public void setup()
		{
			System.out.println(browser);
			System.out.println(global_username);
			System.out.println(global_password);
			System.out.println(browser);
			log=Logger.getLogger("https://www.saucedemo.com/");
			PropertyConfigurator.configure("Logfile.properties");
			if (browser.equals("chrome"))
			{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			log.info("running applicationo on chrome browser");
			System.out.print(driver+"in base set up");		
		   }
			
			if (browser.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",".\\src\\test\\resources\\driver\\geckodriver.exe");
				driver= new FirefoxDriver();
				log.info("running applicationo on firefox browser");
			}
			
			
		}
		
		@AfterTest
		public void tear()
		{
			//driver.quit();
		}

	}