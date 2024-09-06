import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PrintQrSmall {

	String url = "https://www.the-qrcode-generator.com";
	int wait=2000;

long endNum=2100006000;	

long startNum=2100005555;
	@Test
	public void intializeWebDriver() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amrutha\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.the-qrcode-generator.com/");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("button[id$='txt']")).click();
		By loc = By.cssSelector(".MuiInput-input");

	
		for (long i =startNum;i <= endNum; i++) {
		
	
			WebElement text = driver.findElement(loc);
			text.sendKeys("540010"+i);
			Thread.sleep(wait);
			text.sendKeys(Keys.chord(Keys.DOWN.CONTROL, "a"));
		}

	}

}
