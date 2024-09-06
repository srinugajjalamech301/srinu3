package srinu01;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class MasterdataTC {

	static String url = "http://10.10.10.192/BPCL/central/site/login";
	static Actions action;
	private static FluentWait<WebDriver> wait;

	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		clickOnSignBtnNew02("CTELSUPPORT", "Admin@123");
		 TC01();
		 TC02();
		 TC03(); 
		 TC04();
		 TC05();
	}	
	public static void clickOnSignBtnNew02(String uname, String pass) throws Exception {
		boolean signIn = false;

		while (!signIn) {

			driver.findElement(By.id("loginform-username")).sendKeys(uname);
			driver.findElement(By.id("loginform-password")).sendKeys(pass);
			// autoCaptcha();

			WebElement imageElement = driver.findElement(By.cssSelector("img#loginform-captcha-image"));

			File src = imageElement.getScreenshotAs(OutputType.FILE);

			String path = "F:\\Subbu\\SELENIUM\\srinu\\captcha\\captcha.png";

			FileHandler.copy(src, new File(path));

			Thread.sleep(2000);

			ITesseract image = new Tesseract();

			String autoCap = image.doOCR(new File(path));

			System.out.println(autoCap);

			driver.findElement(By.id("loginform-captcha")).sendKeys(autoCap);

			driver.findElement(By.xpath("//button[text()='Sign In']")).click();

			Thread.sleep(1500);

			if (driver.getCurrentUrl().contains("dashboard")) {

				signIn = true;

				System.out.println("SIgn In");

				break;

			}

			else {

				driver.navigate().refresh();
				
				

			}

			
			
		}

	}

	public static void TC01() throws Exception {	
		
		
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//h5[text()='Master Data']")).click();

		Thread.sleep(2000);

		WebElement headerElement = driver.findElement(By.xpath("//h4[@class=\"page-title\"]"));

		String headerText = headerElement.getText();
		System.out.println("Header Text: " + headerText);

		assertEquals(headerText, "User");

		Thread.sleep(2000);

	}
		public static void TC02() throws Exception {	

		

		Thread.sleep(2000);

		WebElement mo = driver
				.findElement(By.xpath("/html/body/div[3]/ul/div[1]/div/div[3]/li/span/span[1]/img[2]\r\n"));
		Actions actions = new Actions(driver);

		actions.moveToElement(mo).perform();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".bgi2 > ul:nth-child(2) > li:nth-child(1) > a")).click();

		Thread.sleep(2000);

		WebElement headerElement01 = driver.findElement(By.xpath("//h4[normalize-space()='Location']"));
		
		String headerText01 = headerElement01.getText();
		System.out.println("Header Text: " + headerText01);

		assertEquals(headerText01, "Location");
		Thread.sleep(2000);		
		}
		
		
	
		public static void TC03() throws Exception {	


	
		
		Thread.sleep(2000);

		String[] fields = { "S.No.", "Loc Code (SAP)",  "Location Name", "Address", "District",
				"State", "Pin Code", "GST Number", "PAN Number", "Status", "Actions","Location Type"

		};

		// Verify the presence of each field
		for (String field : fields) {

			try {
				WebDriverWait ele = new WebDriverWait(driver, Duration.ofSeconds(10));

				ele.until(ExpectedConditions.presenceOfElementLocated(

						
					By.xpath("//table[@class='table table-hover widget-table']/thead/tr/th[text()='" + field + "'] | " +
                                "//table[@class='table table-hover widget-table']/thead/tr/th/a[text()='" + field + "']")));

						
		
				System.out.println(field + " field is present");
			} catch (Exception e) {
				System.out.println(field + " field is not present");

			}

			Thread.sleep(2000);

			
			
			
			
		}

		}
		

		public static void TC04() throws Exception {	
	 		Thread.sleep(2000);

		
			driver.findElement(By.xpath("//table[@class='table table-hover widget-table']/thead/tr/td[2]/input[@name='LocationSearch[loc_code]']")).sendKeys("108456");
			
			
			Thread.sleep(2000);

			//driver.findElement(By.xpath("//input[@type="text" and @name="LocationSearch[loc_code]"]").sendKeys("108456");
				
			 Robot robot = new Robot();
	         
	         robot.keyPress(KeyEvent.VK_ENTER);
	         robot.keyRelease(KeyEvent.VK_ENTER);
	 		Thread.sleep(2000);

	       //table[@class='table table-hover widget-table']/thead/tr/th
	         
	         
	       //table[@class='table table-hover widget-table']/tbody/tr/td[2][text()='" + field + "']      


	 		String[] fields = { "108456"};

	 		// Verify the presence of each field
	 		for (String field : fields) {

	 			try {
	 				WebDriverWait ele = new WebDriverWait(driver, Duration.ofSeconds(10));

	 				ele.until(ExpectedConditions.presenceOfElementLocated(
	 						
	 					By.xpath("//table[@class='table table-hover widget-table']/tbody/tr/td[2][text()='" + field + "']")));
		
	 				System.out.println(field + " field is present");
	 			} catch (Exception e) {
	 				System.out.println(field + " field is not present");

	 			}  
			
			
		
		
	}}
	 		
			public static void TC05() throws Exception {	
		 		Thread.sleep(2000);

				WebElement element =
						driver.findElement(By.xpath("//body/div[@class='page-content']/div/div/div[contains(@class, 'clearfix') and contains(@class, 'page-display')]/div[contains(@class, 'float-right')]"));
				
				
	        
				String hd = element.getText();
				
				
				System.out.println("Found element: " + hd);

				assertEquals(hd,"Home\nMaster Data\nLocation");
				
				
				
		}
	
	
}
