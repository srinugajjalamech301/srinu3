package srinu01;

import java.util.Iterator;
import java.util.Set;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class labelindentaccepting {

	WebDriver driver;

	@Test

	public void labelindentaccepting01() throws InterruptedException {

		Base01 v1 = new Base01();
		driver = v1.base02();

		/*
		 * addlabelindent p= new addlabelindent(); p.addlabelindent01();
		 * 
		 * Thread.sleep(3000);
		 */
		driver.findElement(By.id("loginform-username")).sendKeys("Aarjav294564");
		driver.findElement(By.id("loginform-password")).sendKeys("Admin@123");

		By captcha = By.id("loginform-captcha");

		String enteredcapatcha = JOptionPane.showInputDialog("SRINU ENTER CAPTCHA");
		driver.findElement(captcha).sendKeys(enteredcapatcha);

		// driver.findElement(signInBtn).click();

		/*
		 * driver.findElement(By.id("loginform-captcha")).click(); Thread.sleep(8000);
		 */
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

		driver.findElement(By.xpath("//h5[text()='Label Management']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("table#label-indent-table tr:nth-child(1) td:nth-child(9) button")).click();

		String title = driver.findElement(By.cssSelector("h4.page-title")).getText();
		System.out.println("Actual --->" + title);

		Thread.sleep(2000);

		Set<String> yy = driver.getWindowHandles();
		int uu = yy.size();

		Iterator<String> Iterator = yy.iterator();
		while (Iterator.hasNext()) {

			String window = Iterator.next();
			driver.switchTo().window(window);
			Thread.sleep(2000);
			System.out.println("assume Nothing --->" + driver.findElement(By.cssSelector("h4.page-title")).getText());

		}

		System.out.println("out of the loop");
		/*
		 * String parent= yy.iterator().next(); // assume parent
		 * driver.switchTo().window(parent);
		 * System.out.println("assume parent --->"+title); String child =
		 * yy.iterator().next(); // assume child driver.switchTo().window(child);
		 * 
		 * System.out.println("assume child --->"+title); String nothing =
		 * yy.iterator().next(); // assume nothing driver.switchTo().window(nothing);
		 * System.out.println("assume nothing --->"+title);
		 */

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Indent Approve']")).click();

		driver.switchTo().alert().accept();

		Thread.sleep(2000);
		// driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.cssSelector(".swal-button.swal-button--confirm")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='7222153']")).click();

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("table#ind-tablea tr td:nth-child(1) input")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Dispatch']")).click();

		Thread.sleep(2000);

		driver.switchTo().alert().accept();

		Thread.sleep(2000);
		driver.get("http://10.10.10.192/BPCL/central/site/logout");

	}

}
