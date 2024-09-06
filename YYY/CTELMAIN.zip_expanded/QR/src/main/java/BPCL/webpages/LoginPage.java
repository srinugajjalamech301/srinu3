package BPCL.webpages;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	

   //WebElements 
	
	
	By uname = By.cssSelector("[id='loginform-username']");

	By pass = By.cssSelector("[id='loginform-password']");

	By signInBtn = By.cssSelector("[type='submit']");
	
	By captcha = By.id("loginform-captcha");
	

	// Methods

	public void enterUname(String uname) {

		driver.findElement(this.uname).sendKeys(uname);

	}

	public void enterPass(String pass) {

		driver.findElement(this.pass).sendKeys(pass);

	}
					
	public DashboardPage clickOnSignBtn() {
		String captcha14	= JOptionPane.showInputDialog("Enter Captcha");
		driver.findElement(captcha).sendKeys(captcha14);
		driver.findElement(signInBtn).click();
			
		return new DashboardPage(driver);
	}

}
