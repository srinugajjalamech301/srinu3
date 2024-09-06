package webpages;

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
	By code= By.cssSelector("#txtEmpCode");
	
	By uname = By.cssSelector("#txtUserName");

	By pass = By.cssSelector("#txtPassword");

	By loginBtn = By.cssSelector("#btnLogin");
	


	// Methods

	public void enterUname(String uname) {

		driver.findElement(this.uname).sendKeys(Keys.chord(Keys.CONTROL,"a"),uname);

	}

	public void enterPass(String pass) {

		driver.findElement(this.pass).sendKeys(Keys.chord(Keys.CONTROL,"a"),pass);

	}
	
	public void enterEmpCode(String code) {

		driver.findElement(this.code).sendKeys(Keys.chord(Keys.CONTROL,"a"),code);

	}
					
	public LandingPage clickOnSignBtn() {
		
		
		driver.findElement(loginBtn).click();
			
		return new LandingPage(driver);
	}

}
