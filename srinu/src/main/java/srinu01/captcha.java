package srinu01;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class captcha {
	
	static String url = "http://10.10.10.192/BPCL/central/site/login";
	static Actions action;
	private static FluentWait<WebDriver> wait;
	
	public static WebDriver driver;
	
	
	public static void main(String[] args) throws Throwable {
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		clickOnSignBtnNew("W5400","Admin@123");
}

	public static void clickOnSignBtnNew(String uname,String pass) throws Exception {


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



	public void oldd() throws Exception {

		WebDriver driver;
		//driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
			//	action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("m").keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).perform();
				
		driver.findElement(By.id("loginform-username")).sendKeys("admin");
        driver.findElement(By.id("loginform-password")).sendKeys("Admin@123");
     // autoCaptcha();

        WebElement imageElement = driver.findElement(By.cssSelector("img#loginform-captcha-image"));


        File src = imageElement.getScreenshotAs(OutputType.FILE);



      // ----String path = "C:\\Users\\qq\\eclipse-workspace\\CTELMAIN.zip_expanded\\QR\\CaptchaImg\\captcha.png";
        
        
       String path="F:\\Subbu\\SELENIUM\\srinu\\captcha\\captcha.png";


      

       FileHandler.copy(src, new File(path));
       
        ITesseract image = new Tesseract();


        String autoCap = image.doOCR(new File(path));


        System.out.println(autoCap);


        driver.findElement(By.cssSelector("loginform-captcha")).sendKeys(autoCap);

        //driver.findElement(By.name("login-button")).click(); 
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("login-button")))).click();

        Thread.sleep(1000);

        
        
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

        
 }
	}