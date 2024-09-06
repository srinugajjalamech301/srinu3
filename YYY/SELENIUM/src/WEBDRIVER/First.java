package WEBDRIVER;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) throws Exception  { 
		
	System.setProperty("webdriver.gecko.driver","C:\\automachine\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://central.hpfsproject.com/BPCL/central/site/login");
	driver.manage().window().maximize(); 
	
	  Thread.sleep(5000); driver.findElement(By.xpath(
	  "//html/body/div[1]/div/div/div[2]/div[1]/div/div[1]/form/a")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.id("verifybottledata")).sendKeys("890L7245884L/11287/6WINTERGRADE220113SPF3S7QLngy5E00329");
	  Thread.sleep(10000);
	 driver.findElement(By.xpath("//*[@id=\"verifyBottleSubmit\"]")).click();
	  Thread.sleep(2000); driver.findElement(By.id("refreshproduct")).click();
	  Thread.sleep(3000);
	  //driver.findElement(By.cssSelector("button#close span")).click();
	  driver.navigate().back();
	 
	Thread.sleep(3000);
		driver.findElement(By.id("loginform-username")).sendKeys("W5400");
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
		
		
		
		driver.findElement(By.xpath("//h5[text()='Production']")).click();

		//click on start date
		
		driver.findElement(By.cssSelector("#start_date")).click();
	//click on mobth and year
		
		driver.findElement(By.cssSelector(".datepicker-switch")).click();
		
				String ActualYear="18";
		
		
		
		
		while(true)
		{
			WebElement yeare =driver.findElement(By.cssSelector(".datepicker-months .datepicker-switch"));
			String year=yeare.getText();
			System.out.println(year);
				
			boolean corre=year.contains(ActualYear);
			System.out.println(corre);
			
		if(!corre) {
		
			driver.findElement(By.cssSelector(".datepicker-months .prev")).click();
			yeare.getText();
		}
		else {
			break;
		}
		
	
		}
		
		Thread.sleep(5000);
List <WebElement>	gg=	driver.findElements(By.cssSelector(".month"));


String month="Mar";
for(WebElement g:gg) {
	if(g.getText().contentEquals(month))
	{
		g.click();
		System.out.println("month clicked");
	}
	break;
}

String day="20";
List <WebElement>	days=	driver.findElements(By.cssSelector("[class='day']"));
for(WebElement g:days) {
	if(g.getText().contentEquals(day))
	{
		g.click();
	}
	break;
}


Thread.sleep(5000);



		
		
		//driver.findElement(By.linkText("/BPCL/central/production/production/production")).click();

		//driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/ul/div[1]/div/div[8]/li/span/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/ul/div[1]/div/div[8]/li/ul/li[4]/a")).click();
		driver.findElement(By.id("myBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//html/body/div[4]/div/div/div/div[3]/div/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//html/body/div[14]/div/div/div[2]/div/div/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/div[12]/div/div/div[1]/button/span")).click();
	}
}
