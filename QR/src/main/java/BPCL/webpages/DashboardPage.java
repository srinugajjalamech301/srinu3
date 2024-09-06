package BPCL.webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElements

	By profileName = By.cssSelector("div[class='display-name'] a");

	By dashboardList = By.xpath("//div[@class='form-row']//h5");

	// Actions

	public String getProfileName() {
		return driver.findElement(profileName).getText();
	}

	public DashboardModulesPage clickOnDashboardList(String mode) {
		List<WebElement> mods = driver.findElements(dashboardList);
		for (WebElement mod : mods) {
			if (mod.getText().contains(mode)) {
				mod.click();
				break;
			}
		}
		return new DashboardModulesPage(driver);

	}
	
	
	
	
	

}
