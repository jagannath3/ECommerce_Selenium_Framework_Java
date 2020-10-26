package com.ecommerce.actions;

import org.openqa.selenium.WebDriver;

import com.ecommerce.pageObjects.AccountPageObjects;

public class AccountPageActions {

	WebDriver driver;

	AccountPageObjects accountPageObjects;

	public AccountPageActions(WebDriver driver) {
		this.driver = driver;
	}

	public void enterEmail(String email) {
		accountPageObjects = new AccountPageObjects(driver);
		accountPageObjects.getEmail().sendKeys(email);
	}

	public void clickOnCreateAccount() {
		accountPageObjects = new AccountPageObjects(driver);
		accountPageObjects.getCreatAccountButton().click();
	}

	public String printErrorMessage() {
		accountPageObjects = new AccountPageObjects(driver);
		return accountPageObjects.getErrorMessage().getText();
	}

}
