package BPCLTC;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc02 {
	 WebDriver driver;

		@Test
		
		
	public void tc () throws Throwable {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("http://10.10.10.192/BPCL/central/site/login");

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			driver.findElement(By.id("loginform-username")).sendKeys("CTELSUPPORT");
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
				} else {
					System.out.println("No Contact Admin");
				}
			} catch (Exception e) {
				System.out.println("Getting Exception");
			}
			
		
		
			driver.findElement(By.xpath("//h5[text()='Master Data']")).click();

			Thread.sleep(2000);

			WebElement mo = driver
					.findElement(By.xpath("/html/body/div[3]/ul/div[1]/div/div[3]/li/span/span[1]/img[2]\r\n"));
			Actions actions = new Actions(driver);

			actions.moveToElement(mo).perform();
			Thread.sleep(2000);

			driver.findElement(By.cssSelector(".bgi2 > ul:nth-child(2) > li:nth-child(1) > a")).click();

			Thread.sleep(2000);
		
driver.findElement(By.cssSelector("button.cumodalbutton:nth-child(1)")).click();
	        
	        Thread.sleep(2000);
		
	        
	/*      TC01     verify click functionality of + Add Location sub tab under Master Data
	      String[] fields = {
	                "Location Type",
	                "Location Name",
	                "Address",
	                "Pin Code",
	                "Phone No",
	                "PAN Number",
	                "TAN Number",
	                "TIN Number",
	                "GST Number",
	                "CIN Number",
	                "State",
	                "District",
	                "Latitude",
	                "Longitude",
	                "Status",
	                "Region"
	               
	            };
	            
	            // Verify the presence of each field
	            for (String field : fields) {
	                try {
	                    WebElement element = new WebDriverWait(driver, 10).until(
	                        ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='cumodalContent']//label[text()='" + field + "']"))
	                    );
	                    System.out.println(field + " field is present");
	                } catch (Exception e) {
	                    System.out.println(field + " field is not present");
	                    
	                    
	                }
	            */    
	                Thread.sleep(5000);
	                
	                
	                
	                
	                //TC02  verify click functionality of save tab without entering  sub tab under Master Data
	                
	    		driver.findElement(By.xpath("//button[@class=\"btn btn-submit w-50\"]")).click();
   
	                Thread.sleep(2000);

	          
	    			 String[] fields = {
	    		                "Location Type cannot be blank.",
	    		                "Location Name cannot be blank.",
	    		                "Address cannot be blank.",
	    		                "Pin Code cannot be blank.",
	    		                "Phone No cannot be blank.",
	    		                "State cannot be blank.",
	    		                "District cannot be blank.",
	    		                "Region cannot be blank."
	    		               
	    		            };
	    		            
	    		            // Verify the presence of each field
	    		            for (String field : fields) {
	    		                try {
	    		                    WebElement element = new WebDriverWait(driver, 10).until(
	    		                        ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='cumodalContent']//div[text()='" + field + "']"))
	    		                    );
	    		                    System.out.println(field + " field is present");
	    		                } catch (Exception e) {
	    		                    System.out.println(field + " field is not present");
	    		                    
	    		                    
	    		                }
	    		                
	    		            
	                
	           //  TC03   To verify Location Type
	                
	    		         /*      WebElement k = driver.findElement(By.cssSelector("#select2-loc_type-container"));
	    		                k.click();
	    		                       Thread.sleep(2000);
	    		                     
	    		         
	    		                       String[] fields = {
	    			    		                "BU Admin",
	    			    		                "Bottling Unit",
	    			    		                "C&F Depot",
	    			    		                "Coupon Manufacture",
	    			    		                "C-Tel",
	    			    		                "Distributors",
	    			    		                "Head Quarters",
	    			    		                "Label Supplier",
	    			    		                "Others",
	    			    		                "Repackers",
	    			    		                "Retailers",
	    			    		                "Support",
	    			    		                "Third Party Lines"
	    			    		            };
	    			    		            
	    			    		            ///// Verify the presence of each field
	    			    		            for (String field : fields) {
	    			    		                try {
	    			    		                    WebElement element = new WebDriverWait(driver, 10).until(
	    			    		                        ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id=\"select2-loc_type-results\" and @class=\"select2-results__options\"]//li[text()='" + field + "']"))
	    			    		                    );
	    			    		                    System.out.println(field + " field is present");
	    			    		                } catch (Exception e) {
	    			    		                    System.out.println(field + " field is not present");
	    			    		                    
	    			    		                    
	    			    		                }       
	    		                       */
	    		                
	    		                
	                
	                
	                
	                
	               
	                
	                
	                
	                
	                
	                
	                
	           
	                
	                
	                
	                
	            }
	        } 
	        
	          		  
} 


