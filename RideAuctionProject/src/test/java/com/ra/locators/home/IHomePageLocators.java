/***************************************
 * IHomePageLocators.java
 * Interface for locators on RA Homepage
 * 
 * 
 ***************************************/

package com.ra.locators.home;

import org.openqa.selenium.By;

public interface IHomePageLocators {
	
	
	By img_HOMEPAGELOGO		= By.cssSelector("img[title='RideAuction']");
	By img_AIRPORT			= By.cssSelector("#airport>img");
	By img_HOURLY			= By.cssSelector("#hourly>img");
	By img_POINT_TO_POINT	= By.cssSelector("#transfers>img");
	By img_BSEC				= By.cssSelector("#exotic>img");
	By link_APPSTORE		= By.partialLinkText("Open In App Store");
	By btn_BIDONRIDE		= By.cssSelector("#airport input[type='submit']");
	By btn_HOURLY			= By.cssSelector("#hourly input[type='submit']");
	By btn_POINT_TO_POINT	= By.cssSelector("#transfers input[type='submit']");
	By btn_BSEC				= By.cssSelector("#exotic input[type='submit']");
	By rb_AIRPORT_TO		= By.id("toairport");
	By rb_AIRPORT_FROM		= By.id("fromairport");
	By rb_HOURLY_INTHECITY	= By.id("hourlydriver");
	By rb_HOURLY_OUTSIDE	= By.id("hourlycircle");
	By lnk_50FLAT			= By.id("sfsfo");
	By lnk_YOUTUBE			= By.id("youtube");
	By lnk_BESTPRICEGUARANTEE = By.id("bpg");
	By lnk_TWEET_7X7		= By.linkText("http://t.co/yBp8I8yOUX");
	By lnk_TWITTER_URL		= By.cssSelector(".aiwidgetscss>div:first-of-type .tweetlink>a:first-child");
	By lnk_TWEET_REPLY		= By.linkText("reply");
	By lnk_RETWEET			= By.linkText("retweet");
	By lnk_FAVORITE_TWEET	= By.linkText("favorite");

	  
	 // Bottom Links
	By lnk_HOWITWORKS		= By.linkText("How it works");
	By lnk_BECOMEOURPARTNER	= By.linkText("Become our Partner");
	By lnk_FAQ				= By.linkText("FAQ");
	By lnk_ABOUTUS			= By.linkText("About Us");
	By lnk_CORPORATE		= By.linkText("Corporate");
	By lnk_CONTACTUS		= By.linkText("Contact Us");
	By lnk_LOGIN			= By.linkText("Login");
	By lnk_REGISTRATION		= By.linkText("Registration");
	  
	 // Social links
	By lnk_FACEBOOK			= By.cssSelector(".center>div>a:first-child>img");
	By lnk_GOOGLEPLUS		= By.cssSelector(".center>div>a:nth-child(2)>img");
	By lnk_TWITTER			= By.cssSelector(".center>div>a:nth-child(3)>img");
	By lnk_YELP				= By.cssSelector(".center>div>a:nth-child(4)>img");
	By lnk_BLOG				= By.cssSelector(".center>div>a:last-child>img");

}
