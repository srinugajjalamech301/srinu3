package pages;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	@Test
	public void loginData() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\automachine\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://10.10.10.193/BPCL/central/site/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("loginform-username")).sendKeys("Vikram");
		driver.findElement(By.id("loginform-password")).sendKeys("Admin@123");
		driver.findElement(By.id("loginform-captcha")).click();
		Thread.sleep(8000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(3000);

		try {
			System.out.println(driver.getCurrentUrl());
			if (driver.getCurrentUrl().contains("site/login")) {
				driver.navigate().to("http://10.10.10.193/BPCL/central/site/dashboard");
				System.out.println(driver.getCurrentUrl());
			}
		} catch (Exception e) {
			System.out.println("No Contact Admin");
		}

		Thread.sleep(2000);

		String ticket = "Spool transfer";
		driver.findElement(By.xpath("//h5[text()='Support']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".cumodalbutton")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#select2-ticket_type-container")).click();

		List<WebElement> names = driver.findElements(By.cssSelector("#select2-ticket_type-results li"));

		for (WebElement name : names)

		{
			String act = name.getText();
			System.out.println(act);
			if (act.contentEquals(ticket)) {
				name.click();
				break;
			}

		}

		/*
		 * WebElement qElement =
		 * driver.findElement(By.cssSelector("#select2-ticket_type-container")); Select
		 * d =new Select(qElement); d.selectByVisibleText("Spool transfer");
		 */

		/*
		 * List<WebElement> supplNames =
		 * driver.findElements(By.cssSelector("#select2-ticket_type-container"));
		 * 
		 * String name = "Spool transfer";
		 * 
		 * for (WebElement suu : supplNames) {
		 * 
		 * if (suu.getText().contains(name)) { suu.click(); break; } }
		 * 
		 */
		/*
		 * Thread.sleep(2000);
		 * driver.findElement(By.id("select2-issue_priority-container")).click();
		 * 
		 * 
		 * List <WebElement> qElement =
		 * driver.findElement(By.id("select2-issue_priority-container")); Select d =new
		 * Select(qElement); d.selectByVisibleText("Critical");
		 */
		
		  // Locate the dropdown element using its HTML attribute (change as needed)
          WebElement dropdown = driver.findElement(By.id("select2-issue_priority-container"));

		  // Create a Select object for the dropdown
          Select select = new Select(dropdown);

          // Your condition to select a specific option (replace with your actual condition)
          String condition = "Critical";

          // Loop through each option in the dropdown and select the one that meets the condition
          for (WebElement option : select.getOptions()) {
              if (option.getText().equals(condition)) {
                  // Select the option
                  select.selectByVisibleText(condition);
                  // You can add additional logic after selecting the option if needed
                  Thread.sleep(2000); // Example: Wait for 2 seconds after selecting the option
                  break; // Exit the loop after selecting the option
              }
          }
  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		
		

	}

}
