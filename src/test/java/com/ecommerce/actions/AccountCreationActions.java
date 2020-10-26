package com.ecommerce.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ecommerce.pageObjects.AccountPageObjects;
import com.ecommerce.pageObjects.CreateAccountPageObjects;

public class AccountCreationActions {

	WebDriver driver;

	AccountPageObjects accountObject;
	CreateAccountPageObjects createAccountPageObjects;

	public AccountCreationActions(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnTitleRadio() {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		WebElement radio = createAccountPageObjects.getTitleMrRadio();
		if (!radio.isSelected())
			radio.click();
	}

	public void enterEmail(String email) {
		accountObject = new AccountPageObjects(driver);
		accountObject.getEmail().sendKeys(email);
	}

	public void enterFirstName(String fname) {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		createAccountPageObjects.getCustomerFirstName().sendKeys(fname);
	}

	public void enterLastName(String lname) {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		createAccountPageObjects.getCustomerLastName().sendKeys(lname);
	}

	public void enterPassword(String pwd) {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		createAccountPageObjects.getCustomerPassword().sendKeys(pwd);
	}

	public void selectDay(String day) {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		Select s = new Select(createAccountPageObjects.getDay());
		s.selectByValue(day);
	}

	public void selectMonth(int month) {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		Select s = new Select(createAccountPageObjects.getMonth());
		s.selectByIndex(month);
	}

	public void selectYear(String year) {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		Select s = new Select(createAccountPageObjects.getYear());
		s.selectByValue(year);
	}

	public void checkNewsLetter() {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		WebElement checkNewsLetter = createAccountPageObjects.getNewsLetterCheckbox();
		if (!checkNewsLetter.isSelected()) {
			checkNewsLetter.click();
		}
	}

	public void checkSpecialOffers() {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		WebElement checkBoxSpecial = createAccountPageObjects.getSpecialOffersCheckbox();
		if (!checkBoxSpecial.isSelected()) {
			checkBoxSpecial.click();
		}
	}

	public void enterAddress1(String add1) {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		createAccountPageObjects.getCustomerAddress().sendKeys(add1);
	}

	public void enterCity(String city) {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		createAccountPageObjects.getCustomerCity().sendKeys(city);
	}

	public void selectState(String state) {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		Select s = new Select(createAccountPageObjects.getCustomerState());
		s.selectByVisibleText(state);
	}

	public void selectCountry(String country) {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		Select s = new Select(createAccountPageObjects.getCustomerCountry());
		s.selectByVisibleText(country);
	}

	public void enterZipCode(int zip) {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		createAccountPageObjects.getCustomerZipCode().sendKeys(String.valueOf(zip));
	}

	public void enterMobileNumber(long mobile) {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		createAccountPageObjects.getCustomerMobile().sendKeys(String.valueOf(mobile));
	}

	public void enterAliasName(String alias) {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		createAccountPageObjects.getAliasName().clear();
		createAccountPageObjects.getAliasName().sendKeys(alias);
	}

	public void clickOnRegister() {
		createAccountPageObjects = new CreateAccountPageObjects(driver);
		createAccountPageObjects.getRegisterButton().click();
	}
}
