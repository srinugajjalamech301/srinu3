import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Base {

	public static <WebDriver> void main(String[] args) {

		
		
		 System.setProperty("webdriver.chrome.driver",".\\resources\\drivers\\chromedriver.exe");
	        ChromeDriverManager driver=new ChromeDriverManager();
	        
	        
	        driver.get("http://10.10.10.192/BPCL/central/site/login");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	}

}
