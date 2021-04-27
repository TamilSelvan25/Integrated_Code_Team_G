package com.opencart.tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.excelsheet.ExcelPage;
import com.opencart.pages.Add_to_CartPage;
import com.opencart.pages.CreateAccountPage;
import com.opencart.pages.OrderHistoryPage;
import com.opencart.utils.BaseClassPage;

public class ClassTest extends BaseClassPage {

	public String path = "C:\\Users\\jayanth\\eclipse-workspace\\Hackaton_Team-G\\Hackaton_Team-G\\ScreenShot";

	public ClassTest() {

	}

	@BeforeTest
	public void launchingBrowser() throws IOException {
		launchingBrowser();
	}

	@Test
	public void createAccountDetails() throws Exception {

		CreateAccountPage obj = new CreateAccountPage();

		obj.getMyaccount().click();
		obj.getRegister().click();
		obj.getFirstname().sendKeys(prop.getProperty("FirstName"));
		obj.getLastname().sendKeys(prop.getProperty("LastName"));
		obj.getEmail().sendKeys(prop.getProperty("Email"));
		obj.getPassword().sendKeys(prop.getProperty("Pass"));
		obj.getConformpassword().sendKeys(prop.getProperty("conpass"));
		obj.getTelephonenumber().sendKeys(prop.getProperty("Telephone"));
		obj.getCheckbox().click();
		obj.getContinuebtn().click();

		Thread.sleep(5000);

		ExcelPage lp = new ExcelPage();
		lp.getMyaccount().click();
		lp.getBtnlogin().click();
		lp.getEmail().sendKeys(prop.getProperty("Email"));
		lp.getPassword().sendKeys(prop.getProperty("Pass"));
		lp.getLogin().click();

		Thread.sleep(5000);

		Add_to_CartPage ac = new Add_to_CartPage();
		ac.validateLoginDetails();

		ac.getMac().click();
		ac.getProductcategory().click();
		ac.getButtoncart().click();
		// ac.getLogout().click();

		Thread.sleep(1000);

		OrderHistoryPage oh = new OrderHistoryPage();
		oh.getMyaccount().click();
		oh.getBtnlogin().click();
		Thread.sleep(1000);
		oh.orderHistoryView();
	}

}
