package BPCL.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CouponAllocationToLinePage {

	

	WebDriver driver;
	public CouponAllocationToLinePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	//Web Elements
	By addCouponAllocation =By.cssSelector("[title='Add Coupon Allocation to Lines']");
	By searchTxt =By.cssSelector("[type='search']");
	By searchBtn=By.cssSelector("[type='submit']");
	
	
	//add
	
	By selectLine =By.cssSelector("#select2-line_no-container");
	By lotNo=By.cssSelector("input#lot_no");
	By saveBtn=By.cssSelector("div.text-center.py-4");
	By lotQty=By.cssSelector("span#lot_num_count");
		By closeAddScreen=By.cssSelector("#cumodalHeader button span");
	
	
	
	
	
	
	
}
