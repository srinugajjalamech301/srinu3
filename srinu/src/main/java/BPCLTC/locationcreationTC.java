package BPCLTC;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locationcreationTC {

	 WebDriver driver;

	@Test
	public void locationtc() throws Throwable {
		
		// driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		
		
	}

	// driver.get("https://www.the-qrcode-generator.com/");
@Test
	public void locationtttc(WebDriver driver) throws Throwable {

		driver.get("http://10.10.10.192/BPCL/central/site/login");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.id("loginform-username")).sendKeys("CTELSUPPORT");
		driver.findElement(By.id("loginform-password")).sendKeys("Admin@123");

		By captcha = By.id("loginform-captcha");

		String enteredcapatcha = JOptionPane.showInputDialog("SRINU ENTER CAPTCHA");
		driver.findElement(captcha).sendKeys(enteredcapatcha);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);

		try {

			String url = driver.getCurrentUrl();
			System.out.println(url);
			if (url.contains("site/login")) {
				driver.get("http://10.10.10.192/BPCL/central/site/dashboard");
			} else {
				System.out.println("No Contact Admin");
			}
		} catch (Exception e) {
			System.out.println("Getting Exception");
		}
		
		
		
	}
@Test
	public void locationfft(WebDriver driver) throws Throwable {

	
	
	
		driver.findElement(By.xpath("//h5[text()='Master Data']")).click();

		Thread.sleep(2000);

		WebElement mo = driver
				.findElement(By.xpath("/html/body/div[3]/ul/div[1]/div/div[3]/li/span/span[1]/img[2]\r\n"));
		Actions actions = new Actions(driver);

		actions.moveToElement(mo).perform();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".bgi2 > ul:nth-child(2) > li:nth-child(1) > a")).click();

		Thread.sleep(2000);

		WebElement headerElement = driver.findElement(By.xpath("//h4[normalize-space()='Location']"));
		
		String headerText = headerElement.getText();
		System.out.println("Header Text: " + headerText);

		assertEquals(headerText, "Location");
		Thread.sleep(2000);			
			
			 
	
		       				  
		       				  
}

	}


