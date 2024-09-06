
package testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

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
public class subbbbb {


	      @Test
	      public void allocateCoupons() throws Exception {
		 WebDriverWait wait;
		WebDriver driver;
		LoginPage page;
		DashboardPage dashboard;
		DashboardModulesPage dah;
		MasterData masterdata;
		String module = "Master Data";
	        
	            String username = "Test432455";

	            String password = "Admin@123";

	            Actions a;

	            // String coupon = "8905400061223wigxBbAx";

	            String excel = "coupon";

	            File path = new File(".\\resources\\files\\" + excel + ".xlsx");

	            InputStream ge = new FileInputStream(path);

	            XSSFWorkbook workbook = new XSSFWorkbook(ge);

	            XSSFSheet sheet = workbook.getSheetAt(0);

	            XSSFRow row;

	            driver = BasePa.intializeWebDriver();

	            //// driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	            page = new LoginPage(driver);

	            page.enterUname(username);

	            page.enterPass(password);

	            dashboard = page.clickOnSignBtn();

	            Thread.sleep(3000);

	            System.out.println(driver.getCurrentUrl());

	            try {

	                  Thread.sleep(2000);

	                  System.out.println("In Try Catch");

	                  if (driver.getCurrentUrl().contains("site/login")) {

	                        System.out.println("In If block");

	                        // Thread.sleep(1500);

	                        driver.navigate().to("http://10.10.10.192/BPCL/central/site/dashboard");

	                        System.out.println("Done Refresh");

	                  }

	            }

	            catch (Exception e) {

	                  System.out.println("Contact Adminstrator not showing");

	            }

	            System.out.println("Sign In to Application");

	            Thread.sleep(1000);

	            // driver.findElement(By.cssSelector("[class='dashoard-container'] > div >div

	            // >div:nth-child(3)")).click();

	            driver.findElement(By.xpath("//h5[text()='Production']")).click();

	            int loop = 50;

	            for (int ab = 0; ab <= loop; ab++) {

	                  a = new Actions(driver);

	                  WebElement modal = driver.findElement(By.cssSelector("div#cumodalHeader"));

	                  try {

	                        if (modal.isEnabled()) {

	                              wait = new WebDriverWait(driver, 20);

	                              wait.until(ExpectedConditions.invisibilityOf(modal));

	                        }

	                  } catch (Exception e) {

	                        System.out.println("not availble");

	                  }

	                  System.out.println("MouseHover");

	                  a.moveToElement((driver.findElement(By.cssSelector("div.owl-stage >div:nth-child(4)")))).build().perform();

	                  System.out.println("Clicking on Coupon deallocation");

	                  driver.findElement(By.xpath("//*[text()='Coupon Allocation to Line']")).click();

	                  System.out.println("Clicked");

	                  driver.findElement(By.cssSelector("button[title^='Add Coupon']")).click();

	                  try {

	                        WebElement namessss = driver.findElement(By.cssSelector("input#lot_no"));

	                        wait.until(ExpectedConditions.visibilityOf(namessss));

	                  } catch (Exception e) {

	                        System.out.println("availabele");

	                        driver.findElement(By.cssSelector("button[title^='Add Coupon']")).click();

	                  }

	                  Thread.sleep(3000);

	                  driver.findElement(By.cssSelector("span[title^='Select Line Name']")).click();

	                  driver.findElement(By.xpath("//li[text()='7265862(OCME-1)(10-JAN-24)']")).click();

	                  // driver.findElement(By.cssSelector("input#lot_no")).sendKeys(coupon);

	                  row = sheet.getRow(ab);

	                  if (row != null) {

	                        String coupon = row.getCell(0).getStringCellValue();

	                        System.out.println(coupon);

	                        driver.findElement(By.cssSelector("input#lot_no")).sendKeys(coupon);

	                  }

	                  driver.findElement(By.cssSelector("button[onclick^='allocationcoupon']")).click();

	                  WebElement loading = driver.findElement(By.cssSelector("div#loading"));

	                  wait.until(ExpectedConditions.invisibilityOf(loading));

	                  driver.findElement(By.cssSelector("button[onclick^='allocationcoupon']")).click();

	            }

	      }

	}
