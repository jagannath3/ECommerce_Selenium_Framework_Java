package com.ecommerce.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {

	WebDriver driver;
	By signin = By.className("login");

	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSignin() {
		return driver.findElement(signin);
	}
}
