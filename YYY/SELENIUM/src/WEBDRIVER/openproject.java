package WEBDRIVER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openproject {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\automachine\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("http://10.10.10.195/BPCLPROD/central/site/login");
		driver.manage().window().maximize(); 
		
			driver.findElement(By.id("loginform-username")).sendKeys("sww");
			driver.findElement(By.id("loginform-password")).sendKeys("Admin@123");
			driver.findElement(By.id("loginform-captcha")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("login-button")).click(); 
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/div/a/h5"));
			
			
			
			
			
		
	}

}
