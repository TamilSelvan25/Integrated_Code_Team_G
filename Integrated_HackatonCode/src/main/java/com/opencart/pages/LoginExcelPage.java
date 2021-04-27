package com.opencart.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.utils.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class LoginExcelPage extends BaseClass {
	static ExtentTest test;
	static ExtentReports report;

	public LoginExcelPage() throws IOException {
		super();

	}

	@BeforeTest
	public void startTest() {
		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");

		test = report.startTest("LoginExcelPage");
	}

	@Test

	public void fileread() throws IOException, InterruptedException {

		File file = new File(System.getProperty("user.dir") + "\\src\\main\\java\\com\\opencart\\excelsheet\\SampleExcel.xlsx");
		FileInputStream inputStream = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sh1 = wb.getSheet("Sheet1");

		launchBrowser();
		Reporter.log("Browser launched succesfully");
		driver.get(prop.getProperty("url"));
		E2ETestPage login = new E2ETestPage(driver);
		login.getDropdown().click();
		login.getLogin().click();
		login.getEmailname().sendKeys(sh1.getRow(1).getCell(0).getStringCellValue());
		login.getPassword().sendKeys(sh1.getRow(1).getCell(1).getStringCellValue());
		login.getLoginClick().click();
		Reporter.log("user logged in successfully");
		report.flush();

	}
}
