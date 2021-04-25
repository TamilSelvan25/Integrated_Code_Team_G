package com.opencart.tests;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.pages.AccountPage;
import com.opencart.pages.LoginPage;
import com.opencart.pages.OrderPage;
import com.opencart.utils.BaseClass;

public class EditAccountTest extends BaseClass {

	public AccountPage ap;

	@BeforeTest
	public void initialization() throws Exception {

		launchBrowser();
		driver.get(prop.getProperty("base.url"));
		max();

	}

	@Test(priority = 0)
	public void editAccount() {
		LoginPage lp = new LoginPage();
		ap = new AccountPage();
		String name = prop.getProperty("updated.lastname");
		String username = prop.getProperty("user.name");
		String password = prop.getProperty("user.password");
		lp.getAccBtn().click();
		lp.getLoginBtn().click();
		fill(lp.getEmail(), username);
		fill(lp.getPassWord(), password);
		lp.getSubmitBtn().click();
		ap.getEditBtn().click();
		fill(ap.getLastName(), name);
		ap.getSubmitBtn().click();

	}

	@Test(priority = 1)
	public void logOut() {

		String successText = ap.getSuccessMsg().getText();
		if (successText.contains(" Success: Your account has been successfully updated")) {
			Reporter.log("Details has been successfully updated");
		} else {

			Reporter.log("Error while updating the details..please check the log.");
		}

		ap.getLogoutBtn().click();
	}

}
