package srinu01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base01 {

	
	public WebDriver base02() {

		
		//System.setProperty("webdriver.chrome.driver", ".\\resources\\drivers\\chromedriver.exe");
				WebDriver driver;
				//driver = new ChromeDriver();
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				
				
				driver.get("https://www.the-qrcode-generator.com/");
				
				
				//driver.get("http://10.10.10.193/BPCLLPG/central/site/login");

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				return driver;
				
		}

	}


