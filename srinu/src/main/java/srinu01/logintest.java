package srinu01;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class logintest {

	private static final boolean corre = false;
	WebDriver driver;

	
	@Test
	public void first() throws Exception {

		// driver = Base01.base02();

		Base01 v1 = new Base01();
		driver = v1.base02();

		login001 l = new login001(driver);
		l.login0001();

		try {

			String url = driver.getCurrentUrl();
			System.out.println(url);
			if (url.contains("site/login")) {
				driver.get("http://10.10.10.192/BPCL/central/site/login");
			}

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Getting Exception");
		}

		while (true) {
			String url = driver.getCurrentUrl();
			System.out.println(url);

			if (!corre) {

				login001 l0 = new login001(driver);
				l0.login0001();

			} else {
				break;
			}

		}
	
	}

}
