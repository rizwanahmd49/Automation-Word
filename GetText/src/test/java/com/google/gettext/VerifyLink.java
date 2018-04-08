package com.google.gettext;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class VerifyLink extends Base {
	WebDriver driver;
	String url="https://www.google.co.in/";
	@BeforeTest
	void setUp() {
		launchBrowser("chrome", url);
		
	}
	
	@AfterTest
	void tearDown() {
		driver.quit();
	}
	@Test
	public void VerifyGmailLink() throws InterruptedException {
		
		
		System.out.println("The Homepage URL: " + driver.getCurrentUrl());

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.className("gb_P")).click();
		WebElement ele = driver.findElement(By.linkText("Gmail"));
		Actions action=new Actions(driver) ;
		action.moveToElement(ele).build().perform();
		action.click().build().perform();
		
		String Url = driver.getCurrentUrl();
		System.out.println("The Gmail URL: " + Url);
		driver.navigate().back();
		Thread.sleep(5000);
		
	}

	
	
	

}
