package srinu01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New01 {

	/*
	 * WebDriver driver;
	 */
	
	@Test

	
	public  void new01 () {

		/*
		 * 
		 * Base01 v1 =new Base01(); driver =v1.base02();
		 */
		
		  WebDriver driver;
	        WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
	        
	        /*driver.get("https://tsbcl.telangana.gov.in/ts/index.php/site/login");
	        driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  */
			
			url = "https://tsbcl.telangana.gov.in/ts/index.php/site/login";
			
					num_iterations = 500;
			
							try:
							    for _ in range(num_iterations);
							        driver.get(url);
							finally:
	
								
								driver.quit();
			
		
	}

}
