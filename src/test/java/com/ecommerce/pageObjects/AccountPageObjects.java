package com.ecommerce.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPageObjects {

	WebDriver driver;
	By email = By.id("email_create");
	By creatAccountButton = By.id("SubmitCreate");
	By error = By.id("create_account_error");

	public AccountPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getCreatAccountButton() {
		return driver.findElement(creatAccountButton);
	}

	public WebElement getErrorMessage() {
		return driver.findElement(error);
	}

}
