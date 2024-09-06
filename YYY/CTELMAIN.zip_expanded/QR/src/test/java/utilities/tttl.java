package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tttl{
	
	
	WebDriver driver;
	
	public static WebDriver selectOptions(By loc, String text, WebDriver driver) {

		List<WebElement> ff = driver.findElements(loc);
		for (WebElement f : ff) {
			if (f.getText().contains(text)) {
				f.click();
				break;
			
			}
		}
		return driver;

	}
	
	
	
	
	public WebDriver selectDateFuture(String mon, String datt,WebDriver driver) throws Exception {
		String monthm;

		By day = By.cssSelector(".table-condensed tbody tr td[class='day']");

		By prevDate = By.cssSelector(".datepicker-days th.prev");
		By nextDate = By.cssSelector(".datepicker-days th.next");
		By month = By.cssSelector(".datepicker-days th[colspan='5']");


		while (true) {
			monthm = driver.findElement(month).getText();
			if (monthm.equalsIgnoreCase(mon)) {

				break;
			}
			driver.findElement(nextDate).click();
		}
		java.util.List<WebElement> dd = driver.findElements(day);

		for (WebElement d : dd) {

			if (d.getText().contentEquals(datt)) {
				d.click();
				break;
			}

		}
		return driver;

	}


public WebDriver selectDatePast(String mon, String datt,WebDriver driver) throws Exception {
	String monthm;

	By day = By.cssSelector(".table-condensed tbody tr td[class='day']");

	By prevDate = By.cssSelector(".datepicker-days th.prev");
	By nextDate = By.cssSelector(".datepicker-days th.next");
	By month = By.cssSelector(".datepicker-days th[colspan='5']");


	while (true) {
		monthm = driver.findElement(month).getText();
		if (monthm.equalsIgnoreCase(mon)) {

			break;
		}
		driver.findElement(prevDate).click();
	}
	java.util.List<WebElement> dd = driver.findElements(day);

	for (WebElement d : dd) {

		if (d.getText().contentEquals(datt)) {
			d.click();
			break;
		}

	}
	return driver;

}



public void getClick() {
	
	
	
}




}


