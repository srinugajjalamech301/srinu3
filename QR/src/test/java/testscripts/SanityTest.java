package testscripts;

import java.util.ArrayList;
import java.util.List;

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

public class SanityTest {
	WebDriver driver;
	LoginPage page;
	DashboardPage dashboard;
	DashboardModulesPage dah;
	MasterData masterdata;
	String module = "Master Data";
	/*
	 * @Test public void setup() throws Exception { String username = "W5400";
	 * String password = "Admin@123";
	 * 
	 * driver = BasePa.intializeWebDriver(); page = new LoginPage(driver);
	 * page.enterUname(username); page.enterPass(password); dashboard =
	 * page.clickOnSignBtn();
	 * 
	 * dashboard.clickOnDashboardList(module); dah =new
	 * DashboardModulesPage(driver); dah.mousehoverOnModule(module);
	 * dah.clickOnUser();
	 * 
	 * 
	 * }
	 */

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
		System.out.println("Clicked on User under  Master Data ");
		// Get the current window handle and store it in a variable
		String originalWindowHandle = driver.getWindowHandle();
		// Find all the elements with the tag name "a" and store them in an ArrayList
		Thread.sleep(2000);
		ArrayList<WebElement> links = (ArrayList<WebElement>) driver.findElements(By.cssSelector("li a"));
		System.out.println("Fetched All Links---> " + links.size());
		String ad = "http://central.hpfsproject.com";
		boolean hji = true;
		for (WebElement Li : links) {
			Thread.sleep(2000);
			if (Li.getAttribute("href").contains("BPCL")) {

				String tot = Li.getAttribute("href");
				System.out.println(tot);
				if (tot.contains("dashboard")) {
					hji = false;
					System.out.println("Found One");
				}
				if (hji) {
					driver.switchTo().window(originalWindowHandle);
					 Actions a = new Actions(driver);
					
					 try {
				            // trying to set a new name...
						
							a.sendKeys(Keys.CONTROL, Keys.chord("T"));
							System.out.println("Clicked on loop Link");
							driver.get(tot);
							System.out.println("Clicked ");
						}
					 
	catch(StaleElementReferenceException e) {
				        	
		 tot = Li.getAttribute("href");
				        	
				        }
					 driver.get(tot);
					 
				        }
				
			
					
				hji = true;
			}

		}

		// Get the list of window handles and store them in another ArrayList
		ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());

		// Switch to each window handle and print the title of the tab
		for (String windowHandle : windowHandles) {
			// Switch to the window handle
			driver.switchTo().window(windowHandle);
			// Print the title of the tab
			System.out.println("The title of the tab is: " + driver.getTitle());
			// Close the tab
			driver.close();
			// Switch back to the original window handle
			driver.switchTo().window(originalWindowHandle);
		}

		// Quit the browser at the end of the session
		driver.quit();

	}

}
