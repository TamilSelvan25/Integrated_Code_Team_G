package com.opencart.prallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrallelExecution {
	
@Test 
    public void verifyparallel() {
            WebDriver driver1;
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayanth\\Downloads\\chromedriver_win32\\chromedriver.exe");
             driver1= new ChromeDriver();
             driver1.manage().window().maximize();
             driver1.get("https://demo.opencart.com/");
             Reporter.log("lumens website is opened");
             
        }
    
@Test
public void verifyparallel1() {
        WebDriver driver1;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayanth\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver1= new ChromeDriver();
         driver1.manage().window().maximize();
         driver1.get("https://www.google.com");
         Reporter.log("google website is opened");
         
    }

}
