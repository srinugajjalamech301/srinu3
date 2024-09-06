package BPCL.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LabelAllocationToLinePage {

	

	WebDriver driver;
	public LabelAllocationToLinePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	//Web Elements
	By addCouponAllocation =By.cssSelector("[title='Add Label Allocation to Line']");
	By searchTxt =By.cssSelector("[type='search']");
	By searchBtn=By.cssSelector("[type='submit']");
	
	
	//add
	
	By selectLine =By.cssSelector("#select2-line_no-container");
	By lotNo=By.cssSelector("input#spool_barcode");
	By saveBtn=By.cssSelector("button[onclick='allocationlabel();']");
	By spoolAddQty=By.cssSelector("span#spool_num_count");
	
	
	By closeAddScreen=By.cssSelector("#cumodalHeader button span");
	
	
	
	
	
	
	
}
