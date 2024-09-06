package srinu01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class addticket {
	
WebDriver driver;

	
	@Test


	public  void addticket01 () throws InterruptedException {

		
		

		
		  Base01 v1 =new Base01(); driver =v1.base02();
		 
		  
		
		  driver.findElement(By.id("loginform-username")).sendKeys("T5300");
		  driver.findElement(By.id("loginform-password")).sendKeys("Admin@123");
		  driver.findElement(By.id("loginform-captcha")).click(); Thread.sleep(8000);
		  driver.findElement(By.name("login-button")).click(); Thread.sleep(2000);
		  
		  try{
		  
		  if( driver.getCurrentUrl().contains("site/login") ) {
		  driver.navigate().refresh(); } } catch(Exception e) {
		  System.out.println("No Contact Admin"); }
		 
			  Thread.sleep(2000);
			 
		
        driver.findElement(By.xpath("//h5[text()='Support']")).click();
		  Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class ='btn btn-primary cumodalbutton']")).click();
		  Thread.sleep(2000);

      
		  
		  WebElement k01 = driver.findElement(By.xpath("//span[@id='select2-ticket_type-container']"));
	        k01.click();
	               Thread.sleep(2000);

	            
	                         List<WebElement> bu01 =  driver.findElements(By.xpath("//ul[@id='select2-ticket_type-results']/li"));
	                        
	                         String name = "Add NONQR Stock";
	                        
	                         for (WebElement suu01: bu01) {
	                        
	                         if (suu01.getText().contains(name)) { suu01.click(); break; } }
		  
	                         
	                         WebElement k02 = driver.findElement(By.xpath("//span[@id='select2-prod_code-container']"));
	             	        k02.click();
	             	               Thread.sleep(2000);

	             	            
	             	                         List<WebElement> bu02 =  driver.findElements(By.xpath("//ul[@id='select2-prod_code-results']/li"));
	             	                        
	             	                         String name2 = "5165782";
	             	                        
	             	                         for (WebElement suu02: bu02) {
	             	                        
	             	                         if (suu02.getText().contains(name2)) { suu02.click(); break; } }         
	           
	      	             	               Thread.sleep(2000);

	             	                        driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("10");
	     	             	               Thread.sleep(2000);

	             	                        driver.findElement(By.xpath("//input[@id='mrp_batch']")).sendKeys("22A01");
	             	                        
		     	             	               Thread.sleep(2000);

	                         
		     	             	             driver.findElement(By.xpath("//input[@id='sloc']")).sendKeys("0001");
		             	                        
		     	             	               Thread.sleep(2000);

		     	             	             WebElement k03 = driver.findElement(By.xpath("//span[@id='select2-issue_priority-container']"));
		     		             	        k03.click();
		     		             	               Thread.sleep(2000);

		     		             	            
		     		             	                         List<WebElement> bu03 =  driver.findElements(By.xpath("//ul[@id='select2-issue_priority-results']/li"));
		     		             	                        
		     		             	                         String name3 = "Critical";
		     		             	                        
		     		             	                         for (WebElement suu03: bu03) {
		     		             	                        
		     		             	                         if (suu03.getText().contains(name3)) { suu03.click(); break; } } 
		     	             	               
		     			     	             	             driver.findElement(By.xpath("//textarea[@id='ticketing-issue_raised']")).sendKeys("ok");
    
		  		     		             	               Thread.sleep(2000);

		     			     	             	          WebElement upf = driver.findElement(By.xpath("//input[@id='ticketing-ticket_file']"));
		     			     							upf.sendKeys("C:\\Users\\Amrutha\\Downloads\\Union motor garage -2.jpeg");

		     			     							
				     		             	               Thread.sleep(2000);

		     			     	             	             
	     			     	             	             driver.findElement(By.xpath("//button[@id='allowsubmit']")).click();           
		     			     	             	             
	  		     		             	               Thread.sleep(2000);

	     			     	             	             driver.findElement(By.xpath("//table[@id='datatables_w1']/tbody/tr[1]/td[10]/button[@class='action-icon view-icon viewmodalbutton']")).click();           
		  		     		             	               Thread.sleep(2000);

		  		     		             			    driver.get("http://10.10.10.192/BPCL/central/site/logout");

	  		     		             	               
	  		     		             	               
	}

}
