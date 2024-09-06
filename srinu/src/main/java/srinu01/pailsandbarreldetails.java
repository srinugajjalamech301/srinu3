package srinu01;

import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class pailsandbarreldetails {
	
	
	WebDriver driver;

	@Test
	

	public  void pailsandbarreldetails01() throws Throwable {

		
		
		driver.findElement(By.xpath("//h5[text()='Pails & Barrels QR Printing']")).click();
		
        Thread.sleep(2000);

		

        //click on start date
        
        driver.findElement(By.cssSelector("#start_date")).click();
    //click on mobth and year
        
        driver.findElement(By.xpath("//th[@class='datepicker-switch' and @colspan='5']")).click();
        
                String ActualYear="2023";
        
        
        
        
        while(true)
        {
            WebElement yeare =driver.findElement(By.cssSelector(".datepicker-months .datepicker-switch"));
            String year=yeare.getText();
            System.out.println(year);
                
            boolean corre=year.contains(ActualYear);
            System.out.println(corre);
            
        if(!corre) {
        
            driver.findElement(By.cssSelector(".datepicker-months .prev")).click();
            yeare.getText();
        }
        else {
            break;
        }
        
    
        }
        
        Thread.sleep(5000);
List <WebElement>    gg=    driver.findElements(By.cssSelector(".month"));


String month="Mar";
for(WebElement g:gg) {
    if(g.getText().contentEquals(month))
    {
        g.click();
        System.out.println("month clicked");
    }
    break;
}

String day="20";
List <WebElement>    days=    driver.findElements(By.cssSelector("[class='day']"));
for(WebElement g:days) {
    if(g.getText().contentEquals(day))
    {
        g.click();
    }
    break;
}


Thread.sleep(5000);
		
		
		
		
		
		
		
		
	}

}
