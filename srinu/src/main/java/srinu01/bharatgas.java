package srinu01;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class bharatgas {
WebDriver driver;

	
	@Test

	public  void bharatgas1() throws InterruptedException {
		
		
		
		  Base01 v1 =new Base01(); driver =v1.base02();
		
		  
		   driver.findElement(By.id("loginform-username")).sendKeys("Plant");
			  driver.findElement(By.id("loginform-password")).sendKeys("Admin@123");
			  
			  By captcha = By.id("loginform-captcha");
			  
			  String enteredcapatcha = JOptionPane.showInputDialog("SRINU ENTER CAPTCHA");
			  driver.findElement(captcha).sendKeys(enteredcapatcha);
			  
			 
			  driver.findElement(By.name("login-button")).click(); Thread.sleep(2000);
			  
		  
		  
		  
		  
		  
		  
		  
		
	}

}
