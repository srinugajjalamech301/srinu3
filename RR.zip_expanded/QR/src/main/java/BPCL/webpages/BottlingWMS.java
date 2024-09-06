package BPCL.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BottlingWMS {
	
	
	
	
	WebDriver driver;
	String stoutward="Stock Transfer Order – Outward";
	String stoInward="Stock Transfer Order - Inward";
	

	public BottlingWMS(WebDriver driver) {
		this.driver = driver;

	}

	// WebElements*********************************
	
	By stoOutward=By.xpath("//a[text()='"+stoutward+"']");
	By postPickList=By.xpath("//a[text()='Post Pick List Data To SAP']");
	
	
	By addHardwareEquipment=By.xpath("//button[@title='Add Hardware Equipment Master']");

	/*public UserPage clickOnAddUser() {
		driver.findElement(addUser).click();
		return new UserPage(driver);
	}*/
	public STOOutwardPage stoOutward() {
		driver.findElement(stoOutward).click();
		return new STOOutwardPage(driver);
	}
	public HardwareEuipment clickOnAddHardwareEquipment() {
		driver.findElement(addHardwareEquipment).click();
		return new HardwareEuipment(driver);
	}

}



