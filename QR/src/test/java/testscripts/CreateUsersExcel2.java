package testscripts;

import java.awt.Point;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BPCL.webpages.DashboardPage;
import BPCL.webpages.LoginPage;
import BPCL.webpages.MasterData;
import BPCL.webpages.UserPage;
import utilities.readExcelData;

public class CreateUsersExcel2 {

    WebDriver driver;
    LoginPage page;
    DashboardPage dashboard;
    MasterData masterdata;
    UserPage user;
    String module = "Master Data";

    @Test
    public void setup() throws Exception {
        String excelName = "useruuu";
        String sheetName = "update";
        readExcelData.loadExcel(excelName, sheetName);
        int lastrow = readExcelData.lastRow();

        for (int rowNo = 1; rowNo <= lastrow; rowNo++) {

            String[] collector = readExcelData.trythis(excelName, sheetName, rowNo);
            String username = collector[0], passwordd = collector[1];

            String password = "Test@123";

            driver = BasePa.intializeWebDriver();
            page = new LoginPage(driver);

            page.enterUname(username);
            page.enterPass(password);
            dashboard = page.clickOnSignBtn();
            Thread.sleep(1000);

            
            try {
            if (driver.findElement(By.xpath("//p[text()='The verification code is incorrect.']")).isDisplayed()) {
                {
                    System.out.println(driver.findElement(By.xpath("//p[text()='The verification code is incorrect.']"))
                            .isDisplayed());
                    driver.findElement(By.cssSelector("i#refresh-captcha")).click();

                }
            }
            }
            catch(Exception e) {
            	System.out.println("MNOOO");
            }

            Thread.sleep(2000);
            System.out.println(driver.getCurrentUrl());
            try {

                System.out.println("In Try Catch");
                if (driver.getCurrentUrl().contains("site/login")) {
                    System.out.println("In If block");
                    // Thread.sleep(1500);
                    driver.navigate().to("https://test.lubesqr.bpcl.in/central/site/dashboard");
                    
                    System.out.println("Done Refresh");
                }

            }

            catch (Exception e) {
                System.out.println("Contact Adminstrator not showing");
            }
   

            Thread.sleep(3000);
          
            driver.findElement(By.xpath("//a[text()='Change Password']")).click();
            Thread.sleep(2500);
            driver.findElement(By.cssSelector("input#old-password")).sendKeys("Test@123");
            driver.findElement(By.cssSelector("input#password")).sendKeys(passwordd);
            driver.findElement(By.cssSelector("input#confirmpassword")).sendKeys(passwordd);

            driver.findElement(By.xpath("//button[text()='Change Password']")).click();
            Thread.sleep(2000);
            driver.close();

        }

    }

}
