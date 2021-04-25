package com.opencart.tests;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.pages.LoginPage;
import com.opencart.utils.BaseClass;

public class AccountCreation extends BaseClass {

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
		String phone = prop.getProperty("telephone");
		String password = prop.getProperty("user.password");
		lp.getAccBtn().click();
		lp.getRegBtn().click();
		fill(lp.getFirstName(), firstname);
		fill(lp.getLastName(), lastname);
		fill(lp.getEmail(), email);
		fill(lp.getTelePhone(), phone);
		fill(lp.getPassWord(), password);
		fill(lp.getConfirmPass(), password);
		lp.getPrivacyPolicychk().click();
		lp.getSubmitBtn().click();
		String title = driver.getTitle();
		if (title.equals("Your Account Has Been Created!")) {

			Reporter.log("New Account Created Successfully...");

		} else {

			Reporter.log("Problem occured while creating new account");

		}

	}

}
