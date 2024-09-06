package BPCLTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class voting {
	
	
	WebDriver driver;

	@Test
	public void locationtc1() throws Throwable {
		
		// driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		driver.get("https://exhibition.skoch.in/exhibition-voting/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(jkf);

		
		
		
		
		
	}
	
	
		

	}

