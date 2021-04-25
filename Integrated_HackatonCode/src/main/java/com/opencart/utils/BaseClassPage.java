package com.opencart.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassPage {
	
	public static Properties prop;
	public static WebDriver driver;
	public BaseClassPage() {
		prop= new Properties();
		FileInputStream file;
		try {
			file= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\opencart\\utils\\Configuration.properties");
			prop.load(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\NewChrome\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
		 System.out.println("Page title is : " + driver.getTitle());
	}
	
	public static void screenShot(String path) throws Exception {
        TakesScreenshot tk = (TakesScreenshot) driver;
        File src = tk.getScreenshotAs(OutputType.FILE);
        File des = new File(path);
        FileUtils.copyFile(src, des);
	}

}
