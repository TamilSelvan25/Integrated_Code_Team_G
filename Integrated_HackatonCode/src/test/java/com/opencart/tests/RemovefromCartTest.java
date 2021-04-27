package com.opencart.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.pages.E2ETestPage;
import com.opencart.utils.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class RemovefromCartTest extends BaseClass {

	static ExtentTest test;
	static ExtentReports report;
	public String path = System.getProperty("user.dir") + "\\screenshots";

	@BeforeTest
	public void startTest() {
		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");

		test = report.startTest("MainTest");
	}

	@Test(priority = 0, groups = { "group1", "group2" })
	public void setup() throws Exception {

		launchBrowser();
		driver.get(prop.getProperty("url"));

	}

	@Test(priority = 1, groups = { "group1", "group2" })
	public void selectAdd() throws Exception {
		E2ETestPage login = new E2ETestPage(driver);
		move(login.getMousehover());
		login.getShowall().click();
		login.getSelectitem().click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		login.getAddToCart().click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		login.getClickCart().click();
		login.getViewcart().click();
		login.getRemovecart().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		login.getContinueShopping().click();

	}
}
