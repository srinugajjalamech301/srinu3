

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SSS {

        static WebDriver driver;
        static String url = "http://183.82.106.234/Assam/central/index.php/site/login";
        static WebDriverWait wait;
        static Alert alert;

        public static WebDriver intializeWebDriver() {

                System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");

                driver = new ChromeDriver();
                driver.get(url);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

                return driver;

        }

        public static void main(String[] args) throws Exception {
                intializeWebDriver();
                wait = new WebDriverWait(driver, 300);
                JavascriptExecutor jjs = (JavascriptExecutor) driver;
                Robot r = new Robot();

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='LoginForm_username']")))
                                .sendKeys("MANUFACTURER");
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='LoginForm_password']")))
                                .sendKeys("Admin@123");

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='LoginForm_verifyCode']")))
                                .click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='LoginForm_verifyCode']"))).clear();
                Thread.sleep(500);
                String entercaptcha1 = JOptionPane.showInputDialog("Enter Captcha");
                driver.findElement(By.id("LoginForm_verifyCode")).sendKeys(entercaptcha1);

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='submitbutton']"))).click();
//            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Home')]")));
                driver.navigate().to("http://183.82.106.234/Assam/central/index.php/Manufacture/SH/packing_mfr");
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                                "/html/body/div[2]/div/div/div[3]/div[1]/div[2]/div/div[2]/div[6]/div/div[2]/table/tbody/tr[2]/td[7]/button")))
                                .click();
                
                driver.findElement(By.cssSelector("input#datepicker1")).click();
              driver.findElement(By.xpath("//td[text()='17']")).click();
              driver.findElement(By.cssSelector("[title='Search']")).click();
           
                
                wait.until(ExpectedConditions.alertIsPresent());
                alert.accept();
                By loc = By.xpath("//th[contains(text(),'Scan Spools for carton packing')]/../../..//input");
                File path = new File("F:\\tool.xlsx");

                InputStream lo = new FileInputStream(path);

                XSSFWorkbook book = new XSSFWorkbook(lo);
                XSSFSheet sheet = book.getSheet("code");
                int last = sheet.getLastRowNum();
                DataFormatter formatter = new DataFormatter();
                WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(
                                By.xpath("//th[contains(text(),'Scan Spools for carton packing')]/../../..//input")));

                for (int i = 0; i <= last; i++) {
                        String val = formatter.formatCellValue(sheet.getRow(i).getCell(0));
                        text.clear();
                        text.sendKeys(val);
                        System.out.println(val);
                        r.keyPress(KeyEvent.VK_TAB);
                        r.keyRelease(KeyEvent.VK_TAB);
                        System.out.println("I am Inserted");
                        Thread.sleep(1000);
                        try {
                                alert.accept();
                        }

                        catch (Exception e) {
                                i += 1;
                                String next = formatter.formatCellValue(sheet.getRow(i).getCell(0));
                                System.out.println(" next -->" + next);
                                text.clear();
                                text.sendKeys(next);
                                r.keyPress(KeyEvent.VK_TAB);
                                r.keyRelease(KeyEvent.VK_TAB);
                                System.out.println("catch block one was Inserted");
                                Thread.sleep(1000);
                                try {
                                        alert.accept();

                                } catch (Exception o) {
                                        System.out.println("not found");
                                }
                        }

                }

        }

}