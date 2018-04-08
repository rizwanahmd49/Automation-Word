package com.google.gettext;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.grid.web.servlet.handler.SeleniumBasedRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClickUsingActions extends Base {

	String browser = "chrome";
	String url = "https://www.google.co.in/";

	//@BeforeTest
	private void setUp() {
		launchBrowser(browser, url);
	}

	//@AfterTest
	private void tearDown() {
		driver.quit();
	}
	@Test(enabled=true)
	static public  void Print() {
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println("Print Method");
		System.out.println(Math.min(Integer.MIN_VALUE, 0.0d));
	}

	@Test(enabled =false)
	private void ClickMenuButton() throws InterruptedException, Exception {
		WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
		System.out.println("getTitle: " + driver.getTitle());
		ele.sendKeys("selenium");Thread.sleep(2000); 
	List<WebElement> elementList = driver.findElements(By.xpath("//div[@class='sbqs_c']"));
	int size=elementList.size();
	System.out.println("Size is: "+size);
	
	for(WebElement e:elementList) {
		System.out.println("Size: "+size+e.getText());
	}
	for(WebElement e:elementList) {
		//String text = e.getText();
		if(e.getText().equalsIgnoreCase("seleniumhq")) {
			e.click();
			System.out.println("clicked");
			break;
		}
	}
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./Screenshots/screen.png"));
		// Actions action=new Actions(driver);
		// action.moveT oElement(ele).click().build().perform();
		// WebElement ele1 = driver.findElement(By.xpath("//span[@class='gb_2']"));
		// action.moveToElement(ele1).click().build().perform();
		// System.out.println("Clicked on Menue button");
		Thread.sleep(5000);
	

	}}
