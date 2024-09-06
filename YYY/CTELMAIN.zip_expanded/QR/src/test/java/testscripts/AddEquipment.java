package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BPCL.webpages.DashboardModulesPage;
import BPCL.webpages.DashboardPage;
import BPCL.webpages.HardwareEuipment;
import BPCL.webpages.LoginPage;
import BPCL.webpages.MasterData;
import BPCL.webpages.UserPage;

public class AddEquipment {
	
	WebDriver driver;
	LoginPage page;
	DashboardPage dashboard;
	DashboardModulesPage dashboardModule;
	MasterData masterdata;
	UserPage user;
	HardwareEuipment hardwareEquipment;
	String module ="Master Data";
	
	
	
	@BeforeTest
	public void setup() throws Exception {
		String username = "CTELSUPPORT";
		String password = "Admin@123";
		
		driver = BasePa.intializeWebDriver();
		page = new LoginPage(driver);
		
		System.out.println("HII");
		Robot  cc=new Robot();
		
		
		page.enterUname(username);
		page.enterPass(password);
		Thread.sleep(7000);
		dashboard = page.clickOnSignBtn();
		dashboard.clickOnDashboardList(module);
		masterdata =new MasterData(driver);
		
		
	}
@Test
public void addUser() throws Exception {
	
	
	
	String locType="Bottling Unit",location="Wadilube Installation",equipment="LASER MACHINE",laser="Coupon",brandOEM="",modelNO="",
			serialNO="",mac="",ip="",port="";
	
	dashboardModule=new DashboardModulesPage(driver);
	dashboardModule.mousehoverOnModule(module);
	hardwareEquipment	=masterdata.clickOnAddHardwareEquipment();
	hardwareEquipment.selectLocType(locType);
	hardwareEquipment.selectLocation(location);
	hardwareEquipment.selectEquipment(equipment);
	if(equipment.contains("MACHINE")) {
		hardwareEquipment.selectLaser(laser);
	}
	hardwareEquipment.selectBrandOem(brandOEM);
	hardwareEquipment.enterModelNo(modelNO);
	hardwareEquipment.enterSerialNO(serialNO);
	if(equipment.contains("SYSTEM")){
	String macp="123",ipp="456";
				system(macp, ipp);
	}
	
	else if(equipment.contains("PRINTER")){
		String portt="321",ipp="436";
		printer(ipp, portt);
	}
	
	
}	
	
	public void system(String mac,String Ip) {
		hardwareEquipment.enterMAC(mac);
		hardwareEquipment.enterIpAddress(Ip);
		
	}
	public void printer(String Ip,String port) {
		hardwareEquipment.enterIpAddress(Ip);
		hardwareEquipment.enterPortNO(port);
		
	}
	
	
	public void teardown() {
		
	}
	
	

}
