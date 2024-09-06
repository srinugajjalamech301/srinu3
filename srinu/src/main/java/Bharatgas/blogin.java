package Bharatgas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class blogin {

	
	//static String un ="U1111" ;
	//static String pw ="Admin@123" ;

	
	
	
	
	static String url = "http://10.10.10.192/BPCL/central/site/login";
	static Actions action;
@Test
	public static void base22() throws InterruptedException, Exception {
	
	String un ="U1111" ;
	String pw ="Admin@123" ;
		//System.setProperty("webdriver.chrome.driver", ".\\resources\\drivers\\chromedriver.exe");
		WebDriver driver;
		//driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	
	
	driver.findElement(By.id("loginform-username")).sendKeys(un);
	driver.findElement(By.id("loginform-password")).sendKeys(pw);
	
	
	}

}
