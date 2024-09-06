package srinu01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	
WebDriver driver;

public login(WebDriver driver){
this.driver=driver;

}
	

	public  void login01() throws Exception {

			
		   driver.findElement(By.id("loginform-username")).sendKeys("admin");
	        driver.findElement(By.id("loginform-password")).sendKeys("Admin@123");
	        driver.findElement(By.id("loginform-captcha")).click();
	        Thread.sleep(8000);
	        driver.findElement(By.name("login-button")).click();  
	        Thread.sleep(2000);
		
	        try{
	            
	            if(
	            driver.getCurrentUrl().contains("site/login")
	            )
	            {
	                driver.navigate().refresh();
	            }
	        }
	        catch(Exception e) {
	            System.out.println("No Contact Admin");
	        }
	        Thread.sleep(2000);
	        
	        
		
		
		
		
	}

}
