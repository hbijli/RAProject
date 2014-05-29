package com.ra.page;

import org.openqa.selenium.WebDriver;
import static com.ra.locators.IBecomeOurPartnerLocators.*;


import com.ra.framework.RAPage;

public class BecomeOurPartnerPage extends RAPage {

	public BecomeOurPartnerPage(WebDriver driver) {
		
		super(driver);
	}

	@Override
	public void verifyPageElements() {
		
		verifyElementDisplayed(pageTitle);	
		
	}
	
	public RegistrationPage continueToRegistration() {
		
		verifyAndClick(btnContinue);
		
		return new RegistrationPage(driver);
	}

}
