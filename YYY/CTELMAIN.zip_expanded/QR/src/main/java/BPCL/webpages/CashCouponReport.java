package BPCL.webpages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CashCouponReport {
	WebDriver driver;

	public CashCouponReport(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;

	}

	

	By print=By.cssSelector("[onclick='print()']");
	By excelDownload= By.cssSelector("h3#export");
	
	
	public void downloadCashCouponReport() {
		
		String main=driver.getWindowHandle();
		driver.findElement(print).click();
	Set	<String> ab= driver.getWindowHandles();
	
	Iterator<String> it=ab.iterator();
	while(it.hasNext())
	{
	
		String childwindow=it.next();
		if(!main.equalsIgnoreCase(childwindow)) {
			driver.switchTo().window(childwindow);
			
			WebElement down=	driver.findElement(excelDownload);
			down.click();
			break;
		}
	}
	driver.close();
	
	driver.switchTo().window(main);

	}
	
	
}
