package srinu01;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class login001 {
	
	
	WebDriver driver;
	
			

	public login001(WebDriver driver) {
		
		
		this.driver=driver;

	}


	@Test
	
	public  WebDriver login0001() throws InterruptedException {


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
		
		
		return driver;

		
		
		
	}

}
