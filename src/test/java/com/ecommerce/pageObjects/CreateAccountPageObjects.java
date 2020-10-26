package com.ecommerce.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPageObjects {

	WebDriver driver;
	By header = By.xpath("//h3[text()='Your personal information']");
	By title = By.cssSelector("label[for='id_gender1']");
	By titleMrRadio = By.cssSelector("label[for='id_gender1'] div[class='radio']");
	By titleMrsRadio = By.cssSelector("label[for='id_gender2'] div[class='radio']");
	By customer_firstname = By.id("customer_firstname");
	By customer_lastname = By.id("customer_lastname");
	By email = By.id("email");
	By password = By.id("passwd");
	By day = By.cssSelector("select[id='days']");
	By month = By.cssSelector("select[id='months']");
	By year = By.cssSelector("select[id='years']");
	By checkBoxNewsLetter = By.id("newsletter");
	By checkBoxSpecialOffers = By.id("optin");
	By fname = By.id("firstname");
	By lname = By.id("lastname");
	By address1 = By.id("address1");
	By city = By.id("city");
	By state = By.cssSelector("select[id='id_state']");
	By zipcode = By.id("postcode");
	By country = By.cssSelector("select[id='id_country']");
	By mobile = By.id("phone_mobile");
	By alias = By.id("alias");
	By register = By.id("submitAccount");

	public CreateAccountPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getHeader() {
		return driver.findElement(header);
	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement getTitleMrRadio() {
		return driver.findElement(titleMrRadio);
	}

	public WebElement getTitleMrsRadio() {
		return driver.findElement(titleMrsRadio);
	}

	public WebElement getCustomerFirstName() {
		return driver.findElement(customer_firstname);
	}

	public WebElement getCustomerLastName() {
		return driver.findElement(customer_lastname);
	}

	public WebElement getCustomerEmail() {
		return driver.findElement(email);
	}

	public WebElement getCustomerPassword() {
		return driver.findElement(password);
	}

	public WebElement getDay() {
		return driver.findElement(day);
	}

	public WebElement getMonth() {
		return driver.findElement(month);
	}

	public WebElement getYear() {
		return driver.findElement(year);
	}

	public WebElement getNewsLetterCheckbox() {
		return driver.findElement(checkBoxNewsLetter);
	}

	public WebElement getSpecialOffersCheckbox() {
		return driver.findElement(checkBoxSpecialOffers);
	}

	public WebElement getFirstName() {
		return driver.findElement(fname);
	}

	public WebElement getLastName() {
		return driver.findElement(lname);
	}

	public WebElement getCustomerAddress() {
		return driver.findElement(address1);
	}

	public WebElement getCustomerCity() {
		return driver.findElement(city);
	}

	public WebElement getCustomerState() {
		return driver.findElement(state);
	}

	public WebElement getCustomerZipCode() {
		return driver.findElement(zipcode);
	}

	public WebElement getCustomerCountry() {
		return driver.findElement(country);
	}

	public WebElement getCustomerMobile() {
		return driver.findElement(mobile);
	}

	public WebElement getAliasName() {
		return driver.findElement(alias);
	}

	public WebElement getRegisterButton() {
		return driver.findElement(register);
	}
}
