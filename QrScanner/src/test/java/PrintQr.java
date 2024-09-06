import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PrintQr {

	String url = "https://www.the-qrcode-generator.com";
	int wait=500;
	
	@Test
	public void intializeWebDriver() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amrutha\\3D Objects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		
		
		driver.get("https://www.the-qrcode-generator.com/");
		driver.manage().window().maximize();
		
		

		driver.findElement(By.cssSelector("[data-attr='txt-tab']")).click();
		
		By loc = By.xpath("//textarea[@id='outlined-multiline-static']");

		File path = new File(".\\src\\main\\resources\\QR.xlsx");

		InputStream lo = new FileInputStream(path);

		XSSFWorkbook book = new XSSFWorkbook(lo);	
		XSSFSheet sheet = book.getSheet("nam");
		int last = sheet.getLastRowNum();
		DataFormatter formatter = new DataFormatter();

		for (int i =0;i <last; i++) {
			
				for(int j=0; j<=1;j++) {
			String val = formatter.formatCellValue(sheet.getRow(i).getCell(j));
			
			System.out.println(val);
			
			WebElement text = driver.findElement(loc);
			text.sendKeys(val);
			Thread.sleep(wait);
			text.sendKeys(Keys.chord(Keys.DOWN.CONTROL, "a"));
			
			
			
			}
		}

	}

}
