package com.opencart.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.utils.BaseClassPage;

public class Add_to_CartPage extends BaseClassPage{
	
	public WebElement getDesktop() {
		return desktop;
	}

	public WebElement getMac() {
		return mac;
	}

	public WebElement getProductcategory() {
		return productcategory;
	}

	public WebElement getButtoncart() {
		return buttoncart;
	}
	public WebElement getLogout() {
		return logout;
	}

	
	@FindBy(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	WebElement desktop;
	@FindBy(xpath="//a[contains(text(),'Mac (1)')]")
	WebElement mac;
	@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement productcategory;
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement buttoncart;
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logout;
	
	public Add_to_CartPage() {

        PageFactory.initElements(driver, this);
    }
	
	 public void validateLoginDetails() {
     	
     	Actions act=new Actions(driver);
     	act.moveToElement(desktop).click().build().perform();
     }

}
