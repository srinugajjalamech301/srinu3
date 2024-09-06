package testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BPCL.webpages.DashboardModulesPage;
import BPCL.webpages.DashboardPage;
import BPCL.webpages.LoginPage;
import BPCL.webpages.MasterData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CouponAllocation {

	WebDriver driver;
	LoginPage page;
	DashboardPage dashboard;
	DashboardModulesPage dah;
	MasterData masterdata;
	String module = "Master Data";

	@Test
	public void allocateCoupons() throws Exception {

		// WebDriverManager.firefoxdriver().setup();
		// WebDriver driver = new FirefoxDriver();
		// driver.get("http://10.10.10.193/BPCL/central/site/login");

		String username = "Test432455";
		String password = "Admin@123";
		Actions a;
		String coupon = "8905400061223wigxBbAx";

		String excel = "coupon";

		File path = new File(".\\resources\\files\\" + excel + ".xlsx");

		InputStream ge = new FileInputStream(path);

		XSSFWorkbook workbook = new XSSFWorkbook(ge);

		XSSFSheet sheet = workbook.getSheetAt(0);

		XSSFRow row;
		
		
		driver = BasePa.intializeWebDriver();
		page = new LoginPage(driver);

		page.enterUname(username);
		page.enterPass(password);
		dashboard = page.clickOnSignBtn();
		System.out.println(driver.getCurrentUrl());
		try {
			Thread.sleep(2000);
			System.out.println("In Try Catch");
			if (driver.getCurrentUrl().contains("site/login")) {
				System.out.println("In If block");
				// Thread.sleep(1500);
				driver.navigate().to("http://10.10.10.193/BPCL/central/site/dashboard");
				System.out.println("Done Refresh");
			}

		}

		catch (Exception e) {
			System.out.println("Contact Adminstrator not showing");
		}
		System.out.println("Sign In to Application");
		driver.findElement(By.cssSelector("[class='dashoard-container'] > div >div >div:nth-child(3)")).click();

		int loop = 50;
		for (int ab = 0; ab <= loop; ab++) {

			a = new Actions(driver);
			a.moveToElement((driver.findElement(By.xpath("//*[text()='Production']")))).build().perform();
			driver.findElement(By.xpath("//*[text()='Coupon Allocation to Line']")).click();
			driver.findElement(By.cssSelector("button[title^='Add Coupon']")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("span[title^='Select Line Name']")).click();
			driver.findElement(By.xpath("//li[text()='7253054(OCME-5)(19-DEC-23)']")).click();
			driver.findElement(By.cssSelector("input#lot_no")).sendKeys(coupon);
			driver.findElement(By.cssSelector("button[onclick^='allocationcoupon']")).click();
			WebElement loading = driver.findElement(By.cssSelector("div#loading"));
			WebDriverWait wait = new WebDriverWait(driver, 8);
			wait.until(ExpectedConditions.invisibilityOf(loading));
			driver.findElement(By.cssSelector("button[onclick^='allocationcoupon']")).click();

		}
	}

}
