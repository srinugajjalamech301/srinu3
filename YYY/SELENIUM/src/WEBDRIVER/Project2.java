package WEBDRIVER;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\automachine\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://central.hpfsproject.com/BPCL/central/site/login");
		driver.manage().window().maximize();
		
		
	}

}
