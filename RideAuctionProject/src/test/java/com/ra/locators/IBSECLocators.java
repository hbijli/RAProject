package com.ra.locators;

import org.openqa.selenium.By;

public interface IBSECLocators {
	
	By pageTitle 		= By.cssSelector("#serviceform>div>h1");
	By ddNoOfPassengers = By.id("NoOfPass");
	By ddSelectCar		= By.name("selectcar");
	By datePicker		= By.id("datepicker");
	By ddHour			= By.id("hour");
	By ddMinute			= By.id("minute");
	By txtOriginationAddress = By.name("OriginationAddress");
	By txtDescYourRequest	= By.name("requestBody");
	By txtEmail			= By.name("Mail");
	By txtPhone			= By.name("Phone");
	By txtBudget		= By.name("budget");
	By btnSubmit		= By.id("orderexoticsubmit");
	
	By closeBSEC		= By.id("close");

}
