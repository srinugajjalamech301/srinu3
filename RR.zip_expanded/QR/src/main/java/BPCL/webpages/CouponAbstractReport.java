package BPCL.webpages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CouponAbstractReport {

	WebDriver driver;
	public CouponAbstractReport(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	
	By print=By.cssSelector("[onclick='print()']");
	By excelDownload= By.cssSelector("h4#export");
	
	
	public void downloadCouponAbstractReport() {
		
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
