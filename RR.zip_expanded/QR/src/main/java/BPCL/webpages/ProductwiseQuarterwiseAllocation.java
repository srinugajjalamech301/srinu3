package BPCL.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductwiseQuarterwiseAllocation {

	WebDriver driver;



	public ProductwiseQuarterwiseAllocation(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;

	}
	
	String prod="7215153";
	String statu="New";
	
	By addProductwise= By.cssSelector("button#prodallocate");
	
	By selectFin = By.cssSelector("span[title='Financial Year']");
	By selectQuarter = By.cssSelector("span[title='Select Quarter']");
	
	By valueAllocatedPerce=By.cssSelector("input[id='"+prod+"']");
	By valueAllocatedRupee=By.cssSelector("input[id='amt_"+prod+"']");
	By status=By.cssSelector("//button[text()=' "+statu+" ']"); 	
	
	
	By remarks=By.cssSelector("textarea#remark");
	
	
	By finalPrint=By.cssSelector("[title='Final print']");
	By view = By.cssSelector("button#valueDetail");
	
	
	By viewRemarks=By.cssSelector("button#Remarks");
	
	
	
	

}
