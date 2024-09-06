package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BPCL.webpages.BottlingWMS;
import BPCL.webpages.BudgetVSAmountOfCouponGenerated;
import BPCL.webpages.CarryForwadedCoupons;
import BPCL.webpages.CashCouponReport;
import BPCL.webpages.CouponAbstractReport;
import BPCL.webpages.CouponBudget;
import BPCL.webpages.CouponBudgetReport;
import BPCL.webpages.CouponDataPage;
import BPCL.webpages.DashboardModulesPage;
import BPCL.webpages.DashboardPage;
import BPCL.webpages.FinancialYear;
import BPCL.webpages.LoginPage;
import BPCL.webpages.MasterData;
import BPCL.webpages.ProductwiseBudgetUtilizationReport;
import BPCL.webpages.ProductwiseDenominationReport;
import utilities.readExcelData;

public class PrintMIS {

	WebDriver driver;
	LoginPage page;
	DashboardPage dashboard;
	MasterData masterdata;
	String module = "MIS Reports";
	FinancialYear fin;
	DashboardModulesPage dah;
	CouponDataPage coupondata;
	CouponBudgetReport couponBudget;
	ProductwiseBudgetUtilizationReport	productwiseBudget;
	ProductwiseDenominationReport			productwiseDenomina;
	BudgetVSAmountOfCouponGenerated	budgetVSAmount;
	CashCouponReport cashCoupon;
	CouponAbstractReport couponAbstract;
	CarryForwadedCoupons carryforwarded	;
	@BeforeMethod
	public void setup() throws Exception {
		String username = "SUBBUDISP";
		String password = "Admin@123";

		driver = BasePa.intializeWebDriver();
		page = new LoginPage(driver);
		page.enterUname(username);
		page.enterPass(password);
		dashboard = page.clickOnSignBtn();
		
		
		

	}

	@Test
	public void addUser() throws Exception {
		
		String year="2022-2023";
		String budget="150000";
		String mobth="April 2023";
		String date="25";
		String remarks="abc";
		//String path="sample1.pdf";
		
		String path="F:\\Subbu\\SELENIUM\\QR\\resources\\files\\sample1.pdf";

		dashboard.clickOnDashboardList(module);
		dah =new DashboardModulesPage(driver);
		dah.mousehoverOnModule(module);
		coupondata=dah.couponDataReport();
		coupondata.downloadCouponData();
		dah.mousehoverOnModule(module);
		couponBudget=dah.couponBudgetReport();
		couponBudget.downloadCouponBudgetReport();
		dah.mousehoverOnModule(module);
		productwiseBudget=dah.ProductwiseBudgetUtilizationReport();
		productwiseBudget.downloadProductwiseBudget();
		dah.mousehoverOnModule(module);
		productwiseDenomina=dah.ProductwiseDenominationReport();
		productwiseDenomina.downloadproductwiseDenomination();
		dah.mousehoverOnModule(module);
		budgetVSAmount=dah.BudgetVSAmountOfCouponGenerated();
		budgetVSAmount.downloadBudgetVSAmount();
		dah.mousehoverOnModule(module);
		cashCoupon=dah.CashCouponReport();
		cashCoupon.downloadCashCouponReport();
		dah.mousehoverOnModule(module);
		couponAbstract=dah.CouponAbstractReport();
		couponAbstract.downloadCouponAbstractReport();
		dah.mousehoverOnModule(module);
		carryforwarded=dah.couponTransferHistory();
		carryforwarded.downloadCarryForwardedCoupons();

		
		
		
}


}
