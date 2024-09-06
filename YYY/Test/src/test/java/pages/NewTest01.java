package pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest01 {
	@Test
	public void f() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\automachine\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://central.hpfsproject.com/BPCL/central/site/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("loginform-username")).sendKeys("B5200");
		driver.findElement(By.id("loginform-password")).sendKeys("Admin@123");
		driver.findElement(By.id("loginform-captcha")).click();
		Thread.sleep(8000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		try {
			System.out.println(driver.getCurrentUrl());
			if (driver.getCurrentUrl().contains("site/login")) {
				driver.navigate().to("http://central.hpfsproject.com/BPCL/central/site/dashboard");
				System.out.println(driver.getCurrentUrl());
			}
		} catch (Exception e) {
			System.out.println("No Contact Admin");
		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("//h5[text()='Label Management']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.btn.btn-primary.cumodalbutton")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("select2-indentFormLoad-container")).click();
		Thread.sleep(2000);

		// Select dd = new Select(wElement);
//dd.selectByValue("select2-indentFormLoad-container");

		List<WebElement> supplNames = driver.findElements(By.cssSelector("#select2-indentFormLoad-results li"));

		String name = "HOLOSAFE SECURITY LABELS PVT. LTD.";

		for (WebElement suu : supplNames) {

			if (suu.getText().contains(name)) {
				suu.click();
				break;
			}
		}

		// driver.findElement(By.cssSelector("#file")).click();
		WebElement upf = driver.findElement(By.cssSelector("input#file"));
		upf.sendKeys("C:\\automachine\\sample(30).csv");

		Thread.sleep(2000);

		driver.findElement(By.id("btn_create_indent")).click();
		Thread.sleep(6000);

		driver.findElement(By.cssSelector(".fa.fa-eye.fa")).click();
		// driver.findElement(By.className("fa fa-eye")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("7222153")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#modalHeaderView > button:nth-child(1) > span")).click();

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#closespoolpopup > span")).click();

		
		
		/*
		 * driver.findElement(By.xpath("/html/body/div[13]/div/div/div[1]/button/span"))
		 * .click(); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/div[13]/div/div/div[2]/div/div[1]/div/div/div[1]/button/span")).
		 * click();
		 * 
		 * 
		 * driver.findElement(By.linkText("×")).click(); Thread.sleep(2000);
		 * driver.findElement(By.linkText("×")).click();
		 */

	}

	@BeforeTest
	public void beforeTest() {

	}

	@AfterTest
	public void afterTest() {
	}

}
