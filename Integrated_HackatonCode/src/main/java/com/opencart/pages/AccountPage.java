package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.utils.BaseClass;

public class AccountPage extends BaseClass{
	
	public AccountPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText = "Edit Account")
	private WebElement editBtn;

	@FindBy(xpath = "//*[@id='input-lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath = "//*[contains(text(),' Success: Your account has')]")
	private WebElement successMsg;
	
	@FindBy(linkText = "Logout")
	private WebElement logoutBtn;
	
	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}



}
