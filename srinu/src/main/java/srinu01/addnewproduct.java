package srinu01;

import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class addnewproduct {

	
	WebDriver driver;

	
	@Test
	
	public void addnewproduct01() throws InterruptedException {


	
		
		 Base01 v1 =new Base01(); 
		  driver =v1.base02();
		
		  
		
		   driver.findElement(By.id("loginform-username")).sendKeys("admin");
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
			 
		
       driver.findElement(By.xpath("//h5[text()='Master Data']")).click();

       Thread.sleep(2000);

		WebElement mo=driver.findElement(By.xpath("/html/body/div[3]/ul/div[1]/div/div[3]/li/span/span[1]/img[2]\r\n"));
       Actions actions = new Actions(driver);

       actions.moveToElement(mo).perform();
       Thread.sleep(2000);
		
		
       WebElement mo01=driver.findElement(By.cssSelector(".bgi2 > ul:nth-child(2) > li:nth-child(5) > a"));
       Actions actions01 = new Actions(driver);

       actions01.moveToElement(mo01).perform();
		
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[3]/ul/div[1]/div/div[3]/li/ul/li[5]/ul/li[1]/a")).click();
       Thread.sleep(10000);

       driver.findElement(By.xpath("//button[@class='btn btn-primary cumodalbutton']")).click();

       Thread.sleep(2000);

       
       WebElement k = driver.findElement(By.className("select2-selection__rendered"));
       k.click();
              Thread.sleep(2000);

           
      				  List<WebElement> bu =  driver.findElements(By.xpath("//ul[@id='select2-products-pack_type-results']/li"));
      				  
      				  String name = "PAIL";
      				  
      				  for (WebElement suu: bu) {
      				  
      				  if (suu.getText().contains(name)) { suu.click(); break; } }
       
       
      	              Thread.sleep(2000);

      				driver.findElement(By.xpath("//input[@id='pcode']")).sendKeys("7825401");
    	              Thread.sleep(2000);

      				driver.findElement(By.xpath("//input[@id='pname']")).sendKeys("MAKLUBES sdj");
      				
  	              Thread.sleep(2000);

      				driver.findElement(By.xpath("//input[@type='radio' and  @name='mrp_batch_req' and @value='Yes']")).click();

  	              Thread.sleep(2000);

    				driver.findElement(By.xpath("//input[@type='radio' and @name ='mrp_req' and @value ='Yes']")).click();

  	          
    	              Thread.sleep(2000);

      				driver.findElement(By.xpath("//input[@type='radio' and @name ='prod_size_type' and @value ='Ltr']")).click();
  	              Thread.sleep(2000);

      				driver.findElement(By.xpath("//input[@id='bcap']")).sendKeys("20");
      				
    	              Thread.sleep(2000);

      				driver.findElement(By.xpath("//input[@id='upc']")).sendKeys("1");
  	              Thread.sleep(2000);

      				driver.findElement(By.xpath("//input[@id='mrp_batch']")).sendKeys("24A01");

       
  	              Thread.sleep(2000);
  	            
  	            
  				driver.findElement(By.xpath("//input[@id='mrp_per_ltr_val']")).sendKeys("50");
	              Thread.sleep(2000);

  				driver.findElement(By.xpath("//input[@id='purpose']")).sendKeys("Inhouse");
  				
	              Thread.sleep(2000);

  				driver.findElement(By.xpath("//input[@type='radio' and @name ='Products[brand_label_status]'  and  @value ='Yes']")).click();
	              Thread.sleep(2000);

  				
  				driver.findElement(By.xpath("//button [text() ='Save']")).click();

  				
  				
  				
  
  				
  								
	}

}
