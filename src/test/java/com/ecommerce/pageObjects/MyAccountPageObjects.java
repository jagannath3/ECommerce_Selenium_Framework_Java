package com.ecommerce.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPageObjects {

	WebDriver driver;

	By signOut = By.className("logout");

	public MyAccountPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSignOut() {
		return driver.findElement(signOut);
	}
}
