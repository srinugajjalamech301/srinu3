import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class PrintQr2 {

	String url = "https://www.the-qrcode-generator.com";
	int wait=2000;
	
	@Test
	public void intializeWebDriver() throws Exception {
		WebDriver driver = null;
	    Workbook workbook = null;       
	    System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Robot r=new Robot();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    Thread.sleep(2000);
	    driver.get("http://183.82.106.234/Assam/central/index.php/site/login");
	    Thread.sleep(2000);
	    //Wait for page ready
	    WebDriverWait waited=new WebDriverWait(driver,300);
	    JavascriptExecutor jjs = (JavascriptExecutor) driver;
	    waited.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='LoginForm_username']"))).sendKeys("MANUFACTURER");
	    waited.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='LoginForm_password']"))).sendKeys("Admin@123");
	    
	    waited.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='LoginForm_verifyCode']"))).click();
	    waited.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='LoginForm_verifyCode']"))).clear();
	    Thread.sleep(500);
	    String entercaptcha1 = JOptionPane.showInputDialog("Enter Captcha");
	    driver.findElement(By.id("LoginForm_verifyCode")).sendKeys(entercaptcha1);
	    
	    waited.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='submitbutton']"))).click();
//	    //waited.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Home')]")));
	    driver.navigate().to("http://183.82.106.234/Assam/central/index.php/Manufacture/SH/packing_mfr");
	    waited.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div[3]/div[1]/div[2]/div/div[2]/div[6]/div/div[2]/table/tbody/tr[2]/td[7]/button"))).click();
	    
	    waited.until(ExpectedConditions.alertIsPresent());driver.switchTo().alert().accept();
	     By loc = By.xpath("//th[contains(text(),'Scan Spools for carton packing')]/../../..//input");
	    File path = new File(".\\src\\main\\resources\\tool.xlsx");
	    
	    InputStream lo = new FileInputStream(path);

	    XSSFWorkbook book = new XSSFWorkbook(lo);
	    XSSFSheet sheet = book.getSheet("code");
	    int last = sheet.getLastRowNum();
	    DataFormatter formatter = new DataFormatter();

	    for (int i =last-1;i>=0; i--) {
	        String val = formatter.formatCellValue(sheet.getRow(i).getCell(0));
	        Thread.sleep(1000);
	        WebElement text = driver.findElement(loc);
	       try { text.sendKeys(val);
	       Thread.sleep(500);
	       try {
	    		 
		       waited.until(ExpectedConditions.alertIsPresent());
		       }
		       catch(Exception e)
		        {
		       driver.switchTo().alert().accept();                  
		        }
	       
//	        System.out.println(val.trim().getBytes().length);
	        System.out.println(val);
	        r.keyPress(KeyEvent.VK_TAB);
	        r.keyRelease(KeyEvent.VK_TAB);
	       text.sendKeys(Keys.chord(Keys.DOWN.CONTROL, "a"));
	      
	       }
	        catch(Exception e)
	        {try {
	       	 
	 	    Thread.sleep(500);
	 	       }
	 	       catch(Exception l)
	 	        {
	 	       driver.switchTo().alert().accept();                  
	 	        }
	 	       }
	           
	        }
	       // waited.until(ExpectedConditions.alertIsPresent());driver.switchTo().alert().accept();
	        //text.sendKeys(Keys.chord(Keys.DOWN.CONTROL, "a"));
	    }


	
	}



