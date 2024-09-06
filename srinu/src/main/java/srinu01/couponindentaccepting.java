package srinu01;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class couponindentaccepting {

	WebDriver driver;
	public couponindentaccepting(WebDriver driver2) {
		this.driver=driver2;
	}
	@Test

	
	public  WebDriver couponindentaccepting01() throws InterruptedException {
		
		
		

		driver.findElement(By.id("loginform-username")).sendKeys("Sanjay475000");
		driver.findElement(By.id("loginform-password")).sendKeys("Admin@123");

		By captcha = By.id("loginform-captcha");

		String enteredcapatcha = JOptionPane.showInputDialog("SRINU ENTER CAPTCHA");
		driver.findElement(captcha).sendKeys(enteredcapatcha);

		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);

		try {

			String url = driver.getCurrentUrl();
			System.out.println(url);
			if (url.contains("site/login")) {
				driver.get("http://10.10.10.192/BPCL/central/site/dashboard");
			}
			else {
				System.out.println("No Contact Admin");
			}
		} catch (Exception e) {
			System.out.println("Getting Exception");
		}

		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//h5[text()='Coupon Management']")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.cssSelector("table#datatables_w1  tr:nth-child(1) td:nth-child(15) button[title^='Accept ']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(2000);

		//January 2025,February 2024,March 2024,April 2024,May 2024,June 2024,July 2024,August 2024,September 2024,October 2024,November 2024,December 2024
	//	String 
		
	//	String getMonth=driver.findElement(By.xpath("//table[@class='table-condensed']/thead/tr[2]/th[2]")).getText();
		
	//WebElement nextButton=	driver.findElement(By.xpath("//table[@class='table-condensed']/thead/tr[2]/th[3]"));
	

	
driver.findElement(By.xpath("//td[@class='today day']")).click();




Thread.sleep(2000);

driver.findElement(By.xpath("//textarea[@id='remark']")).sendKeys("ok");

Thread.sleep(2000);

driver.findElement(By.xpath("//button[@id='update']")).click();
Thread.sleep(2000);

driver.findElement(By.cssSelector("table#datatables_w1  tr:nth-child(1) td:nth-child(15) button[title='Start Production ']")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
Thread.sleep(2000);

driver.findElement(By.cssSelector("table#datatables_w1  tr:nth-child(1) td:nth-child(15) button[title='Stop Production ']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
	
Thread.sleep(2000);

driver.findElement(By.cssSelector("table#datatables_w1  tr:nth-child(1) td:nth-child(15) button[title='Complete Production ']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();

Thread.sleep(2000);

		driver.findElement(By.cssSelector("table#datatables_w1  tr:nth-child(1) td:nth-child(15) button [class='fa fa-pencil-square-o']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='veh_no']")).sendKeys("45646456");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dock_no']")).sendKeys("dock45646456");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='dock_id']")).sendKeys("456464ui");
		Thread.sleep(2000);

		WebElement upf = driver.findElement(By.xpath("//input[@id='ref_file']"));
		upf.sendKeys("C:\\Users\\Amrutha\\Downloads\\PurchaseOrder()1698668546-1.pdf");
			
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//textarea[@id='remark']")).sendKeys("ok");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='save']")).click();
		Thread.sleep(2000);

		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
		Thread.sleep(2000);

				driver.findElement(By.cssSelector("table#datatables_w1  tr:nth-child(1) td:nth-child(15) button[title^='View ']")).click();

				Thread.sleep(2000);
	
		        driver.get("http://10.10.10.192/BPCL/central/site/logout");

	       
		        
		        
		 return driver;       
	}


}
