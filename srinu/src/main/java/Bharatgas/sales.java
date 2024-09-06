package Bharatgas;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;	
import java.awt.Robot;	
import java.awt.event.KeyEvent;	
import javax.swing.JOptionPane;
import java.awt.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class sales {



static String un ="U1111" ;
static String pw ="Admin@123" ;
static String name01 = "S. SANTOSH";
static String po="5646";
static String vn="TS01E6455";
static String inv="5453563";
	
	
	
	
	
	
		static String url = "http://202.65.136.162/BPCLLPG/central/site/login";
		static Actions action;
	
		public static void base2() throws InterruptedException, Exception {
			//System.setProperty("webdriver.chrome.driver", ".\\resources\\drivers\\chromedriver.exe");
			WebDriver driver;
			//driver = new ChromeDriver();
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.id("loginform-username")).sendKeys(un);
		driver.findElement(By.id("loginform-password")).sendKeys(pw);

		By captcha = By.id("loginform-captcha");

		String enteredcapatcha = JOptionPane.showInputDialog("SRINU ENTER CAPTCHA");
		driver.findElement(captcha).sendKeys(enteredcapatcha);
driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		try {

			String url = driver.getCurrentUrl();
			System.out.println(url);
			if (url.contains("site/login")) {
				driver.get("http://202.65.136.162/BPCLLPG/central/site/dashboard");
			}
			else {
				System.out.println("No Contact Admin");
			}
		} catch (Exception e) {
			System.out.println("Getting Exception");
		}

		Thread.sleep(2000);
		
		
        driver.findElement(By.xpath("//h5[text()='C&F Depots']")).click();
	Thread.sleep(2000);
	
	
	

	
	WebElement mo=driver.findElement(By.xpath("//li[@class='nav__item nav__menu-item nav__menu-item--has-children bgi8 active ']"));
    Actions actions = new Actions(driver);

    actions.moveToElement(mo).perform();
    Thread.sleep(2000);

    
    driver.findElement(By.xpath("//a[@href='/BPCLLPG/central/bottlingplantwms/delivery-note']")).click();
	
    Thread.sleep(2000);

	
	
        driver.findElement(By.xpath("//button[@class='btn btn-primary mb-3 cumodalbutton']")).click();

        
    	Thread.sleep(2000);

        WebElement k = driver.findElement(By.cssSelector("#select2-loc_type-container"));
        k.click();
               Thread.sleep(2000);

            
       				  List<WebElement> bu =  driver.findElements(By.xpath("//ul [@id='select2-loc_type-results']/li"));
       				  
       				  String name = "Distributors";
       				  
       				  for (WebElement suu: bu) {
       				  
       				  if (suu.getText().contains(name)) { suu.click(); break; } }

        
       				Thread.sleep(2000);

        
       				 WebElement k01 = driver.findElement(By.cssSelector("#select2-loc_name-container"));
       		         k01.click();
       		                Thread.sleep(2000);

       		             
       		        				  List<WebElement> bu01 =  driver.findElements(By.xpath("//ul [@id='select2-loc_name-results']/li"));
       		        				  
       		        				
       		        				
       		        				  for (WebElement suu01: bu01) {
       		        				  
       		        				  if (suu01.getText().contains(name01)) { suu01.click(); break; } }
       		         
        
		
       		          				Thread.sleep(2000);

       		        				  
       		        		        driver.findElement(By.xpath("//input[@id='po_no']")).sendKeys(po);
       		        				Thread.sleep(2000);

       		        		        
       		        		        driver.findElement(By.xpath("//input[@id='vehicle_no']")).sendKeys(vn);

       		        				  
       		        		     Thread.sleep(2000);

    		        		        
    		        		        driver.findElement(By.xpath("//input[@id='inv_no']")).sendKeys(inv);
          		        		     Thread.sleep(2000);

    		        		        driver.findElement(By.xpath("//input[@id='productCode-1']")).click();
    		        		        Thread.sleep(2000);
    		        		        driver.findElement(By.xpath("//input[@id='productCode-1']")).sendKeys("763")   ;
    		        		        Thread.sleep(2000);
    		        		        
    		        		        Robot srin=new Robot();
    		        		        srin.keyPress(KeyEvent.VK_DOWN);
    		        		       Thread.sleep(2000);

    		        		        srin.keyRelease(KeyEvent.VK_DOWN);
    		        		        Thread.sleep(2000);

    		        		        srin.keyPress(KeyEvent.VK_ENTER);
     		        		       Thread.sleep(2000);

     		        		        srin.keyRelease(KeyEvent.VK_ENTER);
     		        		        Thread.sleep(2000);
    		        		        
								

     		        		        driver.findElement(By.xpath("//input[@id='qty-1']")).sendKeys("1");

         		        		     Thread.sleep(2000);
		
         		        		     
     		        		        driver.findElement(By.cssSelector("button#btn_create_order")).click();

     		        		        
        		        		     Thread.sleep(2000);

        		        		     
        		        		     
        		        		     
		
	}

}
