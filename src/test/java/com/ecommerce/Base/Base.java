package com.ecommerce.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;
	static String Chrome_Path;

	public WebDriver config() {
		Chrome_Path = System.getProperty("user.dir") + "\\browserDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Chrome_Path);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		return driver;
	}
}
