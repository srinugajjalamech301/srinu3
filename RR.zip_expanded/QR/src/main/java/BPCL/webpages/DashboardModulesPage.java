package BPCL.webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DashboardModulesPage {

	WebDriver driver;

	public DashboardModulesPage(WebDriver driver) {
		this.driver = driver;
	}

	By topModules = By.cssSelector("li[class^='nav__item']");
	
	
	By user=By.xpath("//a[text()='User']");
	
	By couponData=By.xpath("//a[text()='Coupon Data']");
	
	By couponBudgetReport=By.xpath("//a[text()='Coupon Budget Report']");
By ProductwiseBudgetUtilizationReport =By.xpath("//a[text()='Productwise Budget Utilization Report']");

By ProductwiseDenominationReport =By.xpath("//a[text()='Productwise Denomination Report']");




By BudgetVSAmountOfCouponGenerated =By.xpath("//a[text()='Budget VS Amount Of Coupon Generated']");
By CashCouponReport =By.xpath("//a[text()='Cash Coupon Report']");
By CouponAbstractReport=By.xpath("//a[text()='Coupon Abstract Report']");

 By  couponTransferHistory =By.xpath("//a[text()='Coupon Transfer History']");

	// actions

	public void mousehoverOnModule(String element) {

		Actions Act = new Actions(driver);
		List<WebElement> mods = driver.findElements(topModules);
		for (WebElement mod : mods) {
			if (mod.getText().contains(element)) {
				Act.moveToElement(mod).perform();
			}
		}

	}
	
	
	
	public UserPage clickOnUser() {
		driver.findElement(user).click();
		return new UserPage(driver);
	}
	
	public CouponDataPage couponDataReport() {
		driver.findElement(couponData).click();
		return new CouponDataPage(driver);
	}
	
	public CouponBudgetReport couponBudgetReport() {
		driver.findElement(couponBudgetReport).click();
		return new CouponBudgetReport(driver);
	}

	public ProductwiseBudgetUtilizationReport ProductwiseBudgetUtilizationReport() {
		driver.findElement(ProductwiseBudgetUtilizationReport).click();
		return new ProductwiseBudgetUtilizationReport(driver);
	}
	public ProductwiseDenominationReport ProductwiseDenominationReport() {
		driver.findElement(ProductwiseDenominationReport).click();
		return new ProductwiseDenominationReport(driver);
	}
	
	public BudgetVSAmountOfCouponGenerated BudgetVSAmountOfCouponGenerated() {
		driver.findElement(BudgetVSAmountOfCouponGenerated).click();
		return new BudgetVSAmountOfCouponGenerated(driver);
	}
	public CashCouponReport CashCouponReport() {
		driver.findElement(CashCouponReport).click();
		return new CashCouponReport(driver);
	}



	public CouponAbstractReport CouponAbstractReport() {
		// TODO Auto-generated method stub
		driver.findElement(CouponAbstractReport).click();

		return new CouponAbstractReport(driver);
	}
	
	public CarryForwadedCoupons couponTransferHistory() {
		// TODO Auto-generated method stub
		driver.findElement(couponTransferHistory).click();

		return new CarryForwadedCoupons(driver);
	}
}
