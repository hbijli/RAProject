package com.ra.page;

import org.openqa.selenium.WebDriver;
import com.ra.framework.RAPage;
import static com.ra.locators.IBSECLocators.*;

public class BidOnRideBSECPage extends RAPage{

	public BidOnRideBSECPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	@Override
	public void verifyPageElements() {
		verifyElementDisplayed(pageTitle);
		
	}

}
