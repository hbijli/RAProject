package com.ra.page;

import org.openqa.selenium.WebDriver;
import static com.ra.locators.IAboutUsLocators.*;

import com.ra.framework.RAPage;

public class AboutUsPage  extends RAPage{

	public AboutUsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	@Override
	public void verifyPageElements() {
		verifyElementDisplayed(pageTitle);
		
	}

}
