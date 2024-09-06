package BPCL.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DailyProductionPage {

	
	

	WebDriver driver;
	public DailyProductionPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	//Web Elements
	
	
	By addDailyProd =By.cssSelector("[title='Add Production Plan']");
	By searchTxt=By.cssSelector("[type='search']");
	By searchBtn=By.cssSelector("[type='submit']");
	By showRows=By.cssSelector("[name='datatables_w1_length']");
	
	
	
	
	//Add
	By selectDate=By.cssSelector("[id$='production_schedule_date']");
	By selectLine=By.cssSelector("#select2-line_no-container");
	By selectProd=By.cssSelector("#select2-prod_code-container");
	By prodName=By.cssSelector("[name='ProductionLine[prod_name]']");
	By prodsize=By.cssSelector("[name='ProductionLine[prod_size]']");
	By packType=By.cssSelector("[name='ProductionLine[pack_type]']");
	By upc=By.cssSelector("[name='ProductionLine[upc]']");
	By productMatrix=By.cssSelector("ProductionLine[product_matrix]");
	By prodBatchNo=By.cssSelector("input#productionline-prod_batch_no");
	By purpose=By.cssSelector("[name='ProductionLine[purpose]']");
	By mrpBatch=By.cssSelector("[name='ProductionLine[mrp_batch]']");
	By mrp=By.cssSelector("ProductionLine[mrp]");
	By applyCoupon =By.cssSelector("input#apply_coupon");
	By labelQR=By.cssSelector("input#label_status");
	By productionOrder=By.cssSelector("[title='Select Production Order']");
	By QuantityCases=By.cssSelector("productionline-batch_qty");
	By submitBtn=By.cssSelector("button#save");
	
	
	
	
	

	
	
	

	
	
	
}
