package Bharatgas;

import java.awt.AWTException;	
import java.awt.Robot;	
import java.awt.event.KeyEvent;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class minimizewindowo {

	String url01 = "http://10.10.10.192/BPCL/central/site/login";
	 Actions action01;

		WebDriver driver;
//	 @Test
//	 public void atestuu() {
//		 System.out.println("vhgvhgsvcjhsdjh");
//	 }
//	 
//	 
		
	@Test
		public  void minimizewindow01() throws Throwable {
		
		
			/*
			 * WebDriverManager.firefoxdriver().setup(); driver=new FirefoxDriver();
			 * 
			 * driver.get(url01); driver.manage().window().maximize();
			 */
		
		
		
			Robot srin=new Robot(); 
			
			
			/*
			 * srin.keyPress(KeyEvent.VK_WINDOWS); Thread.sleep(2000);
			 * 
			 * srin.keyPress(KeyEvent.VK_DOWN); Thread.sleep(2000);
			 * 
			 * srin.keyRelease(KeyEvent.VK_WINDOWS); Thread.sleep(2000);
			 * srin.keyRelease(KeyEvent.VK_DOWN);
			 * 
			 * Thread.sleep(2000);
			 */
			
			
			
			
			
			
			
			
			
			
			
			
			srin.keyPress(KeyEvent.VK_WINDOWS);
			srin.keyPress(KeyEvent.VK_M);
			srin.keyRelease(KeyEvent.VK_M);
			srin.keyRelease(KeyEvent.VK_WINDOWS);
			
			Thread.sleep(2000);

			

			
			
			
			  srin.keyPress(KeyEvent.VK_WINDOWS); srin.keyPress(KeyEvent.VK_S);
			  srin.keyRelease(KeyEvent.VK_S); srin.keyRelease(KeyEvent.VK_WINDOWS);
			  
			  
			  Thread.sleep(2000);
			  
			  srin.keyPress(KeyEvent.VK_N); srin.keyRelease(KeyEvent.VK_N);
			  srin.keyPress(KeyEvent.VK_O); srin.keyRelease(KeyEvent.VK_O);
			  srin.keyPress(KeyEvent.VK_T); srin.keyRelease(KeyEvent.VK_T);
			  Thread.sleep(2000);
			  
			  srin.keyPress(KeyEvent.VK_ENTER); srin.keyRelease(KeyEvent.VK_ENTER);
			  Thread.sleep(4000);
			  
			  srin.keyPress(KeyEvent.VK_CONTROL); srin.keyPress(KeyEvent.VK_A);
			  srin.keyRelease(KeyEvent.VK_A); srin.keyRelease(KeyEvent.VK_CONTROL);
			  Thread.sleep(2000);
			  
			  srin.keyPress(KeyEvent.VK_CONTROL); srin.keyPress(KeyEvent.VK_C);
			  srin.keyRelease(KeyEvent.VK_C); srin.keyRelease(KeyEvent.VK_CONTROL);
			  Thread.sleep(2000);
			  
			  srin.keyPress(KeyEvent.VK_CONTROL); srin.keyPress(KeyEvent.VK_N);
			  srin.keyRelease(KeyEvent.VK_N); srin.keyRelease(KeyEvent.VK_CONTROL);
			  Thread.sleep(2000);
			  
			  srin.keyPress(KeyEvent.VK_CONTROL); srin.keyPress(KeyEvent.VK_V);
			  srin.keyRelease(KeyEvent.VK_V); srin.keyRelease(KeyEvent.VK_CONTROL);
			  Thread.sleep(2000);
			  
			  
			  srin.keyPress(KeyEvent.VK_ALT);
			  
			  srin.keyPress(KeyEvent.VK_TAB);
			  
			  srin.keyRelease(KeyEvent.VK_TAB);
			  
			  srin.keyRelease(KeyEvent.VK_ALT);
			  
			  Thread.sleep(2000);
			  
			  srin.keyPress(KeyEvent.VK_A);
			  
			  srin.keyRelease(KeyEvent.VK_A);
			  
			  
			  
			  srin.keyPress(KeyEvent.VK_ENTER); srin.keyRelease(KeyEvent.VK_ENTER);
			  Thread.sleep(1000);
			  
			  srin.keyPress(KeyEvent.VK_B);
			  
			  srin.keyRelease(KeyEvent.VK_B); srin.keyPress(KeyEvent.VK_ENTER);
			  srin.keyRelease(KeyEvent.VK_ENTER); Thread.sleep(1000);
			  
			  srin.keyPress(KeyEvent.VK_C);
			  
			  srin.keyRelease(KeyEvent.VK_C);
			  
			 
			
			
			
			
		}


	}


