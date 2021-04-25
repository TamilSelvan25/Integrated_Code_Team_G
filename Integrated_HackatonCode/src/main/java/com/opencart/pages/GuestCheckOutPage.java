package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GuestCheckOutPage extends Add_to_CartPage {
	
	public WebElement getLaptopandnotebook() {
		return laptopandnotebook;
	}
	public WebElement getShowall() {
		return showall;
	}
	public WebElement getProductcategory() {
		return productcategory;
	}
	public WebElement getDatechange() {
		return datechange;
	}
	public WebElement getButtoncart() {
		return buttoncart;
	}
	public WebElement getItembasket() {
		return itembasket;
	}
	public WebElement getCheckoutbtn() {
		return checkoutbtn;
	}
	public WebElement getGuestCheckout() {
		return GuestCheckout;
	}
	public WebElement getContinuebtn() {
		return continuebtn;
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
	public WebElement getTelephonenumber() {
		return telephonenumber;
	}
	public WebElement getCompanyname() {
		return companyname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getAddress2() {
		return address2;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getContinuebtn2() {
		return continuebtn2;
	}
	public WebElement getRadiobtn() {
		return radiobtn;
	}
	public WebElement getTextarea() {
		return textarea;
	}
	public WebElement getShippingbtn() {
		return shippingbtn;
	}
	public WebElement getCashondeliver() {
		return cashondeliver;
	}
	public WebElement getPaymentComment() {
		return PaymentComment;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getPaymentbtn() {
		return paymentbtn;
	}
	public WebElement getBtnconform() {
		return btnconform;
	}

	
	@FindBy(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	WebElement laptopandnotebook;
	@FindBy(xpath="//a[contains(text(),'Show All Laptops & Notebooks')]")
	WebElement showall;
	@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement productcategory;
	@FindBy(xpath="//input[@id='input-option225']")
	WebElement datechange;
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement buttoncart;
	@FindBy(xpath="//header/div[1]/div[1]/div[3]/div[1]/button[1]")
	WebElement itembasket;
	@FindBy(xpath="//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[2]/strong[1]")
	WebElement checkoutbtn;
    @FindBy(xpath="//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]")
    private WebElement GuestCheckout;
	@FindBy(xpath="//input[@id='button-account']")
    WebElement continuebtn;
	@FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement firstname;
	@FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement lastname;
	@FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement email;
	@FindBy(xpath="//input[@id='input-payment-telephone']")
	WebElement telephonenumber;
	@FindBy(xpath="//input[@id='input-payment-company']")
	WebElement companyname;
	@FindBy(xpath="//input[@id='input-payment-address-1']")
	WebElement address;
	@FindBy(xpath="//input[@id='input-payment-address-2']")
	WebElement address2;
	@FindBy(xpath="//input[@id='input-payment-city']")
	WebElement city;
	@FindBy(xpath="//select[@id='input-payment-country']")
	WebElement country;
	@FindBy(xpath="//select[@id='input-payment-zone']")
	WebElement state;
	@FindBy(xpath="//input[@id='button-guest']")
	WebElement continuebtn2;
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]")
	WebElement radiobtn;
	@FindBy(xpath="//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/p[4]/textarea[1]")
	WebElement textarea;
	@FindBy(xpath="//input[@id='button-shipping-method']")
	WebElement shippingbtn;
	@FindBy(xpath="//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/label[1]/input[1]")
	WebElement cashondeliver;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/p[3]/textarea[1]")
    WebElement PaymentComment;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/input[1]")
	WebElement checkbox;
	@FindBy(xpath="//input[@id='button-payment-method']")
	WebElement paymentbtn;
	@FindBy(xpath="//input[@id='button-confirm']")
	WebElement btnconform;
	
	
	
public void moveHovering() {
     	
     	Actions act=new Actions(driver);
     	act.moveToElement(laptopandnotebook).click().build().perform();
     }
	

}
