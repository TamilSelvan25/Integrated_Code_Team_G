package com.opencart.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.pages.E2ETestPage;
import com.opencart.utils.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class AccountCheckoutTest extends BaseClass {

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
		login.getCheckout().click();
		login.getRegisterAccount().click();
		login.getAccountContinue().click();
		login.getFirst().sendKeys(prop.getProperty("FirstName"));
		login.getLast().sendKeys(prop.getProperty("LastName"));
		login.getEmailAddress().sendKeys(prop.getProperty("emailAddress"));
		login.getTelephone().sendKeys(prop.getProperty("Telephone"));
		login.getEnterPassword().sendKeys(prop.getProperty("Enterpassword"));
		login.getConfirmPassword().sendKeys(prop.getProperty("Confirmpassword"));
		login.getAddress1().sendKeys(prop.getProperty("Address1"));
		login.getCity().sendKeys(prop.getProperty("City"));
		login.getPostCode().sendKeys(prop.getProperty("PostCode"));
		login.getRegion().click();
		Select dState = new Select(login.getRegion());
		dState.selectByVisibleText("Angus");
		login.getAccountcheckbox().click();
		login.getAccountcontinuecase().click();
		login.getDeliveryContinue().click();
		login.getNewAddress().click();
		login.getFirst().sendKeys(prop.getProperty("FirstName"));
		login.getLast().sendKeys(prop.getProperty("LastName"));
		login.getAddress1().sendKeys(prop.getProperty("Address1"));
		login.getCity().sendKeys(prop.getProperty("City"));
		login.getNewAddresscontinue().click();
		login.getCommentText().sendKeys(prop.getProperty("Commenttext"));
		login.getContinueClick().click();
		login.getDeliveryCheckbox().click();
		login.getOrderContinue().click();
		login.getAccountconfirmorder().click();
	}
}
