package BPCL.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MasterData {

	WebDriver driver;

	public MasterData(WebDriver driver) {
		this.driver = driver;

	}

	// WebElements*********************************
	By addUser = By.xpath("//button[@title='Add User']");
	
	By hardwareEquipment=By.xpath("//a[text()='Hardware Equipment Master']");
	By addHardwareEquipment=By.xpath("//button[@title='Add Hardware Equipment Master']");

	public UserPage clickOnAddUser() {
		driver.findElement(addUser).click();
		return new UserPage(driver);
	}
	public void clickOnHardwareEquipment() {
		driver.findElement(hardwareEquipment).click();
	}
	public HardwareEuipment clickOnAddHardwareEquipment() {
		driver.findElement(addHardwareEquipment).click();
		return new HardwareEuipment(driver);
	}

}
