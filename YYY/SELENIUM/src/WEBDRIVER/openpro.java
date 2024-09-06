package WEBDRIVER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class openpro {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\automachine\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://10.10.10.242/openproject/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Sign in")).click(); 
		driver.findElement(By.id("username-pulldown")).sendKeys("srinu.g@ctel.in");
		driver.findElement(By.id("password-pulldown")).sendKeys("Admin@123456");  
		driver.findElement(By.id("login-pulldown")).click();
	
		
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/ul/li[2]/a/i")).click();
		WebElement q1Element = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/ul/li[2]/a/i"));
		Select d1 =new Select(q1Element);
		d1.selectByIndex(1); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Task']")).click();

		
		//driver.findElement(By.partialLinkText("Task")).click();

		//driver.findElement(By.className("__hl_inline_type_1 op-menu--item-action")).click();

		
//driver.findElement(By.className("icon-add op-quick-add-menu--icon")).click();
//WebElement q1Element = driver.findElement(By.className("icon-add op-quick-add-menu--icon"));
//Select d1 =new Select(q1Element);
//d1.selectByIndex(1);
		
		
		
		
		
	}

}
