package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BPCL.webpages.DashboardPage;
import BPCL.webpages.LoginPage;
import BPCL.webpages.MasterData;
import BPCL.webpages.UserPage;
import utilities.readExcelData;

public class CreateUsersExcel {

	WebDriver driver;
	LoginPage page;
	DashboardPage dashboard;
	MasterData masterdata;
	UserPage user;
	String module = "Master Data";

	@BeforeMethod
	public void setup() throws Exception {
		String username = "CTELSUPPORT";
		String password = "Admin@123";

		driver = BasePa.intializeWebDriver();
		page = new LoginPage(driver);
		page.enterUname(username);
		page.enterPass(password);
		//Thread.sleep(7000);
		dashboard = page.clickOnSignBtn();
		dashboard.clickOnDashboardList(module);
		masterdata = new MasterData(driver);

	}

	@Test
	public void addUser() throws Exception {

		String excelName = "user_create";
		String sheetName = "user";
		readExcelData.loadExcel(excelName, sheetName);
		int lastrow = readExcelData.lastRow();

		for (int rowNo = 1; rowNo <= lastrow; rowNo++) {

			user = masterdata.clickOnAddUser();

			String[] collector = readExcelData.trythis(excelName, sheetName, rowNo);
			String LocationType = collector[0], LocationName = collector[1], RoleName = collector[2],
					firstName = collector[3], middleName = collector[4], LastName = collector[5],
					password = collector[6], emailId = collector[7], mobileNo = collector[8],
					phoneNo = collector[9];

			
			Thread.sleep(1000);
			user.selectLocationType(LocationType);
			user.selectLocationName(LocationName);
			user.selectRoleName(RoleName);
			user.enterFirstName(firstName);
			user.enterMiddleName(middleName);

			user.enterLastName(LastName);
			user.enterPassword(password);
			user.enterConfirmPassword(password);
			user.enterEmailId(emailId);
			user.enterMobileNo(mobileNo);
			user.clickOnSave();
			Thread.sleep(5000);
			// user.clickOnDesc();
			// user.printLastUserName();

		}

	}

	public void teardown() {
		driver.close();

	}

}
