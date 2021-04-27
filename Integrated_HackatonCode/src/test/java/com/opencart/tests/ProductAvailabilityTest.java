package com.opencart.tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.pages.E2ETestPage;
import com.opencart.utils.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ProductAvailabilityTest extends BaseClass {
	static ExtentTest test;
	static ExtentReports report;

	public String path = System.getProperty("user.dir")+"\\screenshots";

	public ProductAvailabilityTest() throws IOException {
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
		login.getSearch().click();
		login.getSearch().sendKeys(prop.getProperty("Phone"));
		login.getClickSearch().click();
		login.getSelectiphone().click();
		login.getQuantity().sendKeys(prop.getProperty("value"));
		login.getAddtocart().click();
		login.getItemcart().click();
		login.getIphonecheckout().click();
		screenShot(path + "\\screenshot.jpeg");
		report.flush();

	}
}
