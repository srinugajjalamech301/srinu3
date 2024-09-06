package testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePa {

	
	//static String url = "https://test.lubesqr.bpcl.in/central/site/login";
	
	static String url = "http://10.10.10.192/BPCL/central/site/login";
	//static String url = "http://10.10.10.66/BPCL/central/site/login";

	//static String url = "https://dev.lubesqr.bpcl.in/central/site/login";
	static Actions action;

	public static WebDriver intializeWebDriver() throws Exception  {
		//System.setProperty("webdriver.chrome.driver", ".\\resources\\drivers\\chromedriver.exe");
		WebDriver driver;
		//driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
			//	action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("m").keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).perform();
				
				

		action = new Actions(driver);
		return driver;

	}

}
