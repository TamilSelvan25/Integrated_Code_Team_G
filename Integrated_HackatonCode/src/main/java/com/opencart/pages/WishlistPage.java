package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.utils.BaseClass;

public class WishlistPage extends BaseClass{
	
	public WishlistPage() {
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(linkText  = "Components")
	private WebElement componentsMouseOver;

	@FindBy(linkText = "Monitors (2)")
	private WebElement monitorDrp;
	
	@FindBy(xpath  = "(//*[@data-original-title='Add to Wish List'])[1]")
	private WebElement wishlistBtn;

	@FindBy(xpath = "(//*[contains(text(),'Wish List')])[1]")
	private WebElement wishlistBtn1;
	
	@FindBy(xpath  = "//*[@data-original-title='Add to Cart']")
	private WebElement addtocartIcon;
	
	public WebElement getComponentsMouseOver() {
		return componentsMouseOver;
	}

	public WebElement getMonitorDrp() {
		return monitorDrp;
	}

	public WebElement getWishlistBtn() {
		return wishlistBtn;
	}

	public WebElement getWishlistBtn1() {
		return wishlistBtn1;
	}

	public WebElement getAddtocartIcon() {
		return addtocartIcon;
	}



}
