package Bharatgas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {


		
		static String url = "http://10.10.10.193/BPCLLPG/central/site/login";
		static Actions action;

		public static WebDriver base01() {
			//System.setProperty("webdriver.chrome.driver", ".\\resources\\drivers\\chromedriver.exe");
			WebDriver driver;
			//driver = new ChromeDriver();
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			action = new Actions(driver);
			return driver;
		
		
		
		
		
		
	}

}
