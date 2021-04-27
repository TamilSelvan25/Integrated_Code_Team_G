package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class E2ETestPage {
	final WebDriver driver;

	public E2ETestPage(WebDriver driver) {
		// super();

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement Dropdown;

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement Login;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement Emailname;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement Password;

	@FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	private WebElement LoginClick;

	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement Register;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement FirstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement LastName;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement Email;

	@FindBy(xpath = "//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/p[4]/textarea[1]")
	private WebElement TypeShipping;

	public WebElement getTypeShipping() {
		return TypeShipping;
	}

	@FindBy(xpath = "//input[@id='button-shipping-method']")
	private WebElement PressContinue;

	@FindBy(xpath = "//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/p[3]/textarea[1]")
	private WebElement PaymentComment;

	@FindBy(xpath = "//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/input[1]")
	private WebElement Paymentcheck;

	@FindBy(xpath = "//input[@id='button-payment-method']")
	private WebElement PaymentContinue;

	@FindBy(xpath = "//input[@id='button-confirm']")
	private WebElement ConfirmOrder;

	public WebElement getConfirmOrder() {
		return ConfirmOrder;
	}

	public WebElement getPaymentContinue() {
		return PaymentContinue;
	}

	public WebElement getPaymentcheck() {
		return Paymentcheck;
	}

	public WebElement getPaymentComment() {
		return PaymentComment;
	}

	public WebElement getPressContinue() {
		return PressContinue;
	}

	@FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement Checkbox;

	@FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
	private WebElement Buttonclick;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement Mousehover;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement Showall;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/a[1]/img[1]")
	private WebElement Selectitem;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement AddToCart;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement ClickCart;

	@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[2]/strong[1]")
	private WebElement Checkout;

	@FindBy(xpath = "//input[@value='guest']")
	private WebElement GuestCheckout;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement Continue;

	@FindBy(xpath = "//input[@id='input-payment-firstname']")
	private WebElement First;

	@FindBy(xpath = "//input[@id='button-guest']")
	private WebElement Button;

	@FindBy(xpath = "//input[@id='input-payment-password']")
	private WebElement EnterPassword;

	@FindBy(xpath = "//input[@id='input-payment-confirm']")
	private WebElement ConfirmPassword;

	@FindBy(xpath = "//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/input[1]")
	private WebElement Accountcheckbox;

	@FindBy(xpath = "//input[@id='button-register']")
	private WebElement Accountcontinuecase;

	public WebElement getAccountcontinuecase() {
		return Accountcontinuecase;
	}

	public WebElement getAccountcheckbox() {
		return Accountcheckbox;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public WebElement getEnterPassword() {
		return EnterPassword;
	}

	public WebElement getButton() {
		return Button;
	}

	public WebElement getFirst() {
		return First;
	}

	public WebElement getLast() {
		return Last;
	}

	@FindBy(xpath = "//input[@id='input-payment-lastname']")
	private WebElement Last;

	@FindBy(xpath = "//input[@id='input-payment-email']")
	private WebElement GuestEmail;

	@FindBy(xpath = "//input[@id='input-payment-telephone']")
	private WebElement Telephone;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement Quantity;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addtocart;

	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/div[1]/button[1]")
	private WebElement itemcart;

	@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[1]/strong[1]")
	private WebElement viewcart;

	@FindBy(xpath = "//tbody/tr[2]/td[4]/div[1]/span[1]/button[2]")
	private WebElement removecart;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[2]/a[1]")
	private WebElement continueShopping;

	public WebElement getContinueShopping() {
		return continueShopping;
	}

	public WebElement getRemovecart() {
		return removecart;
	}

	public WebElement getViewcart() {
		return viewcart;
	}

	@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[2]/strong[1]")
	private WebElement iphonecheckout;

	public WebElement getIphonecheckout() {
		return iphonecheckout;
	}

	public WebElement getItemcart() {
		return itemcart;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getQuantity() {
		return Quantity;
	}

	public WebElement getTelephone() {
		return Telephone;
	}

	public WebElement getGuestEmail() {
		return GuestEmail;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getGuestCheckout() {
		return GuestCheckout;
	}

	@FindBy(xpath = "//input[@id='input-payment-company']")
	private WebElement Company;

	@FindBy(xpath = "//input[@id='input-payment-address-1']")
	private WebElement Address1;

	@FindBy(xpath = "//input[@id='input-payment-city']")
	private WebElement City;

	@FindBy(xpath = "//input[@id='input-payment-postcode']")
	private WebElement PostCode;

	@FindBy(xpath = "//select[@id='input-payment-country']")
	private WebElement Country;

	@FindBy(xpath = "//select[@id='input-payment-zone']")
	private WebElement Region;

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]")
	private WebElement MouseComponent;

	@FindBy(xpath = "//a[contains(text(),'Monitors (2)')]")
	private WebElement Monitors;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
	private WebElement AppleCinema;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/label[1]/input[1]")
	private WebElement Checkbox3;

	@FindBy(xpath = "//textarea[@id='input-option209']")
	private WebElement Text;

	@FindBy(xpath = "//button[@id='button-upload222']")
	private WebElement UploadFile;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement FileAddtocart;

	@FindBy(xpath = "//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
	private WebElement RegisterAccount;

	@FindBy(xpath = "//input[@id='button-account']")
	private WebElement AccountContinue;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[5]/div[1]/input[1]")
	private WebElement DeliveryContinue;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/input[1]")
	private WebElement CommentContinue;

	@FindBy(xpath = "//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/input[1]")
	private WebElement DeliveryCheckbox;

	@FindBy(xpath = "//input[@id='button-payment-method']")
	private WebElement OrderContinue;

	@FindBy(xpath = "//input[@id='button-confirm']")
	private WebElement Accountconfirmorder;

	@FindBy(xpath = "//input[@id='input-payment-email']")
	private WebElement emailAddress;

	@FindBy(xpath = "//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[3]/label[1]/input[1]")
	private WebElement NewAddress;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[5]/div[1]/input[1]")
	private WebElement newAddresscontinue;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/input[1]")
	private WebElement continueClick;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/p[4]/textarea[1]")
	private WebElement commentText;

	@FindBy(xpath = "//a[contains(text(),'Edit Account')]")
	private WebElement editAccount;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstnameEdit;

	@FindBy(xpath = "//body/div[@id='account-edit']/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
	private WebElement editContinue;

	@FindBy(xpath = "//body/div[@id='account-account']/div[2]/aside[1]/div[1]/a[13]")
	private WebElement logout;

	@FindBy(xpath = "//header/div[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement Search;

	@FindBy(xpath = "//header/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]")
	private WebElement clickSearch;

	@FindBy(xpath = "//body/div[@id='product-search']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
	private WebElement selectiphone;

	public WebElement getSelectiphone() {
		return selectiphone;
	}

	public WebElement getClickSearch() {
		return clickSearch;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getEditContinue() {
		return editContinue;
	}

	public WebElement getFirstnameEdit() {
		return firstnameEdit;
	}

	public WebElement getEditAccount() {
		return editAccount;
	}

	public WebElement getCommentText() {
		return commentText;
	}

	public WebElement getContinueClick() {
		return continueClick;
	}

	public WebElement getNewAddresscontinue() {
		return newAddresscontinue;
	}

	public WebElement getNewAddress() {
		return NewAddress;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getAccountconfirmorder() {
		return Accountconfirmorder;
	}

	public WebElement getOrderContinue() {
		return OrderContinue;
	}

	public WebElement getDeliveryCheckbox() {
		return DeliveryCheckbox;
	}

	public WebElement getCommentContinue() {
		return CommentContinue;
	}

	public WebElement getDeliveryContinue() {
		return DeliveryContinue;
	}

	public WebElement getAccountContinue() {
		return AccountContinue;
	}

	public WebElement getRegisterAccount() {
		return RegisterAccount;
	}

	public WebElement getFileAddtocart() {
		return FileAddtocart;
	}

	public WebElement getUploadFile() {
		return UploadFile;
	}

	public WebElement getText() {
		return Text;
	}

	public WebElement getSelect() {
		return select;
	}

	@FindBy(xpath = "//select[@id='input-option217']")
	private WebElement select;

	public WebElement getCheckbox3() {
		return Checkbox3;
	}

	public WebElement getAppleCinema() {
		return AppleCinema;
	}

	public WebElement getMonitors() {
		return Monitors;
	}

	public WebElement getMouseComponent() {
		return MouseComponent;
	}

	public WebElement getCompany() {
		return Company;
	}

	public WebElement getAddress1() {
		return Address1;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getPostCode() {
		return PostCode;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getRegion() {
		return Region;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	public WebElement getShowall() {
		return Showall;
	}

	public WebElement getClickCart() {
		return ClickCart;
	}

	public WebElement getMousehover() {
		return Mousehover;
	}

	public WebElement getAddToCart() {
		return AddToCart;
	}

	public WebElement getSelectitem() {
		return Selectitem;
	}

	public WebElement getButtonclick() {
		return Buttonclick;
	}

	public WebElement getCheckbox() {
		return Checkbox;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getRegister() {
		return Register;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLoginClick() {
		return LoginClick;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getDropdown() {
		return Dropdown;
	}

	public WebElement getEmailname() {
		return Emailname;
	}

}
