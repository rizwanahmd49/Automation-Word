package com.wordpress.DDT;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.corba.se.spi.orbutil.fsm.Action;



public class Screenshot {
	WebDriver driver;

	@Test
	public void TakeScreenshot() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"D:\\eclipse-workspace\\BrowserDriver\\FirefoxDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("password");
		
		Thread.sleep(5000);
		
		WebElement button=driver.findElement(By.cssSelector("#u_0_t"));
		Actions action=new Actions(driver);
		action.moveToElement(button).click();
		
		//driver.findElement(By.cssSelector("#u_0_t")).click();
		
		System.out.println("Logged in Successfully!");
		
		String actualSmg=driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-info-sign']")).getAttribute("innerHtml");
		System.out.println(actualSmg);
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("./Screenshots/OfficeEnvironment.png"));
		
		
			

	}

}
