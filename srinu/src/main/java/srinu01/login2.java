package srinu01;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class login2 {
	
	WebDriver driver;

	@Test

	public  void login02() throws InterruptedException {
		
		Base01 v1 = new Base01();
		driver = v1.base02();

		login001 k2 = new login001(driver);
		k2.login0001();
		
	
		

	}

}
