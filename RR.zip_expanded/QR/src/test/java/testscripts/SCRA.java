package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BPCL.webpages.BottlingWMS;
import BPCL.webpages.CouponBudget;
import BPCL.webpages.DashboardPage;
import BPCL.webpages.FinancialYear;
import BPCL.webpages.LoginPage;
import BPCL.webpages.MasterData;
import utilities.readExcelData;

public class SCRA {

	WebDriver driver;
	LoginPage page;
	DashboardPage dashboard;
	MasterData masterdata;
	String module = "Coupon Budget";
	FinancialYear fin;
	
	@BeforeMethod
	public void setup() throws Exception {
		String username = "SUBBUDISP";
		String password = "Admin@123";

		driver = BasePa.intializeWebDriver();
		page = new LoginPage(driver);
		page.enterUname(username);
		page.enterPass(password);
		dashboard = page.clickOnSignBtn();
		
		

	}

	@Test
	public void addUser() throws Exception {
		
		String year="2022-2023";
		String budget="150000";
		String mobth="April 2023";
		String date="25";
		String remarks="abc";
		//String path="sample1.pdf";
		
		String path="F:\\Subbu\\SELENIUM\\QR\\resources\\files\\sample1.pdf";

		dashboard.clickOnDashboardList(module);
		fin = new FinancialYear(driver);
		fin.getClick();
		fin.addFin();
		fin.selectYear(year);
		fin.enterBudget(budget);
		fin.selectCouponValidity(mobth, date);
		fin.enterRemarks(remarks);
		fin.uploadPdf(path);
		//fin.submit(); 
	
		
		
}
	
}
