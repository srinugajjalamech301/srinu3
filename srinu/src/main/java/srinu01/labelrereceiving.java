package srinu01;

import java.util.Iterator;
import java.util.Set;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class labelrereceiving {
	
WebDriver driver;
	
	@Test

	public  void labelrereceiving01() throws Throwable {

		
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
		
				  WebElement mo=driver.findElement(By.xpath("//span[text()='Label Management']"));
			        Actions actions = new Actions(driver);

			        actions.moveToElement(mo).perform();
			        Thread.sleep(2000);
			       
			        driver.findElement(By.xpath("//a[text()='Label Receiving']")).click();

				  
			        Thread.sleep(2000);

					driver.findElement(By.cssSelector("#label-inventory-table_wrapper tr:nth-child(1) td:nth-child(9) button")).click();

					String title = driver.findElement(By.cssSelector("h4.page-title")).getText();
					System.out.println("Actual --->" + title);

					Thread.sleep(2000);

					Set<String> yy = driver.getWindowHandles();
					int uu = yy.size();

					Iterator<String> Iterator = yy.iterator();
					while (Iterator.hasNext()) {

						String window = Iterator.next();
						driver.switchTo().window(window);
						Thread.sleep(2000);
						System.out.println("assume Nothing --->" + driver.findElement(By.cssSelector("h4.page-title")).getText());

					}

					System.out.println("out of the loop");		
					
					
					Thread.sleep(2000);

			        driver.findElement(By.xpath("//a[text()='7222153']")).click();
					Thread.sleep(2000);

					
					driver.findElement(By.cssSelector("table#ind-tablerec tr td:nth-child(1) input")).click();
					Thread.sleep(2000);

			        driver.findElement(By.xpath("//button[text()='Label Receive ']")).click();
					Thread.sleep(2000);

					driver.switchTo().alert().accept();

					Thread.sleep(3000);

			        driver.get("http://10.10.10.192/BPCL/central/site/logout");
    
		
	}

}
