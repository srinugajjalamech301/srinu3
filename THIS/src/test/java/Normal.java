import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Normal {

	static WebDriver driver;
	static String userName = "CTELSUPPORT", password = "Admin@4321";

	public static void main(String[] args) throws Exception {

		login();
		Thread.sleep(2000);
		tabsClick();

		// clickOnTabs();

		// getHeaderName();
		/*
		 * 
		 * getLinkText(); getLinkText();
		 * 
		 * List<WebElement> tagNames = driver.findElements(By.tagName("a"));
		 * clickOnLinkText(tagNames); Thread.sleep(2000); getLinkText();
		 * Thread.sleep(2000); List<WebElement> tags =
		 * driver.findElements(By.tagName("a")); clickOnLinks(tags);
		 */
	}

	static void login() throws InterruptedException {
		String url = "http://central.hpfsproject.com/BPCL/central/site/login";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		// WebElements

		WebElement user = driver.findElement(By.cssSelector("input#loginform-username")),
				pass = driver.findElement(By.cssSelector("input#loginform-password")),
				signIn = driver.findElement(By.cssSelector("button[type='submit']")),
				captcha = driver.findElement(By.cssSelector("input#loginform-captcha"));

		// Actions
		user.sendKeys(userName);
		pass.sendKeys(password);
		String captch = JOptionPane.showInputDialog("Enter Captcha");
		captcha.sendKeys(captch);
		signIn.click();
		Thread.sleep(1000);
		boolean site = driver.getCurrentUrl().contains("dashboard");
		try {

			if (site) {
				System.out.println("success");
			} else {
				driver.navigate().refresh();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	static void tabsClick() throws InterruptedException {

		String data = "Production";
		WebElement Master_Data = driver.findElement(By.xpath("//*[text()='" + data + "']"));
		String mainWindow = driver.getWindowHandle();
		Master_Data.click();
		Actions abc = new Actions(driver);
		Thread.sleep(2000);
		abc.moveToElement(driver.findElement(By.xpath("//*[text()='" + data + "']")));
		List<WebElement> singleTabs = driver.findElements(
				By.xpath("//span[text()='" + data + "']/parent::span/parent::li/ul/li[@class='nav__menu-item']"));
		for (WebElement tab : singleTabs) {
			abc.moveToElement(tab).keyDown(Keys.CONTROL).click().build().perform();
		}

		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println(count);

		Iterator<String> abh = allwindows.iterator();
		while (abh.hasNext()) {
			if (abh.next() != mainWindow) {

				driver.switchTo().window(abh.next());
				try {
					new WebDriverWait(driver, Duration.ofSeconds(10)).until(
							ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("h4.page-title")));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				Thread.sleep(1000);
				driver.close();        
			}
		}

	}

	static void getLinkText() throws InterruptedException {

		driver.findElement(By.xpath("//*[text()='Master Data']")).click();
		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("h4.page-title")));

		List<WebElement> tagNames = driver.findElements(By.cssSelector("ul li a"));
		int count = tagNames.size();
		System.out.println(count);
		for (WebElement tag : tagNames) {
			System.out.println(tag.getText());
			// System.out.println(tag.getAttribute("href"));
		}
	}

	static void clickOnLinkText(List<WebElement> tagNames) {
		for (WebElement tag : tagNames) {
			if (tag.getText().contentEquals("Master Data")) {
				tag.click();
				break;
			}
		}

	}

	static void clickOnLinks(List<WebElement> tagNames) {
		for (WebElement tag : tagNames) {
			String uu = tag.getAttribute("href");
			if (uu.contains("http")) {
				driver.get(uu);

			}

		}

	}

	private static void clickOnTabs() throws Exception {
		List<WebElement> tablink = driver.findElements(By.cssSelector(".dashboard-container div.form-row div a"));
		for (WebElement tab : tablink) {
			Actions aa = new Actions(driver);
			aa.moveToElement(tab).keyDown(Keys.CONTROL).click().build().perform();

		}

	}

	private static void getHeaderName() {
		Set<String> tabs = driver.getWindowHandles();
		System.out.println(tabs.size());
		Iterator<String> Iterator = tabs.iterator();
		while (Iterator.hasNext()) {
			driver.switchTo().window(Iterator.next());

			try {
				new WebDriverWait(driver, Duration.ofSeconds(10))
						.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("h4.page-title")));

				System.out.println(driver.findElement(By.cssSelector("h4.page-title")).getText());
			} catch (Exception ii) {
				System.out.println("title is not found");
			}

		}

	}

}
