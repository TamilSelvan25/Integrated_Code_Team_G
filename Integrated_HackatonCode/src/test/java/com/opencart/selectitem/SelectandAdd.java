package com.opencart.selectitem;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.pages.LoginPage_R;
import com.opencart.utils.BaseClass_R;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SelectandAdd extends BaseClass_R {
	
	static ExtentTest test;
	static ExtentReports report;
	public String path = "\\Users\\Bhavani\\eclipse-workspace\\Demo\\screenshot";
	
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
				 public void selectAdd() throws Exception{
					 LoginPage_R login = new LoginPage_R(driver);
					 JavascriptExecutor js = (JavascriptExecutor) driver;
					 move(login.getMousehover());
					 login.getShowall().click();
					 login.getSelectitem().click();
					 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
					 login.getAddToCart().click();
					 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
					 login.getClickCart().click();
					 test.log(LogStatus.PASS, "Success: You have added iMac to your shopping cart!");
					 screenShot(path+"\\screenshot.jpeg");
					 report.flush();
	
	

}
}
