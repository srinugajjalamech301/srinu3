package srinu01;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class coupondocsupload {
WebDriver driver;

	
	public coupondocsupload(WebDriver driver2) {
	// TODO Auto-generated constructor stub
		driver=driver2;
}

	@Test
	public  void dcupload () throws InterruptedException {

	
		 
		driver.findElement(By.id("loginform-username")).sendKeys("Vikram");
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

		
		driver.findElement(By.cssSelector("table#datatables_w1  tr:nth-child(1) td:nth-child(15) button [class='fa fa-pencil-square-o']")).click();
		Thread.sleep(2000);
		
		
		
		WebElement upf = driver.findElement(By.xpath("//input[@id='ref_file_del']"));
		upf.sendKeys("C:\\Users\\Amrutha\\Downloads\\PurchaseOrder()1698668546-1.pdf");
			
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='dc_no']")).sendKeys("uy5412");
		Thread.sleep(2000);

		
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(2000);

driver.findElement(By.xpath("//td[@class='today day']")).click();
		
		

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



		
	}
	
	@Test

	
	  public  void ctelpoupload() throws InterruptedException {
		  
			driver.findElement(By.id("loginform-username")).sendKeys("Srinivas477416");
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

			
			driver.findElement(By.cssSelector("table#datatables_w1  tr:nth-child(1) td:nth-child(15) button [class='fa fa-pencil-square-o']")).click();
			Thread.sleep(2000);
	  
			

			WebElement upf = driver.findElement(By.xpath("//input[@id='ref_file_inv']"));
			upf.sendKeys("C:\\Users\\Amrutha\\Downloads\\PurchaseOrder()1698668546-1.pdf");
				
			
			Thread.sleep(2000);


			WebElement upf01 = driver.findElement(By.xpath("//input[@id='ref_file_eway']"));
			upf01.sendKeys("C:\\Users\\Amrutha\\Downloads\\PurchaseOrder()1698668546-1.pdf");
			Thread.sleep(2000);

			
			driver.findElement(By.xpath("//input[@id='inv_no']")).sendKeys("4564d64ui");
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@id='eway_no']")).sendKeys("4564d64ui");
			Thread.sleep(2000);

			
Thread.sleep(2000);

			
			driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
			Thread.sleep(2000);

			Thread.sleep(2000);

	driver.findElement(By.xpath("//td[@class='today day']")).click();
			
			
			
			Thread.sleep(2000);

			
			driver.findElement(By.xpath("//input[@id='datepicker']")).click();
			Thread.sleep(2000);

			Thread.sleep(2000);

	driver.findElement(By.xpath("//td[@class='today day']")).click();

			
	Thread.sleep(2000);

	driver.findElement(By.xpath("//textarea[@id='remark']")).sendKeys("ok");
	driver.findElement(By.xpath("//button[@id='save']")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();

	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("table#datatables_w1  tr:nth-child(1) td:nth-child(15) button[title^='View ']")).click();

	Thread.sleep(2000);

    driver.get("http://10.10.10.192/BPCL/central/site/logout");
			
	  
	  }
	  
	  
	 
	@Test

	  public  void finaldispatch() throws InterruptedException {

			
			
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

			
			driver.findElement(By.cssSelector("table#datatables_w1  tr:nth-child(1) td:nth-child(15) button [class='fa fa-pencil-square-o']")).click();
			Thread.sleep(2000);
			
			
			
			

			driver.findElement(By.xpath("//textarea[@id='remark']")).sendKeys("ok");
			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[@id='save']")).click();
			Thread.sleep(2000);
			
			
			
			driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
			Thread.sleep(2000);
			
		//	driver.findElement(By.cssSelector("table#datatables_w1  tr:nth-child(1) td:nth-child(15) button[title^='View ']")).click();

			Thread.sleep(2000);

		    driver.get("http://10.10.10.192/BPCL/central/site/logout");
					
			
			
			
			
		}
	  
	  
	  
	@Test

	  
	  public  void received() throws InterruptedException {

			
		  driver.findElement(By.id("loginform-username")).sendKeys("T5300");
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

			
			driver.findElement(By.cssSelector("table#datatables_w1  tr:nth-child(1) td:nth-child(15) button [class='fa fa-pencil-square-o']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@class='btn btn-submit']")).click();

			
			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
			Thread.sleep(2000);
		//	driver.findElement(By.cssSelector("table#datatables_w1  tr:nth-child(1) td:nth-child(15) button[title^='View ']")).click();

			Thread.sleep(2000);

		    driver.get("http://10.10.10.192/BPCL/central/site/logout");
					
		  
			
			
			
			
			
		}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
}
