package com.opencart.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.pages.LoginPage;
import com.opencart.pages.OrderPage;
import com.opencart.utils.BaseClass;

public class OrderPlacementTest extends BaseClass {

	public String path = "C:\\Users\\admin\\Tamil_wrkspc\\Hackaton_Demo3\\screenshots";

	@BeforeTest
	public void initialization() throws Exception {

		launchBrowser();
		driver.get(prop.getProperty("base.url"));
		max();

	}

	@Test
	public void orderProduct() {
		LoginPage lp = new LoginPage();
		OrderPage op = new OrderPage();
		String firstname = prop.getProperty("first.name");
		String lastname = prop.getProperty("last.name");
		String username = prop.getProperty("user.name");
		String password = prop.getProperty("user.password");
		String address = prop.getProperty("user.address");
		String zipcode = prop.getProperty("post.code");
		String city = prop.getProperty("user.city");
		lp.getAccBtn().click();
		lp.getLoginBtn().click();
		fill(lp.getEmail(), username);
		fill(lp.getPassWord(), password);
		lp.getSubmitBtn().click();
		move(op.getLaptopDrp());
		op.getLaptopExpand().click();
		op.getHp_LapBtn().click();
		op.getAdd_to_cart_btn().click();
		op.getCartBtn().click();
		op.getCheckoutBtn().click();	
		if (op.getBilling_Firstname().isDisplayed()) {
			
			fill(op.getBilling_Firstname(), firstname);
			fill(op.getBilling_Lastname(), lastname);
			fill(op.getBilling_Address(), address);
			fill(op.getBilling_city(), city);
			fill(op.getBilling_postcode(), zipcode);
			op.getBilling_StateDrp().click();
			selectText(op.getBilling_StateDrp(), "Angus");
			op.getBilling_ContinueBtn().click();
			
		} else {

			op.getBilling_ContinueBtn().click();
		}
		op.getShipping_continueBtn().click();
		op.getDelivery_ContinueBtn().click();
		op.getT_and_c_chk().click();
		op.getPayment_continueBtn().click();
		op.getConfirmOrderBtn().click();
		try {
			screenShot(path + "\\order.jpeg");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
