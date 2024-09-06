package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BPCL.webpages.DashboardPage;
import BPCL.webpages.LoginPage;
import utilities.readExcelData;

public class SignInExcelTest {

	WebDriver driver;
	LoginPage page;


	@BeforeMethod
	public void setUp() {
		driver = BasePa.intializeWebDriver();
		page = new LoginPage(driver);

	}

	@Test(dataProvider="getExcelData")
	void signInTest(String username,String password) throws Exception {

		page.enterUname(username);
		page.enterPass(password);
		Thread.sleep(7000);
		DashboardPage dashboard=page.clickOnSignBtn();
		String actual = dashboard.getProfileName();
		//Assert.assertEquals(actual, expected);

	}
	
	@DataProvider
	String[][] getExcelData() throws Exception {

		String user[][]=readExcelData.getUserData("user_data", "user");
		return user;
	}
	
	
	
	@AfterMethod
	void tearDown() {
			driver.close();
	}

}
