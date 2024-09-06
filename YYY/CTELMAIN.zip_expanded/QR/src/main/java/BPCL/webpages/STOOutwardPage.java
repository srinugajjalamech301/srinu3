package BPCL.webpages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import javax.lang.model.element.Element;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.awt.Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;
import java.awt.*;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class STOOutwardPage {

	WebDriver driver;

	public STOOutwardPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElements

	By search = By.cssSelector("[type='search']");

	By starDate = By.cssSelector("#start_date");

	By endDate = By.cssSelector("#end_date");

	By selectStatus = By.cssSelector("#select2-deliverynote-types-container");

	By show = By.cssSelector("[name='datatables_w1_length']");

	By pageTitle = By.cssSelector(".page-title");

	By prevDate = By.cssSelector(".datepicker-days th.prev");

	By month = By.cssSelector(".datepicker-days th[colspan='5']");

	By day = By.cssSelector(".table-condensed tbody tr td[class='day']");

	By searchButton = By.cssSelector("button[type='submit']");
	By statusOptions = By.cssSelector(".select2-results__options li");

	By orderno = By.cssSelector("tbody tr td:nth-child(3)");

	By stockType = By.cssSelector("th[aria-label^='Stock ']");

	By pickListPrint = By.cssSelector("[title='Pick List Print']");

	By pickListOrderNo = By.xpath("//p[text()='Order number/Date']/../p[2]");
	By shipmentNo = By.xpath("//p[text()='Shipment Number/Date']/../p[2]");

	By DispatchPrint = By.cssSelector("[title='Dispatch Note']");
	By orderNOO = By.xpath("//a[@title='Pick List Print'] /parent :: td/parent :: tr/td[4]");
	By printLabel = By.xpath("//h2[text()='Lubes QR Code Solution']");

	
	
	
	
	
	// Methods

	public void enterDataSearch(String searchData) {

		driver.findElement(search).sendKeys(searchData);

	}

	public void selectStartDate(String mon, String datt) throws Exception {
		driver.findElement(starDate).click();
		String monthm;

		while (true) {
			monthm = driver.findElement(month).getText();
			if (monthm.equalsIgnoreCase(mon)) {

				break;
			}
			driver.findElement(prevDate).click();
		}
		java.util.List<WebElement> dd = driver.findElements(day);

		for (WebElement d : dd) {

			if (d.getText().contentEquals(datt)) {
				d.click();
				break;
			}

		}

	}

	public void selectEndDate(String mon, String datt) {
		driver.findElement(endDate).click();
		String monthm;
		while (true) {
			monthm = driver.findElement(month).getText();
			if (monthm.equalsIgnoreCase(mon)) {

				break;
			}
			driver.findElement(prevDate).click();
		}
		java.util.List<WebElement> dd = driver.findElements(day);

		for (WebElement d : dd) {

			if (d.getText().contentEquals(datt)) {
				d.click();
				break;
			}

		}
	}

	public void searchBtn() {
		driver.findElement(searchButton).click();
	}

	public void selectStatus(String status) {
		driver.findElement(selectStatus).click();
		java.util.List<WebElement> opti = driver.findElements(statusOptions);
		for (WebElement op : opti) {
			if (op.getText().contains(status)) {
				op.click();
				break;
			}

		}

	}

	public void stockTypeSort() {
		driver.findElement(stockType).click();

	}

	public void pickListPrint() throws Exception {
		String mainwindow = driver.getWindowHandle();
		java.util.List<WebElement> QWE = driver.findElements(pickListPrint);
		for (WebElement qe : QWE) {
			driver.switchTo().window(mainwindow);
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].scrollIntoView();", qe);
			qe.click();

			Thread.sleep(1000);

			ArrayList<String> uv = new ArrayList<String>(driver.getWindowHandles());
			for (int i = 0; i < uv.size(); i++)
				// Switch to 2nd window/tab and close
				driver.switchTo().window(uv.get(1));

			String OrderNo = driver.findElement(pickListOrderNo).getText();
			String[] AAA = OrderNo.split("/");

			StringSelection x = new StringSelection(AAA[0]);
			System.out.println(AAA[0]);
			Robot r = new Robot();

			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
			// Send clip-board data to window

			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_P);
			r.keyRelease(KeyEvent.VK_P);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);

			driver.close();
		}
	}

	public void dispatchPrint() throws Exception {
		String mainwindow = driver.getWindowHandle();
		java.util.List<WebElement> QWE = driver.findElements(DispatchPrint);
		for (WebElement qe : QWE) {
			driver.switchTo().window(mainwindow);
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].scrollIntoView();", qe);
			qe.click();

			Thread.sleep(1000);

			ArrayList<String> uv = new ArrayList<String>(driver.getWindowHandles());
			for (int i = 0; i < uv.size(); i++)
				// Switch to 2nd window/tab and close
				driver.switchTo().window(uv.get(1));

			String shipmentNor = driver.findElement(shipmentNo).getText();
			String[] AAA = shipmentNor.split("/");

			StringSelection x = new StringSelection(AAA[0]);
			System.out.println(AAA[0]);
			Robot r = new Robot();

			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
			// Send clip-board data to window

			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_P);
			r.keyRelease(KeyEvent.VK_P);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);

			driver.close();
		}
	}

	public void selectRows(String rows) {
		Select select = new Select(driver.findElement(show));
		select.selectByVisibleText(rows);

	}

}
