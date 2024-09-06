package testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BPCL.webpages.DashboardModulesPage;
import BPCL.webpages.DashboardPage;
import BPCL.webpages.LoginPage;
import BPCL.webpages.MasterData;
import utilities.readExcelData;

public class SanityTest2 {
	WebDriver driver;
	LoginPage page;
	DashboardPage dashboard;
	DashboardModulesPage dah;
	MasterData masterdata;
	String module = "Master Data";

	@Test

	public void clickAllTabs() throws Exception {

		String username = "T5300";
		String password = "Admin@123";

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
				driver.navigate().to("http://central.hpfsproject.com/BPCL/central/site/dashboard");
				System.out.println("Done Refresh");
			}

		}

		catch (Exception e) {
			System.out.println("Contact Adminstrator not showing");
		}
		System.out.println("Sign In to Application");
		dashboard.clickOnDashboardList(module);
		System.out.println("Clicked on Master Data under Dashboard");
		dah = new DashboardModulesPage(driver);
		dah.mousehoverOnModule(module);
		System.out.println("Mousehover on Master Data");
		dah.clickOnUser();
		System.out.println("Clicked on User under  User ");

		ArrayList<WebElement> links = (ArrayList<WebElement>) driver.findElements(By.cssSelector("li a"));
		System.out.println("Fetched All Links---> " + links.size());
		int cou = 0;

		for (WebElement Li : links) {
			if (Li.getAttribute("href").contains("BPCL/central")) {

				String tot = Li.getAttribute("href");

				String excel = "write";

				File path = new File(".\\resources\\files\\" + excel + ".xlsx");

				InputStream ge = new FileInputStream(path);

				XSSFWorkbook workbook = new XSSFWorkbook(ge);

				XSSFSheet sheet = workbook.getSheetAt(0);

				XSSFRow row = sheet.getRow(cou);

				System.out.println("In above row");
				if (row != null) {
					System.out.println("In below row");
					row.getCell(0).setCellValue(tot);

					FileOutputStream fos = new FileOutputStream(path);

					workbook.write(fos);

					cou++;

				}

			}
		}

	}
}