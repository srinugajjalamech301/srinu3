package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BPCL.webpages.DashboardPage;
import BPCL.webpages.LoginPage;
import BPCL.webpages.MasterData;
import BPCL.webpages.UserPage;

public class CreateUsers {

	WebDriver driver;
	LoginPage page;
	DashboardPage dashboard;
	MasterData masterdata;
	UserPage user;
	String module = "Master Data";
	String LocationType = "Bottling Unit", LocationName = "Wadilube Installation(5400)", RoleName = "Plant Manager",
			firstName = "SOULQ", LastName = "P", password = "Admin@123", emailId = "Sopl1@ctel.in",
			mobileNo = "0102451269";

	@BeforeMethod
	public void setup() throws Exception {
		String username = "CTELSUPPORT";
		String password = "Admin@123";

		driver = BasePa.intializeWebDriver();
		page = new LoginPage(driver);
		page.enterUname(username);
		page.enterPass(password);
		dashboard = page.clickOnSignBtn();
		dashboard.clickOnDashboardList(module);
		masterdata = new MasterData(driver);
		user = masterdata.clickOnAddUser();

	}

	@Test
	public void addUser() throws Exception {

		Thread.sleep(2000);

		user.selectLocationType(LocationType);
		user.selectLocationName(LocationName);
		user.selectRoleName(RoleName);
		user.enterFirstName(firstName);
		user.enterLastName(LastName);
		user.enterPassword(password);
		user.enterConfirmPassword(password);
		user.enterEmailId(emailId);
		user.enterMobileNo(mobileNo);
		user.clickOnSave();
		// user.clickOnDesc();
		 user.printLastUserName();

	}

	public void teardown() {

	}

}
