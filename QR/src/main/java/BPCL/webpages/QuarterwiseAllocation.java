package BPCL.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuarterwiseAllocation {

	WebDriver driver;

	public QuarterwiseAllocation(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	By addQuarter = By.cssSelector("button[title^='Add Quarterly']");

	By selectFin = By.cssSelector("span[title='Financial Year']");

	By finOptions = By.cssSelector("#select2-fin_Yr-results li");

	By quarter1 = By.cssSelector("input#valueper2");
	By quarter2 = By.cssSelector("input#valueper3");
	By quarter3 = By.cssSelector("input#valueper4");
	By quarter4 = By.cssSelector("input#valueper1");

	By remarks = By.cssSelector("textarea#remark");

	By view = By.cssSelector("[title='Allocation Details']");

	By searchTxt = By.cssSelector("[type='search']");

	public void searchText(String search) {
		driver.findElement(searchTxt).sendKeys(search);
	}

	public void AddQuarterBudget() {
		driver.findElement(addQuarter).click();
		driver.findElement(selectFin).click();
		
		
	}

	
	
	
}
