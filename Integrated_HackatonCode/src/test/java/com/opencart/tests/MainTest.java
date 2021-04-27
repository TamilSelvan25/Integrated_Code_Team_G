package com.opencart.tests;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.pages.E2ETestPage;
import com.opencart.utils.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class MainTest extends BaseClass {

	static ExtentTest test;
	static ExtentReports report;

	public String path = "\\Users\\Bhavani\\eclipse-workspace\\Demo\\screenshot";

	public MainTest() throws IOException {
		super();

	}

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
	public void userLogin() throws Exception {
		E2ETestPage login = new E2ETestPage(driver);
		login.getDropdown().click();
		login.getLogin().click();
		login.getEmailname().sendKeys(prop.getProperty("Emailname"));
		login.getPassword().sendKeys(prop.getProperty("Password"));
		login.getLoginClick().click();

	}

	@AfterClass
	public void endTest() {
		report.endTest(test);
		report.flush();
	}

}
