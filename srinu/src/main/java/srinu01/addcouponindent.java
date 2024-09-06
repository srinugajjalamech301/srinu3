package srinu01;

import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class addcouponindent {

	WebDriver driver;

	@Test
	
	public  void bottling() throws InterruptedException {

		Base01 v1 = new Base01();
		driver = v1.base02();

		
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

		WebElement mo=driver.findElement(By.xpath("//span[text()='Coupon Management']"));
        Actions actions = new Actions(driver);

        actions.moveToElement(mo).perform();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Coupon Indent Request']")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary cumodalbutton']")).click();
        Thread.sleep(2000);

        WebElement k = driver.findElement(By.xpath("//span[@id='select2-finance_Yr-container']"));
        k.click();
               Thread.sleep(2000);

            
       				  List<WebElement> bu =  driver.findElements(By.xpath("//ul[@id='select2-finance_Yr-results']/li"));
       				  
       				  String name = "2024-2025";
       				  
       				  for (WebElement suu: bu) {
       				  
       				  if (suu.getText().contains(name)) { suu.click(); break; } }

	
       		         Thread.sleep(3000);  
       		         
       		         
       		         
       		         

       		        WebElement k01 = driver.findElement(By.xpath("//span[@id='select2-quarters-container']"));
       		        k01.click();
       		               Thread.sleep(2000);

       		         
       		      List<WebElement> bu01 =  driver.findElements(By.xpath("//ul[@id ='select2-quarters-results']/li"));
 				  
 				  String name01 = "Q4 (January to March)";
 				  
 				  for (WebElement suu01: bu01) {
 				  
 				  if (suu01.getText().contains(name01)) { suu01.click(); break; } }
				
    		         Thread.sleep(2000);  

		
       		      WebElement upf = driver.findElement(By.xpath("//input[@id ='ref_file']"));
					upf.sendKeys("C:\\Users\\Amrutha\\Downloads\\PurchaseOrder()1698668546-1.pdf");

					Thread.sleep(2000);
        
					driver.findElement(By.xpath("//input[@id ='po_num']")).sendKeys("7858564785");

					Thread.sleep(2000);

		
					driver.findElement(By.xpath("//input[@id ='qtysm']")).sendKeys("10000");
					Thread.sleep(2000);

			
					driver.findElement(By.xpath("//textarea[@id ='remark']")).sendKeys("ok");
					Thread.sleep(2000);

					driver.findElement(By.xpath("//button[@id ='save']")).click();
					Thread.sleep(3000);
					
					
					driver.switchTo().alert().accept();

					Thread.sleep(2000);

					
					driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();

					Thread.sleep(2000);

					
        driver.get("http://10.10.10.192/BPCL/central/site/logout");
		Thread.sleep(2000);

		
	}
	
	@Test

public  WebDriver ctel() throws InterruptedException {

		
		
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

	
	driver.findElement(By.cssSelector("table#datatables_w1  tr:nth-child(1) td:nth-child(15) button[title^='Purchase']")).click();

	Thread.sleep(2000);

	
	
	WebElement upf = driver.findElement(By.xpath("//input[@id='ref_file']"));
	upf.sendKeys("C:\\Users\\Amrutha\\Downloads\\PurchaseOrder()1698668546-1.pdf");
		
	
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@id='po_num']")).sendKeys("5445123");
	
	

	Thread.sleep(2000);

	
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	Thread.sleep(2000);

	driver.findElement(By.cssSelector("td.today.day")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@id='remark']")).sendKeys("hfgujfguj");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//button[@id='save']")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();

	Thread.sleep(2000);

	
	
    driver.get("http://10.10.10.192/BPCL/central/site/logout");
	Thread.sleep(2000);

	
	return driver ;
	
		
	}
	
	
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	

}
