package com.opencart.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.pages.AccountPage;
import com.opencart.pages.LoginPage;
import com.opencart.pages.WishlistPage;
import com.opencart.utils.BaseClass;

public class WishlistTest extends BaseClass {

	public String path = "C:\\Users\\admin\\Tamil_wrkspc\\Hackaton_Demo3\\screenshots";

	@BeforeTest
	public void initialization() throws Exception {

		launchBrowser();
		driver.get(prop.getProperty("base.url"));
		max();

	}

	@Test
	public void wishList() {

		LoginPage lp = new LoginPage();
		WishlistPage wp = new WishlistPage();
		lp.getAccBtn().click();
		lp.getLoginBtn().click();
		try {
			fill(lp.getEmail(), getData(1, 0));
		} catch (Throwable e1) {
			e1.printStackTrace();
		}
		try {
			fill(lp.getPassWord(), getData(1, 1));
		} catch (Throwable e) {
			e.printStackTrace();
		}
		lp.getSubmitBtn().click();
		move(wp.getComponentsMouseOver());
		wp.getMonitorDrp().click();
		wp.getWishlistBtn().click();
		wp.getWishlistBtn1().click();
		wp.getAddtocartIcon().click();
		try {
			screenShot(path + "//wishlist.jpeg");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(enabled = false)
	public void logOut() {
		AccountPage ap = new AccountPage();
		ap.getLogoutBtn().click();
	}

}
