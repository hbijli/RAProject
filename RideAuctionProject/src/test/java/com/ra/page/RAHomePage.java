/***************************************************
 * RAHomePage.java
 * Page Objects class for RA Homepage
 * 
 * 
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
package com.ra.page;

import org.openqa.selenium.WebDriver;

import com.ra.framework.RAPage;

public class RAHomePage extends RAPage {

	public RAHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void verifyPageElements() {
		// TODO Auto-generated method stub
		
	}
	
	

}
