package BPCL.webpages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CouponDataPage {
	
	WebDriver driver;
	public CouponDataPage(WebDriver driver) {
		this.driver=driver;
	}
	

	//WebElements
	
	
	By print=By.cssSelector("[onclick='print()']");
	By excelDownload= By.cssSelector("h3#export");
	
	
	public void downloadCouponData() {
		
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
