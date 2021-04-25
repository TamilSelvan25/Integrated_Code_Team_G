package com.opencart.utils;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass_R {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriver Launchbrowser() throws IOException {
		prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\opencart\\utils\\Propertyfile.properties");
	prop.load(file);
	String Browsername = prop.getProperty("browser");
	if(Browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\NewChrome\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	return driver;
	
	}
	
	public static void geturl(String url) {
		driver.get(url);
	}
	public static void fill(WebElement w,String value) {
		w.sendKeys(value);
	}
	public static void buttonclick(WebElement Element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",Element);
	}
	public static void move(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public static void enter() throws Exception {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void screenShot(String path) throws Exception {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src, des);
	}


}



