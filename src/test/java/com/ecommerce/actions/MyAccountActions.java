package com.ecommerce.actions;

import org.openqa.selenium.WebDriver;

import com.ecommerce.pageObjects.MyAccountPageObjects;

public class MyAccountActions {

	WebDriver driver;
	MyAccountPageObjects accountPageObjects;

	public MyAccountActions(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSignout() {
		accountPageObjects = new MyAccountPageObjects(driver);
		accountPageObjects.getSignOut().click();
	}

	public void verifySignin() {
		accountPageObjects = new MyAccountPageObjects(driver);
		if (accountPageObjects.getSignOut().isDisplayed()) {
			System.out.println("Login Success");
		}

	}
}
