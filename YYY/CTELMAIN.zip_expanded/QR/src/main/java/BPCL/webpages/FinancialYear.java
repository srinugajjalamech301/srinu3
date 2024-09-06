package BPCL.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.ttt;
public class FinancialYear {

	WebDriver driver;
	
	 ttt c;



	public FinancialYear(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;

	}

	
	By addFinan= By.cssSelector("button[title^='Add Financial']");
	
	By selectFin = By.cssSelector("span[title='Financial Year']");
	By enterValue = By.cssSelector("input#amt");
	By datePick= By.cssSelector("input#datepicker");
	By remarks=By.cssSelector("textarea#remark");
	By upload=By.cssSelector("input#ref_file");
	By submit=By.cssSelector("button#save");
	
	By finOptions =By.cssSelector("#select2-finYr-results li");
	
	
	By finrowscount=By.cssSelector("tbody tr");
	By finRows=By.cssSelector("tbody tr:nth-child(2)");
	By finColoumns=By.cssSelector("tbody tr:nth-child(2) td ");
	
	By clickRows=By.cssSelector(".dataTables_length select");
	
	//WebElements
	
	public void addFin() {
		driver.findElement(addFinan).click();
		
		
	}
	
	
	
	
	public void selectYear(String text) {
		driver.findElement(selectFin).click();
		c.selectOptions(finOptions, text, driver);
		
	}
	
	public void enterBudget(String value) {
		driver.findElement(enterValue).sendKeys(value);
	}
	
	public void selectCouponValidity(String monthi,String date) throws Exception {
		
	driver.findElement(datePick).click();
	String monthm;

	By day = By.cssSelector(".table-condensed tbody tr td[class='day']");

	By prevDate = By.cssSelector(".datepicker-days th.prev");
	By nextDate = By.cssSelector(".datepicker-days th.next");
	By month = By.cssSelector(".datepicker-days th[colspan='5']");


	while (true) {
		monthm = driver.findElement(month).getText();
		if (monthm.equalsIgnoreCase(monthi)) {

			break;
		}
		driver.findElement(nextDate).click();
	}
	java.util.List<WebElement> dd = driver.findElements(day);

	for (WebElement d : dd) {

		if (d.getText().contentEquals(date)) {
			d.click();
			break;
		}

	}

	
	
	
	
	
	}
	
	public void enterRemarks(String remark) {
		driver.findElement(remarks).sendKeys(remark);
	}
	
	public void uploadPdf(String path) {
		driver.findElement(upload).sendKeys(path);
	}
	
	public void submit() {
		driver.findElement(submit).click();
	}

	
	
	public void getClick() {
	int qr=driver.findElements(finrowscount).size();
		System.out.println(qr);
		
	}
	
}
