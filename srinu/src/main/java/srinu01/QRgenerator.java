package srinu01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class QRgenerator {
	WebDriver driver;

	
	@Test

	public  void qr( ) throws InterruptedException {

		
		Base01 v1 = new Base01();
		driver = v1.base02();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Plain Text']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//textarea[@id ='outlined-multiline-static']")).sendKeys("HGSHjhgkdsjgf");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id ='outlined-multiline-static']")).click();
		driver.findElement(By.xpath("//textarea[@id ='outlined-multiline-static']")).clear();
		driver.findElement(By.xpath("//textarea[@id ='outlined-multiline-static']")).sendKeys("65464624");

		
		
		
		
		
	}

}
