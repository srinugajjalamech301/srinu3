package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePa {

	static WebDriver driver;
	static String url = "http://pfadmin.mydyosfame.com";
	static Actions action;

	public static WebDriver intializeWebDriver() {

		System.setProperty("webdriver.chrome.driver", ".\\resources\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		action = new Actions(driver);
		return driver;

	}

}
