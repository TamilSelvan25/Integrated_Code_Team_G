package com.opencart.tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.pages.GuestCheckOutPage;
import com.opencart.utils.BaseClassPage;

public class GuestCheckOutTest extends BaseClassPage{
	
	@BeforeTest
	public void launchingBrowser()
	{			
		initialization(); 
		}
@Test
	public void createAccountDetails() throws Exception  {
		
		GuestCheckOutPage op=new GuestCheckOutPage();
	    op.moveHovering();
	    
	    op.getShowall().click();
	    op.getProductcategory().click();
	    Thread.sleep(2000);
	    op.getDatechange().clear();
	    Thread.sleep(2000);
	    op.getDatechange().sendKeys(prop.getProperty("Date"));
	    op.getButtoncart().click();
	    Thread.sleep(1000);
	    op.getItembasket().click();
	    Thread.sleep(1000);
	    op.getCheckoutbtn().click();
	    op.getGuestCheckout().click();
	    Thread.sleep(1000);
	    op.getContinuebtn().click();
	    op.getFirstname().sendKeys(prop.getProperty("FirstName"));
	    op.getLastname().sendKeys(prop.getProperty("LastName"));
	    op.getEmail().sendKeys(prop.getProperty("Email"));
	    op.getTelephonenumber().sendKeys(prop.getProperty("Telephone"));
	    op.getCompanyname().sendKeys(prop.getProperty("Company"));
	    op.getAddress().sendKeys(prop.getProperty("Address"));
	    op.getAddress2().sendKeys(prop.getProperty("Address2"));
	    op.getCity().sendKeys(prop.getProperty("City"));
	    op.getCountry().click();
	    Select ob=new Select(op.getCountry());
	    ob.selectByVisibleText("India");
	    op.getState().click();
	    Select ob1=new Select(op.getState());
		   ob1.selectByVisibleText("Telangana");
	    op.getContinuebtn2().click();
	    op.getRadiobtn().click();
	    op.getTextarea().sendKeys(prop.getProperty("Textarea"));
	    op.getShippingbtn().click();
	    op.getCashondeliver().click();
	    op.getPaymentComment().sendKeys(prop.getProperty("Textarea"));
	    op.getCheckbox().click();
	    op.getPaymentbtn().click();
	    op.getBtnconform().click();
	    
	}
}
