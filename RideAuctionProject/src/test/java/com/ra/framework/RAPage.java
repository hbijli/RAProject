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
import org.openqa.selenium.WebDriver;

public class RAPage {
	
	Logger logger = Logger.getLogger(RAPage.class);
	
	protected WebDriver driver;
	
	//Constructor
	public RAPage (WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	
	

}
