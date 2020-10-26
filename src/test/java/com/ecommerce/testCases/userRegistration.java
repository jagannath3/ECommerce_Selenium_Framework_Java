package com.ecommerce.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ecommerce.Base.Base;
import com.ecommerce.actions.AccountCreationActions;
import com.ecommerce.actions.AccountPageActions;
import com.ecommerce.actions.HomeActions;
import com.ecommerce.actions.MyAccountActions;
import com.ecommerce.pageObjects.CreateAccountPageObjects;
import com.ecommerce.testData.DataProviders;

public class userRegistration extends Base {

	WebDriver driver;
	HomeActions homeActions;
	CreateAccountPageObjects createAccountObejcts;
	AccountCreationActions accountCreationActions;
	AccountPageActions accountPageActions;
	MyAccountActions myAccountActions;
	Select s;

	@BeforeTest
	public void init() {
		driver = config();
	}

	@Test(enabled = false)
	public void clickOnSignIn() {
		homeActions = new HomeActions(driver);
		homeActions.clickOnSignin();
	}

	@Test(dataProvider = "dataForAccountCreation", dataProviderClass = DataProviders.class)
	public void userRegister(String email, String fname, String lname, String pwd, String day, int month, String year,
			String add1, String city, String state, int zip, String country, long mobile, String aliasName) {
		clickOnSignIn();
		accountPageActions = new AccountPageActions(driver);
		accountPageActions.enterEmail(email);
		accountPageActions.clickOnCreateAccount();
		if (email.equals("lakece9035@prekab.net")) {
			String error = accountPageActions.printErrorMessage();
			System.out.println(error);
		} else {
			accountCreationActions = new AccountCreationActions(driver);
			createAccountObejcts = new CreateAccountPageObjects(driver);
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOf(createAccountObejcts.getHeader()));
			String newEmail = createAccountObejcts.getCustomerEmail().getAttribute("value");
			if (newEmail.equals(email)) {
				accountCreationActions.clickOnTitleRadio();
				accountCreationActions.enterFirstName(fname);
				accountCreationActions.enterLastName(lname);
				accountCreationActions.enterPassword(pwd);
				accountCreationActions.selectDay(day);
				accountCreationActions.selectMonth(month);
				accountCreationActions.selectYear(year);
				accountCreationActions.checkNewsLetter();
				accountCreationActions.checkSpecialOffers();
				accountCreationActions.enterAddress1(add1);
				accountCreationActions.enterCity(city);
				accountCreationActions.selectState(state);
				accountCreationActions.enterZipCode(zip);
				accountCreationActions.selectCountry(country);
				accountCreationActions.enterMobileNumber(mobile);
				accountCreationActions.enterAliasName(aliasName);
				accountCreationActions.clickOnRegister();
				myAccountActions = new MyAccountActions(driver);
				myAccountActions.verifySignin();
			}
		}
	}
}
