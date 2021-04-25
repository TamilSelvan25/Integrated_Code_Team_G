package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.utils.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='caret']")
	private WebElement accBtn;

	@FindBy(xpath = "(//*[text()='Register'])[1]")
	private WebElement regBtn;

	@FindBy(xpath = "//*[@id='input-firstname']")
	private WebElement firstName;

	@FindBy(xpath = "//*[@id='input-lastname']")
	private WebElement lastName;

	@FindBy(xpath = "//*[@id='input-email']")
	private WebElement email;

	@FindBy(xpath = "//*[@id='input-telephone']")
	private WebElement telePhone;

	@FindBy(xpath = "//*[@id='input-password']")
	private WebElement passWord;

	@FindBy(xpath = "//*[@id='input-confirm']")
	private WebElement confirmPass;

	@FindBy(xpath = "//*[@type='checkbox']")
	private WebElement privacyPolicychk;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Telephone must ')]")
	private WebElement errorMsg;
	
	@FindBy(xpath = "//*[text()='Login']")
	private WebElement loginBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getErrorMsg() {
		return errorMsg;
	}

	public WebElement getAccBtn() {
		return accBtn;
	}

	public WebElement getRegBtn() {
		return regBtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getTelePhone() {
		return telePhone;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getConfirmPass() {
		return confirmPass;
	}

	public WebElement getPrivacyPolicychk() {
		return privacyPolicychk;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

}
