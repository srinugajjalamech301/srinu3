package testscripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BPCL.webpages.DashboardPage;
import BPCL.webpages.LoginPage;

public class SignInTest {

	WebDriver driver;
	LoginPage page;

	String username = "W5400";
	String password = "Admin@123";
	String expected = "dashboard";
	
	
	String oo="89416531%^&*)_+";
	
	
	
	
	
	@BeforeClass
	public void setUp() {
		driver = BasePa.intializeWebDriver();
		page = new LoginPage(driver);

	}

	@Test
	void signInTest() throws Exception {

		page.enterUname(username);
		page.enterPass(password);
	
		System.out.println();
		
		DashboardPage dashboard = page.clickOnSignBtn();
		String actual = dashboard.getProfileName();
		// Assert.assertEquals(actual, expected);

	}

	@AfterClass
	void tearDown() {
		// driver.close();
	}

}
