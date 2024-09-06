package srinu01;

import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class locationcreation {
	
	
	private static final String diver = null;
	WebDriver driver;

	
	@Test


	public void  addlocation() throws Throwable {
		
		
		
		logintest l =new logintest();
		l.first();
		
		
		
		/*
		 * driver.findElement(By.id("loginform-username")).sendKeys("T5300");
		 * driver.findElement(By.id("loginform-password")).sendKeys("Admin@123");
		 * 
		 * By captcha = By.id("loginform-captcha");
		 * 
		 * String enteredcapatcha = JOptionPane.showInputDialog("SRINU ENTER CAPTCHA");
		 * driver.findElement(captcha).sendKeys(enteredcapatcha);
		 * 
		 * 
		 * driver.findElement(By.name("login-button")).click(); Thread.sleep(2000);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * try {
		 * 
		 * String url = driver.getCurrentUrl(); System.out.println(url); if
		 * (url.contains("site/login")) {
		 * driver.get("http://10.10.10.192/BPCL/central/site/dashboard"); } else {
		 * System.out.println("No Contact Admin"); } } catch (Exception e) {
		 * System.out.println("Getting Exception"); }
		 * 
		 * Thread.sleep(2000);
		 */
			  Thread.sleep(2000);
			 
		
        driver.findElement(By.xpath("//h5[text()='Master Data']")).click();

        Thread.sleep(2000);

		WebElement mo=driver.findElement(By.xpath("/html/body/div[3]/ul/div[1]/div/div[3]/li/span/span[1]/img[2]\r\n"));
        Actions actions = new Actions(driver);

        actions.moveToElement(mo).perform();
        Thread.sleep(2000);

        
        driver.findElement(By.cssSelector(".bgi2 > ul:nth-child(2) > li:nth-child(1) > a")).click();

        Thread.sleep(2000);


        driver.findElement(By.cssSelector("button.cumodalbutton:nth-child(1)")).click();
        
        Thread.sleep(2000);
        
        WebElement k = driver.findElement(By.cssSelector("#select2-loc_type-container"));
        k.click();
               Thread.sleep(2000);

            
       				  List<WebElement> bu =  driver.findElements(By.xpath("//ul [@id='select2-loc_type-results']/li"));
       				  
       				  String name = "Bottling Unit";
       				  
       				  for (WebElement suu: bu) {
       				  
       				  if (suu.getText().contains(name)) { suu.click(); break; } }

	
       		         Thread.sleep(2000);    
       		         
       		         driver.findElement(By.id("loc_name")).sendKeys("Khammllam");
       		         Thread.sleep(2000);

       				driver.findElement(By.cssSelector("#loc_code")).sendKeys("3333");
       		         Thread.sleep(2000);
      		 
         driver.findElement(By.id("location-add1")).sendKeys("Khammllam ktm");
         Thread.sleep(2000);
         driver.findElement(By.id("location-pin_code")).sendKeys("504302");
         Thread.sleep(2000);
        
         driver.findElement(By.id("location-phone_no")).sendKeys("1250085658");

         Thread.sleep(2000);
         
         WebElement k01 = driver.findElement(By.cssSelector("#select2-state_id-container"));
         k01.click();
                Thread.sleep(2000);

             
        				  List<WebElement> bu01 =  driver.findElements(By.xpath("//ul [@id='select2-state_id-results']/li"));
        				  
        				  String name01 = "Andhra Pradesh";
        				  
        				  for (WebElement suu01: bu01) {
        				  
        				  if (suu01.getText().contains(name01)) { suu01.click(); break; } }
         
         
         Thread.sleep(2000);
   		
      
         
         WebElement k02 = driver.findElement(By.cssSelector("#select2-district-container"));
         k02.click();
                Thread.sleep(2000);

             
        				  List<WebElement> bu02 =  driver.findElements(By.xpath("//ul [@id='select2-district-results']/li"));
        				  
        				  String name02 = "ANANTAPUR";
        				  
        				  for (WebElement suu02: bu02) {
        				  
        				  if (suu02.getText().contains(name02)) { suu02.click(); break; } }
        			         Thread.sleep(2000);

        				  
        					driver.findElement(By.cssSelector("#short_code")).sendKeys("s");

        				  
         Thread.sleep(2000);
  		
         
         WebElement k03 = driver.findElement(By.cssSelector("#select2-region-container"));
         k03.click();
                Thread.sleep(2000);

             
        				  List<WebElement> bu03 =  driver.findElements(By.xpath("//ul [@id='select2-region-results']/li"));
        				  
        				  String name03 = "East";
        				  
        				  for (WebElement suu03: bu03) {
        				  
        				  if (suu03.getText().contains(name03)) { suu03.click(); break; } }
 		 
         Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[12]/div/div/div[2]/div/div/div/form/div[2]/button")).click();

 		
	}

	}
