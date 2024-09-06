package BPCL.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HardwareEuipment {
	WebDriver driver;

	public HardwareEuipment(WebDriver driver) {
		this.driver=driver;
		
	}

	///WebElements------------------
	
	
	
	
By locType =By.cssSelector("select#loc_type_id");
By loction =By.cssSelector("select#loc_type");
By equipment =By.cssSelector("select#equipment_type");
By laserMachine =By.cssSelector("select#laser_type");
By brandOEM =By.cssSelector("select#brand_oem_name");
By modelNo=By.cssSelector("input#hwequipments-model_no");
By serialNo=By.cssSelector("input#hwequipments-serial_no");
By mac =By.cssSelector("input#mac_id");
By ipAddress=By.cssSelector("input#ip_add");
By port =By.cssSelector("input#port_no");
By saveButton =By.cssSelector("#hardware_equipment");



public void selectDropdown(By locator, String option) {

	Select select = new Select(driver.findElement(locator));
	select.selectByVisibleText(option);
}

public void selectLocType(String locType) {
	selectDropdown(this.locType, locType);
}
public void selectLocation(String location) {
	selectDropdown(this.loction, location);
}
public void selectEquipment(String equipment) {
	selectDropdown(this.equipment, equipment);
}
public void selectLaser(String laser) {
	selectDropdown(this.laserMachine, laser);
}
public void selectBrandOem(String brandOEM) {
	selectDropdown(this.brandOEM, brandOEM);
}	

public void enterModelNo(String modelNO) {
	driver.findElement(this.modelNo).sendKeys(modelNO);
}
public void enterSerialNO(String serialNO) {
	driver.findElement(this.serialNo).sendKeys(serialNO);
}

public void enterMAC(String mac) {
	driver.findElement(this.mac).sendKeys(mac);
}
public void enterIpAddress(String ip) {
	driver.findElement(this.ipAddress).sendKeys(ip);
}	
public void enterPortNO(String port) {
	driver.findElement(this.port).sendKeys(port);
}
public void clickOnSaveButton() {
	driver.findElement(this.saveButton).click();
}




}
