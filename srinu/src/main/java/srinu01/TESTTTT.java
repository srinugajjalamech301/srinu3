package srinu01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TESTTTT {

	static WebDriver driver;

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			runn();
			System.out.println("Web Browser opened for the -->"+i+ "----time");
		}

	}

	public static void runn() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.get("https://tsbcl.telangana.gov.in/ts/index.php/site/login");
		driver.manage().window().maximize();

		driver.close();
 
	}
}
