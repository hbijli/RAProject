/***************************************************
 * RAPage.java
 * Daddy class for the Page Objects
 * 
 * What generic operations would you do on the page.
 * Define implementation methods for them here.
 * 
 **************************************************/
/**********************************
 * Methods:
 * WebElement getElement()  --> retrieve web element
 * void verifyElementPresent()
 * boolean isElementPresent()
 * void type(elmLocator, value) --> type using keyboard
 * void verifyAndClick (elmLocator)
 * void selectDropDownByVisibleText(elmLocator, value)
 * void selectDropDownByValue(elmLocator, value)
 * void verifyElementSelected(elmLocator)
 * void verifyElementEnabled(elmLocator)
 * void verifyTextPresent(elmLocator, value)
 * void checkCheckBoxElement(elmLocator)
 * 
 * 
 *********************************/
package com.ra.framework;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.*;

public class RAPage {
	
	Logger logger = Logger.getLogger(RAPage.class);
	
	protected WebDriver driver;
	
	//Constructor
	public RAPage (WebDriver driver) {
		this.driver = driver;
		
	}
		
	public WebElement getElement(By elmLocator) {
		
		try {
			return driver.findElement(elmLocator);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
			
	}
	
	public boolean isElementPresent(By elmLocator) {
		
		if (getElement(elmLocator) != null)
			return true;
		else
			return false;
	}
	
	
	public void type (By elmLocator, String value) {
		WebElement elm = getElement(elmLocator);	
		assertNotNull(elm);
		elm.sendKeys(value);
	}
	
	public void verifyAndClick (By elmLocator) {
		WebElement elm = getElement(elmLocator);
		assertNotNull(elm);
		elm.click();		
	}
	
	public void selectDropDownByVisibleText(By elmLocator, String value) {
		WebElement elm = getElement(elmLocator);
		assertNotNull(elm);
		
		Select select = new Select (elm);
		select.selectByVisibleText(value);
		
	}
	
	public void selectDropDownByValue (By elmLocator, String value) {
		WebElement elm = getElement(elmLocator);
		assertNotNull(elm);
		
		Select select = new Select (elm);
		select.selectByValue(value);
	}
	
	public void selectDropDownByIndex (By elmLocator, int index) {
		WebElement elm = getElement(elmLocator);
		assertNotNull(elm);
		
		Select select = new Select (elm);
		select.selectByIndex(index);
	}
	
	public void verifyElementSelected (By elmLocator) {
		WebElement elm = getElement (elmLocator);
		assertNotNull(elm);
		assertTrue(elm.isSelected());
	}
	
	public void verifyElementEnabled (By elmLocator) {
		WebElement elm = getElement (elmLocator);
		assertNotNull(elm);
		assertTrue(elm.isEnabled());
	}
	
	public void verifyElementDisplayed (By elmLocator) {
		WebElement elm = getElement (elmLocator);
		assertNotNull(elm);
		assertTrue(elm.isDisplayed());
	}
	
	public void verifyTextPresent (By elmLocator, String text) {
		WebElement elm = getElement (elmLocator);
		assertNotNull(elm);
		String actualText = elm.getText();
		assertEquals(actualText, text);
	}
	
	void checkCheckBoxElement(By elmLocator) {
		WebElement elm = getElement (elmLocator);
		assertNotNull(elm);
		
		verifyAndClick(elmLocator);
		assertTrue(elm.isSelected());
		 
	 }

}
