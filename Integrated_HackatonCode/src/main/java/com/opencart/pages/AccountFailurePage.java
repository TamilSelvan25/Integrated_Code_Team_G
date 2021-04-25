package com.opencart.pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.utils.BaseClass;
import com.opencart.utils.BaseClass_R;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class AccountFailurePage extends BaseClass_R{
	
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeTest
	public void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");

	test = report.startTest("MainTest");
	}
	
			@Test(priority=0, groups= {"group1","group2"})
			public void setup() throws Exception{

				 Launchbrowser();
				 driver.get(prop.getProperty("url")); 
				
				

			}
				
				 @Test(priority=1,groups= {"group1","group2"})
				 public void userLogin() throws Exception{
					 LoginPage_R login = new LoginPage_R(driver);
					 login.getDropdown().click();
					 login.getRegister().click();
					 login.getFirstName().sendKeys(prop.getProperty("FirstName"));
					 login.getLastName().sendKeys(prop.getProperty("LastName"));
					 login.getEmail().sendKeys(prop.getProperty("E-Mail"));
					 login.getCheckbox().click();
					 login.getButtonclick().click();
	                 driver.quit();
	                 report.flush();
	
				 }

}
