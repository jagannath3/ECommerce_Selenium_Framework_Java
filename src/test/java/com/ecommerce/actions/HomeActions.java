package com.ecommerce.actions;

import org.openqa.selenium.WebDriver;

import com.ecommerce.pageObjects.HomePageObjects;

public class HomeActions {

	WebDriver driver;
	HomePageObjects homePageObjects;

	public HomeActions(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnSignin() {
		homePageObjects = new HomePageObjects(driver);
		homePageObjects.getSignin().click();
	}
}
