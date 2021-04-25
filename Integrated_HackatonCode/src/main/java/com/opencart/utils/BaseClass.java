package com.opencart.utils;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public Properties prop;

	public WebDriver launchBrowser() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\opencart\\utils\\constant.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\Downloads\\NewChrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		} else if (browsername.equals("chrome")) {

		}
		return driver;
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void max() {
		driver.manage().window().maximize();
	}

	public static void fill(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void screenShot(String path) throws Exception {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src, des);
	}

	public static void btnClick(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", e);
		// e.click();
	}

	public static void date(WebElement e, String value) {
		e.sendKeys(value);

	}

	public static void selectValue(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByValue(value);
	}

	public static void selectIndex(WebElement e, int value) {
		Select s = new Select(e);
		s.selectByIndex(value);
	}

	public static void selectText(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByVisibleText(value);
	}

	public static void deselectValue(WebElement e, String value) {
		Select s = new Select(e);
		s.deselectByValue(value);
	}

	public static void deselectText(WebElement e, String value) {
		Select s = new Select(e);
		s.deselectByVisibleText(value);
	}

	public static void deselectIndex(WebElement e, int value) {
		Select s = new Select(e);
		s.deselectByIndex(value);
	}

	public static void deselectAll(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();
	}

	public static void allSelected(WebElement e) {
		Select s = new Select(e);
		s.getAllSelectedOptions();
	}

	public static void firstSelected(WebElement e) {
		Select s = new Select(e);
		s.getFirstSelectedOption();
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static void simpleAlert() {
		Alert sa = driver.switchTo().alert();
		String t = sa.getText();
		System.out.println(t);
		sa.accept();
	}

	public static void confirmAccept() {
		Alert ca = driver.switchTo().alert();
		String t = ca.getText();
		System.out.println(t);
		ca.accept();
	}

	public static void confirmDismiss() {
		Alert cd = driver.switchTo().alert();
		String t = cd.getText();
		System.out.println(t);
		cd.dismiss();
	}

	public static void promptAccept() {
		Alert pa = driver.switchTo().alert();
		String t = pa.getText();
		System.out.println(t);
		pa.sendKeys("yes");
		pa.accept();
	}

	public static void promptDismiss() {
		Alert pd = driver.switchTo().alert();
		String t = pd.getText();
		System.out.println(t);
		pd.sendKeys("no");
		pd.accept();
	}

	public static void scrollDown(WebElement d) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", d);
	}

	public static void scrollUp(WebElement u) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", u);
	}

	public static void getText(WebElement t) {
		String text = t.getText();
		System.out.println(text);
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void framesCount() {
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int f = frames.size();
		System.out.println(f);
	}

	public static void linksCount() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int l = links.size();
		System.out.println(l);
	}

	public static void imagesCount() {
		List<WebElement> img = driver.findElements(By.tagName("img"));
		int i = img.size();
		System.out.println(i);
	}

	public static void frameId(String id) {
		driver.switchTo().frame(id);
	}

	public static void frameName(String name) {
		driver.switchTo().frame(name);
	}

	public static void frameIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void frameWebelement(WebElement e) {
		driver.switchTo().frame(e);
	}

	public static void jsInsert(WebElement e, String s) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','s')", e);
	}

	public static void jsGet(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object obj = js.executeScript("return arguments[0].getAttribute('value')", e);
		String s = (String) obj;
		System.out.println(s);

	}

	public static void move(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();

	}

	public static void drag(WebElement e, WebElement e1) {
		Actions a = new Actions(driver);
		a.dragAndDrop(e, e1).perform();

	}

	public static void doubleClick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();
	}

	public static void rightClick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e);
	}

	public static void enter() throws Exception {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void control() throws Exception {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void shift() throws Exception {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);
	}

	public static void alt() throws Exception {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_ALT);
	}

	public static void tab() throws Exception {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void xRobot() throws Exception {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
	}

	public static void cRobot() throws Exception {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void vRobot() throws Exception {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
	}

	public static void escape() throws Exception {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}

	public static void getData1() throws Exception {

		// Create an object of File class to open xlsx file
		File file = new File("E:\\TestData\\TestData.xls");

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// Creating workbook instance that refers to .xls file
		HSSFWorkbook wb = new HSSFWorkbook(inputStream);

		// Creating a Sheet object using the sheet Name
		HSSFSheet sheet = wb.getSheet("STUDENT_DATA");

		// Create a row object to retrieve row at index 1
		HSSFRow row2 = sheet.getRow(1);

		// Create a cell object to retreive cell at index 5
		HSSFCell cell = row2.getCell(5);

		// Get the address in a variable
		String address = cell.getStringCellValue();

		// Printing the address
		System.out.println("Address is :" + address);
	}

	public static String getData(int row, int cell) throws Throwable {
		File loc = new File(System.getProperty("user.dir") + "\\OpenCart.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		String v = null;
		Row r1 = s.getRow(row);
		Cell c1 = r1.getCell(cell);
		CellType type = c1.getCellType();
		System.out.println(type);
		if (type == CellType.STRING) {
			v = c1.getStringCellValue();

		} else if (type == CellType.NUMERIC) {
			if (DateUtil.isCellDateFormatted(c1)) {
				Date d = c1.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yy");
				v = sim.format(d);
			}

			else {

				double n = c1.getNumericCellValue();
				long l = (long) n;
				v = String.valueOf(l);

			}

		}
		return v;
	}

}
