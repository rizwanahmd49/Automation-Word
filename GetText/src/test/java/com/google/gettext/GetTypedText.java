package com.google.gettext;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetTypedText extends Base{

	String browser="chrome";
	String url="https://www.google.co.in/";
	
	@BeforeTest
	void init() {
		launchBrowser(browser, url);
	System.out.println("This is SuPer: "+super.toString());
	}
	@Test
	public void GetTypedTextFromTextbox() {
	driver.findElement(By.name("q")).sendKeys("selenium");
	String text = driver.findElement(By.name("q")).getAttribute("value");
	System.out.println("Entered Text is: "+text);
	}

	@AfterTest
	void end()
	{
		driver.quit();
	}
	
	
}
