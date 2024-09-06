package srinu01;

import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class addlabelindent {
	
	WebDriver driver;
	
	@Test

	public  void addlabelindent01() throws InterruptedException {

		
		  Base01 v1 =new Base01(); 
		  driver =v1.base02();
		  driver.findElement(By.id("loginform-username")).sendKeys("T5300");
	        driver.findElement(By.id("loginform-password")).sendKeys("Admin@123");
	        By captcha = By.id("loginform-captcha");

			String enteredcapatcha = JOptionPane.showInputDialog("SRINU ENTER CAPTCHA");
			driver.findElement(captcha).sendKeys(enteredcapatcha);
			
	        driver.findElement(By.name("login-button")).click();  
	        Thread.sleep(2000);
			
			  try{
			  
			  if( driver.getCurrentUrl().contains("site/login") ) {
			  driver.navigate().refresh(); } } catch(Exception e) {
			  System.out.println("No Contact Admin"); } 
			  Thread.sleep(4000); 
		        driver.findElement(By.xpath("//h5[text()='Label Management']")).click();
				  Thread.sleep(2000);
		  
			        driver.findElement(By.cssSelector(".cumodalbutton")).click();

					  Thread.sleep(2000); 
					  

						
						  WebElement k =
						  driver.findElement(By.cssSelector("#select2-indentFormLoad-container"));
						  k.click(); Thread.sleep(2000);
						 
					  
					  List<WebElement> supplNames = driver.findElements(By.cssSelector("#select2-indentFormLoad-results li"));

						String name = "S.KUMAR MULTI PRODUCTS PVT. LTD.";

						for (WebElement suu : supplNames) {

							if (suu.getText().contains(name)) {
								suu.click();
								break;
							}
						}			  
					  
						
							Thread.sleep(2000);

					        WebElement upf = driver.findElement(By.cssSelector("input#file"));
							upf.sendKeys("C:\\Users\\Amrutha\\Downloads\\sample(13).csv");

							Thread.sleep(2000);

							driver.findElement(By.id("btn_create_indent")).click();
							
							Thread.sleep(18000);
							
							driver.findElement(By.xpath("//i[@class='fa fa-eye']")).click();

							Thread.sleep(2000); 

							driver.findElement(By.linkText("7222153")).click();
							Thread.sleep(2000); 

							//driver.findElement(By.xpath("//button [@id='closespoolpopup']")).click();
							//driver.findElement(By.cssSelector("button#closespoolpopup")).click();
							//driver.findElement(By.)linkText("×")).click();
							driver.findElement(By.cssSelector("#closespoolpopup span")).click();

							
							
							
							
							Thread.sleep(2000); 

							driver.findElement(By.cssSelector("#modalHeaderView span")).click();
							
							Thread.sleep(2000); 
					        driver.get("http://10.10.10.192/BPCL/central/site/logout");
							/*
							 * driver.findElement(By.className("fa fa-power-off")).click();
							 * Thread.sleep(2000);
							 * driver.findElement(By.className("btn btn-primary mb-2")).click();
							 * Thread.sleep(2000);
							 */

							
							
							
							
							
	}

}
