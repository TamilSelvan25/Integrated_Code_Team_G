package com.opencart.tests;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.pages.LoginPage;
import com.opencart.utils.BaseClass;

public class NegativeAccountTest extends BaseClass{
	
	@BeforeTest
	public void initialization() throws Exception {

		launchBrowser();
		driver.get(prop.getProperty("base.url"));
		max();

	}

	@Test
	public void createAccount() {
		LoginPage lp = new LoginPage();
		String firstname = prop.getProperty("first.name");
		String lastname = prop.getProperty("last.name");
		String email = prop.getProperty("e.mail");
		String password = prop.getProperty("user.password");
		lp.getAccBtn().click();
		lp.getRegBtn().click();
		fill(lp.getFirstName(), firstname);
		fill(lp.getLastName(), lastname);
		fill(lp.getEmail(), email);
		fill(lp.getPassWord(), password);
		fill(lp.getConfirmPass(), password);
		lp.getPrivacyPolicychk().click();
		lp.getSubmitBtn().click();
		String error = lp.getErrorMsg().getText();
		if (error.contains("Telephone must be between 3 and 32 characters!")) {

			Reporter.log("Please fill all the details to create account..");

		} 

	}


}
