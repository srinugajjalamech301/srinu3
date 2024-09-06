package Bharatgas;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Test

public class addlocation {
	


		
		
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
		
		
		
		driver.findElement(By.id("loginform-username")).sendKeys("admin");
		driver.findElement(By.id("loginform-password")).sendKeys("Admin@123");

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
		
		
		
		
		
		
		
		
		

        driver.findElement(By.xpath("//h5[text()='Master Data']")).click();

        Thread.sleep(2000);

		WebElement mo=driver.findElement(By.xpath("/html/body/div[3]/ul/div[1]/div/div[3]/li/span/span[1]/img[2]\r\n"));
        Actions actions = new Actions(driver);

        actions.moveToElement(mo).perform();
        Thread.sleep(2000);

        
        driver.findElement(By.cssSelector(".bgi2 > ul:nth-child(2) > li:nth-child(1) > a")).click();

        Thread.sleep(2000);


        driver.findElement(By.cssSelector("button.cumodalbutton:nth-child(1)")).click();
        
        Thread.sleep(2000);
        
        WebElement k = driver.findElement(By.cssSelector("#select2-loc_type-container"));
        k.click();
               Thread.sleep(2000);

            
       				  List<WebElement> bu =  driver.findElements(By.xpath("//ul [@id='select2-loc_type-results']/li"));
       				  
       				  String name = "Distributors";
       				  
       				  for (WebElement suu: bu) {
       				  
       				  if (suu.getText().contains(name)) { suu.click(); break; } }

	
       		         Thread.sleep(2000);    
       		         
       		         
       		         
       		         
       		                 driver.findElement(By.id("loc_name")).sendKeys("DUGYANI SATISH");
       		                 
       		              
		        				  String name001 = "DUGYANI SATISH";
		        				   
       		         
       		         
       		         Thread.sleep(2000);

       			///	driver.findElement(By.cssSelector("#loc_code")).sendKeys("3333");
       		       //  Thread.sleep(2000);
      		 
         driver.findElement(By.id("location-add1")).sendKeys(" HYDERABAD");
         
         
         Thread.sleep(2000);
         driver.findElement(By.id("location-pin_code")).sendKeys("500001");
         Thread.sleep(2000);
        
         
         
         
         driver.findElement(By.id("location-phone_no")).sendKeys("6302248495");

         
         
         
         Thread.sleep(2000);
         
         WebElement k01 = driver.findElement(By.cssSelector("#select2-state_id-container"));
         k01.click();
                Thread.sleep(2000);

             
        				  List<WebElement> bu01 =  driver.findElements(By.xpath("//ul [@id='select2-state_id-results']/li"));
        				  
        				  String name01 = "Telangana";
        				  
        				  for (WebElement suu01: bu01) {
        				  
        				  if (suu01.getText().contains(name01)) { suu01.click(); break; } }
         
         
         Thread.sleep(2000);
   		
      
         
         WebElement k02 = driver.findElement(By.cssSelector("#select2-district-container"));
         k02.click();
                Thread.sleep(2000);

             
        				  List<WebElement> bu02 =  driver.findElements(By.xpath("//ul [@id='select2-district-results']/li"));
        				  
        				  String name02 = "HYDERABAD";
        				  
        				  for (WebElement suu02: bu02) {
        				  
        				  if (suu02.getText().contains(name02)) { suu02.click(); break; } }
        			         Thread.sleep(2000);

        				  

        				  
         Thread.sleep(2000);
  		
         
         WebElement k03 = driver.findElement(By.cssSelector("#select2-region-container"));
         k03.click();
                Thread.sleep(2000);

             
        				  List<WebElement> bu03 =  driver.findElements(By.xpath("//ul [@id='select2-region-results']/li"));
        				  
        				  String name03 = "South";
        				  
        				  for (WebElement suu03: bu03) {
        				  
        				  if (suu03.getText().contains(name03)) { suu03.click(); break; } }
 		 
         Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[12]/div/div/div[2]/div/div/div/form/div[2]/button")).click();

		
		
		
		
