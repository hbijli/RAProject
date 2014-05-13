/*****************************
 * WebDriverManager.java
 * Initializes the WebDriver
 * 
 * 
 ****************************/
/****************************
 * Methods:
 * getWebDriver()
 * 
 ***************************/

package com.ra.framework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverManager {
	
	static final Logger logger = Logger.getLogger(WebDriverManager.class);
	
	// Return the driver.
	public static WebDriver getWebDriver() {
		
		// Declare driver and get the property value from the properties file.
		// Initialize the appropriate browser driver.
		// Get also the URL and the implicit wait time that the driver will wait for WebElements to load.
		WebDriver driver;
		String browser = PropertyManager.getProperty("browser");
		
		if ("firefox".equalsIgnoreCase(browser)) {
			driver = new FirefoxDriver();
		}
		
		else if ("ie".equalsIgnoreCase(browser)) {
			driver = new InternetExplorerDriver();
		}
		
		else if ("chrome".equalsIgnoreCase(browser)) {
			driver = new ChromeDriver();
		}
		
		else 
			driver = new HtmlUnitDriver();
		
		driver.get(PropertyManager.getProperty("appurl"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		logger.debug("Instantiate browser driver: "+ driver);
		
		return driver;
	}

}
