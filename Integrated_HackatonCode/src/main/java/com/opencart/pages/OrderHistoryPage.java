package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryPage extends LoginPage{
	public String path="C:\\Users\\jayanth\\eclipse-workspace\\Hackaton_Team-G\\Hackaton_Team-G\\ScreenShot";
	
	public WebElement getMyaccount() {
		return myaccount;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myaccount;
	@FindBy(xpath="//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	WebElement btnlogin;
	
	@FindBy(xpath = "(//a[text()='Order History'])[3]")
    WebElement orderHistory;
    @FindBy(xpath = "//i[@class='fa fa-eye']")
    WebElement view;

 

    public OrderHistoryPage() {
        
        PageFactory.initElements(driver, this);
    }
    
    public void orderHistoryView() throws Exception {
        
        orderHistory.click();
        view.click();
        screenShot(path+"\\View.jpeg");
    }
	

}
