/****************************************************************************
 * WebDriverTest.java
 * Daddy class for all the tests.
 * Here the setup methods that need to run before the test cases are defined.
 * 
 ***************************************************************************/
/************************************************************
 * Methods:
 * runBeforeEachMethod()
 * runAfterEachMethod()
 * takeScreenshotOnFailure()
 * 
 ***********************************************************/

package com.ra.framework;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

import static org.testng.Assert.*;


public class WebDriverTest {
	
	protected WebDriver driver;

	Logger logger = Logger.getLogger(WebDriverTest.class);
	
	@BeforeMethod (alwaysRun=true)
	public void runBeforeEachMethod() {
		
		logger.debug("Starting new test case.");	
		driver = WebDriverManager.getWebDriver();
	}
	
	@AfterMethod (alwaysRun=true)
	public void takeScreenshotOnFailure(ITestResult result) {
		
		logger.debug("Screenshot on failure."+result.getName());
		
		if (!result.isSuccess()) {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			String fileName = PropertyManager.getProperty("screen_shot_dir")+result.getName()+formatter.format(calendar.getTime()+".png");
			
			File screenshotToBeCopied = new File(fileName);
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshotFile,screenshotToBeCopied);
			} catch (IOException e) {
				
				e.printStackTrace();
			} // end catch
		}//end if
		
	}//end method
	
	@AfterMethod (alwaysRun=true)
	public void runAfterEachMethod() {
		
		logger.debug("Ending current test case.");
		driver.close();
		driver.quit();
		
	}
}// end class
