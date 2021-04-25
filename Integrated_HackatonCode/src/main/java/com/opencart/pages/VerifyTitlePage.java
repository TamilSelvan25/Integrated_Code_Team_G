package com.opencart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyTitlePage {

	

	WebDriver driver;
	@Test
	
	public void verifyPagetitle() {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavani\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
	
	         driver.get("https://demo.opencart.com");
	         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	         System.out.println(driver.getTitle());
	         driver.quit();
}
}