		  Thread.sleep(2000);
		  driver.get("http://202.65.136.162/BPCLLPG/central/site/logout");
		  
		 
		
		
		
		
        driver.findElement(By.id("loginform-username")).sendKeys("U1111");
		driver.findElement(By.id("loginform-password")).sendKeys("Admin@123");

		By captcha1 = By.id("loginform-captcha");

		String enteredcapatcha1 = JOptionPane.showInputDialog("SRINU ENTER CAPTCHA");
		driver.findElement(captcha1).sendKeys(enteredcapatcha1);
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
	
	
	

	
	WebElement mo2=driver.findElement(By.xpath("//li[@class='nav__item nav__menu-item nav__menu-item--has-children bgi8 active ']"));
    Actions actions2 = new Actions(driver);

    actions2.moveToElement(mo2).perform();
    Thread.sleep(2000);

    
    driver.findElement(By.xpath("//a[@href='/BPCLLPG/central/bottlingplantwms/delivery-note']")).click();
	
    Thread.sleep(2000);

	
	
        driver.findElement(By.xpath("//button[@class='btn btn-primary mb-3 cumodalbutton']")).click();

        
    	Thread.sleep(2000);

        WebElement k2 = driver.findElement(By.cssSelector("#select2-loc_type-container"));
        k2.click();
               Thread.sleep(2000);

            
       				  List<WebElement> bu2 =  driver.findElements(By.xpath("//ul [@id='select2-loc_type-results']/li"));
       				  
       				  String name2 = "Distributors";
       				  
       				  for (WebElement suu: bu2) {
       				  
       				  if (suu.getText().contains(name2)) { suu.click(); break; } }

        
       				Thread.sleep(2000);

        
       				 WebElement k001 = driver.findElement(By.cssSelector("#select2-loc_name-container"));
       		         k001.click();
       		                Thread.sleep(2000);

       		             
       		        				  List<WebElement> bu001 =  driver.findElements(By.xpath("//ul [@id='select2-loc_name-results']/li"));
       		        				  
       		        				
       		        				  
       		        				  
       		        				//  String name001 = "SHOBHA";
       		        				  
       		        				
       		        				  for (WebElement suu01: bu001) {
       		        				  
       		        				  if (suu01.getText().contains(name001)) { suu01.click(); break; } }
       		         
        
		
       		          				Thread.sleep(2000);

       		        				  
       		        		        driver.findElement(By.xpath("//input[@id='po_no']")).sendKeys("PO45634");
       		        				Thread.sleep(2000);

       		        		        
       		        		        driver.findElement(By.xpath("//input[@id='vehicle_no']")).sendKeys("TS09E4411");

       		        				  
       		        		     Thread.sleep(2000);

    		        		        
    		        		        driver.findElement(By.xpath("//input[@id='inv_no']")).sendKeys("270861");
          		        		     Thread.sleep(2000);

    		        		        driver.findElement(By.xpath("//input[@id='productCode-1']")).click();
    		        		        Thread.sleep(2000);
    		        		        driver.findElement(By.xpath("//input[@id='productCode-1']")).sendKeys("763")   ;
    		        		        Thread.sleep(2000);
    		        		        Robot srin=new Robot();
    		        		        srin.keyPress(KeyEvent.VK_DOWN);
    		        		       Thread.sleep(1000);

    		        		        srin.keyRelease(KeyEvent.VK_DOWN);
    		        		        Thread.sleep(1000);

    		        		        srin.keyPress(KeyEvent.VK_ENTER);
     		        		       Thread.sleep(1000);

     		        		        srin.keyRelease(KeyEvent.VK_ENTER);
     		        		        Thread.sleep(1000);
    		        		        
								

     		        		        driver.findElement(By.xpath("//input[@id='qty-1']")).sendKeys("1");

         		        		     Thread.sleep(2000);
		
     		        		        driver.findElement(By.cssSelector("button#btn_create_order")).click();

     		        		        
        		        		     Thread.sleep(2000);

        		        		     
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
