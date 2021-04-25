package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.utils.BaseClassPage;

public class CreateAccountPage extends BaseClassPage {
	
	public WebElement getMyaccount() {
		return myaccount;
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConformpassword() {
		return conformpassword;
	}

	public WebElement getTelephonenumber() {
		return telephonenumber;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}
	 public WebElement getContinuebtn() {
			return Continuebtn;
		}

	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myaccount;
	@FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement register;
	@FindBy(xpath = "//input[@id='input-firstname']")
    WebElement firstname;
	@FindBy(xpath = "//input[@id='input-lastname']")
    WebElement lastname;
	@FindBy(xpath = "//input[@id='input-email']")
    WebElement email;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement conformpassword;
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement telephonenumber;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
	WebElement checkbox;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
	WebElement Continuebtn;
	
	public CreateAccountPage() {

        PageFactory.initElements(driver, this);
    }
    
}
