package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webpages.LandingPage;
import webpages.LoginPage;



public class Employee {

WebDriver driver;
LoginPage page;

	
	@BeforeClass
	public void setUp() {
		driver = BasePa.intializeWebDriver();
		page = new LoginPage(driver);

	}

	@Test
	void signInTest() throws Exception {
		
		String code="DEM90003", username="prav",password="prav789";
		page.enterEmpCode(code);
		page.enterUname(username);
		page.enterPass(password);
	
		System.out.println();
		
	LandingPage dashboard = page.clickOnSignBtn();
		//String actual = dashboard.getProfileName();
		// Assert.assertEquals(actual, expected);

	}

	@AfterClass
	void tearDown() {
		// driver.close();
	}

	
}
