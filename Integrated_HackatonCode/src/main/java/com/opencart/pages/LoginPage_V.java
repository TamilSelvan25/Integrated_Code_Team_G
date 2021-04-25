package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.excelsheet.xls_Reader;
import com.opencart.utils.BaseClassPage;

public class LoginPage_V extends BaseClassPage{
	
	public WebElement getMyaccount() {
		return myaccount;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myaccount;
	@FindBy(xpath="//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	WebElement btnlogin;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	@FindBy(xpath="//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	WebElement login;
	public LoginPage_V() {

        PageFactory.initElements(driver, this);
    }
	
	public void excelSheet() {
		 
        xls_Reader reader = new xls_Reader("C:\\Users\\jayanth\\eclipse-workspace\\Hackathon\\src\\main\\java\\com\\Excel\\lib\\util\\SampleExcel.xlsx");
			String sheetName = "login";
			
			int rowCount = reader.getRowCount(sheetName);

			for(int rowNum=2; rowNum<=rowCount; rowNum++){
				String loginId = reader.getCellData(sheetName, "username", rowNum);
				String passsword = reader.getCellData(sheetName, "password", rowNum);

				WebElement userName=driver.findElement(By.xpath("//input[@id='dwfrm_login_username']"));
				userName.clear();
				userName.sendKeys(loginId);
				
				WebElement password=driver.findElement(By.xpath("//input[@id='dwfrm_login_password']"));
				password.clear();
				password.sendKeys(passsword);
			}  
   
    
	
	}
}
