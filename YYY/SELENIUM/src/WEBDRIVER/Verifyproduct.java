package WEBDRIVER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verifyproduct {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\automachine\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://central.hpfsproject.com/BPCL/central/site/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//html/body/div[1]/div/div/div[2]/div[1]/div/div[1]/form/a")).click();
		
		driver.findElement(By.id("verifybottledata")).sendKeys("W23E12P3zdi3BtFlj");
		driver.findElement(By.className("col-md-7")).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//*[@id=\"verifyBottleSubmit\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("refreshproduct")).click();
		
driver.findElement(By.id("verifybottledata")).sendKeys("W22A14P3AP0VDP7FL");
driver.findElement(By.className("col-md-7")).click();
Thread.sleep(10000);

		driver.findElement(By.xpath("//*[@id=\"verifyBottleSubmit\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("refreshproduct")).click();
driver.findElement(By.id("verifybottledata")).sendKeys("W22D09P7bQtVx4NYd");
		
		driver.findElement(By.xpath("//*[@id=\"verifyBottleSubmit\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("refreshproduct")).click();
driver.findElement(By.id("verifybottledata")).sendKeys("W22A14P3V22IKF2KL");
		
		driver.findElement(By.xpath("//*[@id=\"verifyBottleSubmit\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("refreshproduct")).click();
driver.findElement(By.id("verifybottledata")).sendKeys("W23E12P3zdi3BtFlj");
		
		driver.findElement(By.xpath("//*[@id=\"verifyBottleSubmit\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("refreshproduct")).click();
driver.findElement(By.id("verifybottledata")).sendKeys("W22A14P3AP0VDP7FL");
		
		driver.findElement(By.xpath("//*[@id=\"verifyBottleSubmit\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("refreshproduct")).click();
driver.findElement(By.id("verifybottledata")).sendKeys("W22D09P7bQtVx4NYd");
		
		driver.findElement(By.xpath("//*[@id=\"verifyBottleSubmit\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("refreshproduct")).click();
driver.findElement(By.id("verifybottledata")).sendKeys("W22A14P3V22IKF2KL");
		
		driver.findElement(By.xpath("//*[@id=\"verifyBottleSubmit\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("refreshproduct")).click();
driver.findElement(By.id("verifybottledata")).sendKeys("W23E12P3zdi3BtFlj");
		
		driver.findElement(By.xpath("//*[@id=\"verifyBottleSubmit\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("refreshproduct")).click();
driver.findElement(By.id("verifybottledata")).sendKeys("W22A14P3AP0VDP7FL");
		
		driver.findElement(By.xpath("//*[@id=\"verifyBottleSubmit\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("refreshproduct")).click();
driver.findElement(By.id("verifybottledata")).sendKeys("W22D09P7bQtVx4NYd");
		
		driver.findElement(By.xpath("//*[@id=\"verifyBottleSubmit\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("refreshproduct")).click();
driver.findElement(By.id("verifybottledata")).sendKeys("W22A14P3V22IKF2KL");
		
		driver.findElement(By.xpath("//*[@id=\"verifyBottleSubmit\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("refreshproduct")).click();
		
	}

}
