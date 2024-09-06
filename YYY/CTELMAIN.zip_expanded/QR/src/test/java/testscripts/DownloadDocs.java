package testscripts;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BPCL.webpages.BottlingWMS;
import BPCL.webpages.DashboardModulesPage;
import BPCL.webpages.DashboardPage;
import BPCL.webpages.LoginPage;
import BPCL.webpages.MasterData;
import BPCL.webpages.STOOutwardPage;

public class DownloadDocs {

	WebDriver driver;
	LoginPage page;
	BottlingWMS wms;
	DashboardModulesPage dashboardMod;
	STOOutwardPage stoout;

	String username = "W5400";
	String password = "Admin@123";
	String module = "Bottling Plant WMS";
	String startMonth = "March 2022";
	String startDate = "30";
	String endMonth = "April 2022";
	String endDate = "20";
	String status = "Completed";
	String rows = "100";

	@BeforeMethod
	public void setUp() {
		driver = BasePa.intializeWebDriver();
		page = new LoginPage(driver);

	}

	@Test
	void download() throws Exception {

		page.enterUname(username);
		page.enterPass(password);
		DashboardPage dashboard = page.clickOnSignBtn();
		dashboard.clickOnDashboardList(module);
		wms = new BottlingWMS(driver);
		dashboardMod = new DashboardModulesPage(driver);
		dashboardMod.mousehoverOnModule(module);
		stoout = wms.stoOutward();
		stoout.selectStartDate(startMonth, startDate);
		stoout.selectEndDate(endMonth, endDate);
		stoout.selectStatus(status);
		stoout.searchBtn();
		Thread.sleep(15000);
		stoout.selectRows(rows);
		stoout.stockTypeSort();
		stoout.stockTypeSort();
		//stoout.pickListPrint();
		stoout.dispatchPrint();

	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}

}
