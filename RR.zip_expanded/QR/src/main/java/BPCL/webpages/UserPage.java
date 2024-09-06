package BPCL.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UserPage {

	WebDriver driver;

	public UserPage(WebDriver driver) {
		this.driver = driver;
	}

	By addUser = By.cssSelector("[title='Add User']");

	By locType = By.cssSelector(".row select#loc_type");

	By locName = By.cssSelector("select#loc_name");

	By roleName = By.cssSelector("select#role");

	By firstName = By.cssSelector("input#first_name");

	By middleName = By.cssSelector("input#middle_name");

	By lastName = By.cssSelector("input#last_name");

	By password = By.cssSelector("input#pwd");

	By confirmPassword = By.cssSelector("input#confirmpassword");

	By emailId = By.cssSelector("input#email_id");

	By mobileNo = By.cssSelector("input#mobile_no");

	By phoneNo = By.cssSelector("input#phone_no");

	By status = By.cssSelector("#select2-type-container");

	By saveBtn = By.cssSelector("[type='submit']");

	By desc = By.cssSelector(".sorting_asc");
	By getLastUserName = By.cssSelector("tbody tr:nth-child(1) td:nth-child(3)");

	// actions

	public void clickOnAddUser() {
		driver.findElement(addUser).click();
	}

	public void enterFirstName(String fname) {
		driver.findElement(firstName).sendKeys(fname);
	}

	public void enterMiddleName(String mname) {
		driver.findElement(middleName).sendKeys(mname);
	}

	public void enterLastName(String lname) {
		driver.findElement(lastName).sendKeys(lname);
	}

	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void enterConfirmPassword(String conpass) {
		driver.findElement(confirmPassword).sendKeys(conpass);
	}

	public void enterEmailId(String email) {
		driver.findElement(emailId).sendKeys(email);
	}

	public void enterMobileNo(String mobile) {
		driver.findElement(mobileNo).sendKeys(mobile);
	}

	public void enterPhoneNo(String phoneNo) {
		driver.findElement(this.phoneNo).sendKeys(phoneNo);
	}

	public void clickOnDesc() {
		driver.findElement(desc).click();
		;
	}

	public void printLastUserName() throws Exception {
		Thread.sleep(1000);;
		System.out.println(driver.findElement(getLastUserName).getText());
	}

	public void selectLocationType(String locType) throws Exception {

		// selectDropdown(this.locType, locType);

		driver.findElement(By.cssSelector("#select2-loc_type-container")).click();
		driver.findElement(By.xpath("//li[text()='" + locType + "']")).click();

	}

	public void selectLocationName(String locName) throws Exception {

		// selectDropdown(this.locName, locName);
		driver.findElement(By.cssSelector("#select2-loc_name-container")).click();
		driver.findElement(By.xpath("//li[text()='" + locName + "']")).click();
	}

	public void selectRoleName(String role) throws Exception {

		// selectDropdown(roleName, role);
		driver.findElement(By.cssSelector("#select2-role-container")).click();
		driver.findElement(By.xpath("//li[text()='" + role + "']")).click();
	}

	public void selectStatus(String status) throws Exception {

		selectDropdown(this.status, status);
	}

	public void selectDropdown(By locator, String option) throws Exception {
		Thread.sleep(2000);
		Select select = new Select(driver.findElement(locator));
		select.selectByVisibleText(option);
	}

	public void clickOnSave() {
		driver.findElement(this.saveBtn).click();
	}

}
