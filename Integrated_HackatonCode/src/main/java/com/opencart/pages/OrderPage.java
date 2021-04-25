package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.utils.BaseClass;

public class OrderPage extends BaseClass {

	public OrderPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Laptops & Notebooks']")
	private WebElement laptopDrp;

	@FindBy(xpath = "//*[text()='Show All Laptops & Notebooks']")
	private WebElement laptopExpand;

	@FindBy(xpath = "//*[@id='button-cart']")
	private WebElement add_to_cart_btn;

	@FindBy(xpath = "//*[@id='cart-total']")
	private WebElement cartBtn;

	@FindBy(xpath = "//*[text()=' Checkout']")
	private WebElement checkoutBtn;

	@FindBy(xpath = "//*[@id='input-payment-firstname']")
	private WebElement billing_Firstname;

	@FindBy(xpath = "//*[@id='input-payment-lastname']")
	private WebElement billing_Lastname;

	@FindBy(xpath = "//*[@id='input-payment-address-1']")
	private WebElement billing_Address;

	@FindBy(xpath = "//*[@id='input-payment-city']")
	private WebElement billing_city;

	@FindBy(xpath = "//*[@id='input-payment-postcode']")
	private WebElement billing_postcode;

	@FindBy(xpath = "//*[@id='input-payment-zone']")
	private WebElement billing_StateDrp;

	@FindBy(xpath = "//*[@id='button-payment-address']")
	private WebElement billing_ContinueBtn;

	@FindBy(xpath = "//*[@id='button-shipping-address']")
	private WebElement shipping_continueBtn;

	@FindBy(xpath = "//*[@id='button-shipping-method']")
	private WebElement delivery_ContinueBtn;

	@FindBy(xpath = "//*[@type='checkbox']")
	private WebElement t_and_c_chk;

	@FindBy(xpath = "//*[@id='button-payment-method']")
	private WebElement payment_continueBtn;

	@FindBy(xpath = "//*[@id='button-confirm']")
	private WebElement confirmOrderBtn;
	
	/*
	 * @FindBy(xpath = "//*[text()='HP LP3065']") private WebElement hp_LapBtn;
	 */
	@FindBy(linkText = "HP LP3065")
	private WebElement hp_LapBtn;


	public WebElement getHp_LapBtn() {
		return hp_LapBtn;
	}

	public WebElement getLaptopDrp() {
		return laptopDrp;
	}

	public WebElement getLaptopExpand() {
		return laptopExpand;
	}

	public WebElement getAdd_to_cart_btn() {
		return add_to_cart_btn;
	}

	public WebElement getCartBtn() {
		return cartBtn;
	}

	public WebElement getCheckoutBtn() {
		return checkoutBtn;
	}

	public WebElement getBilling_Firstname() {
		return billing_Firstname;
	}

	public WebElement getBilling_Lastname() {
		return billing_Lastname;
	}

	public WebElement getBilling_Address() {
		return billing_Address;
	}

	public WebElement getBilling_city() {
		return billing_city;
	}

	public WebElement getBilling_postcode() {
		return billing_postcode;
	}

	public WebElement getBilling_StateDrp() {
		return billing_StateDrp;
	}

	public WebElement getBilling_ContinueBtn() {
		return billing_ContinueBtn;
	}

	public WebElement getShipping_continueBtn() {
		return shipping_continueBtn;
	}

	public WebElement getDelivery_ContinueBtn() {
		return delivery_ContinueBtn;
	}

	public WebElement getT_and_c_chk() {
		return t_and_c_chk;
	}

	public WebElement getPayment_continueBtn() {
		return payment_continueBtn;
	}

	public WebElement getConfirmOrderBtn() {
		return confirmOrderBtn;
	}

}
