package WEBDRIVER;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.gecko.driver", "C:\\automachine\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://central.hpfsproject.com/BPCL/central/site/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("loginform-username")).sendKeys("T5300");
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
		/*
		 * //driver.findElement(By.linkText("/BPCL/central/labelbarcodes/label-indent"))
		 * .click(); //div[@class="col-lg-4 col-md-4 col-sm-6 col-12 my-3"]
		 * 
		 * dashboard-icon bgi6 driver.findElement(By.xpath("//div[@class="col-lg-4
		 * col-md-4 col-sm-6 col-12 my-3"]"));
		 */
		driver.findElement(By.xpath("//h5[text()='Label Management']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector(".fa.fa-eye.fa")).click();
		/*
		 * driver.findElement(By.cssSelector(".fa.fa-eye.fa")).click();
		 * 
		 * //driver.findElement(By.className("fa fa-eye")).click(); Thread.sleep(2000);
		 * driver.findElement(By.linkText("7222153")).click();
		 */

//driver.findElement(By.xpath("/html/body/div[13]/div/div/div[2]/div/div[3]/table/tbody/tr[1]/td[2]/a")).click();
//7222153
		// driver.findElement(By.className("btn btn-primary cumodalbutton")).click();
		// driver.findElement(By.xpath("/html/body/div[14]/div/div/div[2]/div/div[3]/button")).click();
		driver.findElement(By.cssSelector("button.btn.btn-primary.cumodalbutton")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("select2-indentFormLoad-container")).click();
		Thread.sleep(2000);

		WebElement wElement = driver.findElement(By.id("select2-indentFormLoad-container"));

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

		//driver.findElement(By.className("fa fa-eye")).click();
		Thread.sleep(2000);
		 driver.findElement(By.linkText("7222153")).click();



		// dd.selectByVisibleText("HOLOSAFE SECURITY LABELS PVT. LTD.");

		// driver.findElement(By.class("btn btn-primary cumodalbutton")).click();
		// html/body/div[14]/div/div/div[2]/div/div[3]/button
		/*
		 * System.setProperty(
		 * "webdriver.chrome.driver","C:\\automachine\\New folder\\chromedriver.exe");
		 * WebDriver driver=new ChromeDriver();
		 * 
		 * 
		 * driver.get("http://central.hpfsproject.com/BPCL/central/site/login");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.linkText("Sign Up")).click();
		 * driver.findElement(By.id("loc_type")).click(); WebElement wElement =
		 * driver.findElement(By.id("loc_type")); Select dd =new Select(wElement);
		 * dd.selectByIndex(1);
		 * 
		 * driver.findElement(By.id("loc_name")).click(); WebElement qElement =
		 * driver.findElement(By.id("loc_name")); Select d =new Select(qElement);
		 * d.selectByIndex(1);
		 * 
		 * driver.findElement(By.id("role")).click(); WebElement q1Element =
		 * driver.findElement(By.id("role")); Select d1 =new Select(q1Element);
		 * d1.selectByIndex(3);
		 * driver.findElement(By.id("first_name")).sendKeys("srinu");
		 * driver.findElement(By.id("signup-last_name")).sendKeys("GS");
		 * driver.findElement(By.id("email_id")).sendKeys("GSr@gmail.com");
		 * driver.findElement(By.id("signup-mobile_no")).sendKeys("6301878094");
		 * driver.findElement(By.id("getoptbuttonsignup")).click(); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"signup-checkotp\"]")).click();
		 * 
		 * Thread.sleep(10000); driver.findElement(By.id("save")).click();
		 * 
		 * 
		 */

		/*
		 * Thread.sleep(5000);
		 * 
		 * driver.findElement(By.id("loginform-username")).sendKeys("sw");
		 * driver.findElement(By.id("loginform-password")).sendKeys("Admin@123");
		 * driver.findElement(By.id("loginform-captcha")).click(); Thread.sleep(5000);
		 * driver.findElement(By.name("login-button")).click();
		 * driver.findElement(By.xpath("//div[@class='dashboard-icon bgi3']")).click();
		 */
	}

}
