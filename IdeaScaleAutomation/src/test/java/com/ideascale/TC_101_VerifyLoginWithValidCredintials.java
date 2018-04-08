package com.ideascale;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_101_VerifyLoginWithValidCredintials extends IdeaBase {

	Logger log=Logger.getLogger(TC_101_VerifyLoginWithValidCredintials.class.getClass());
	final private String browser = "chrome";
	final private String loginPageurl = "https://ideascale.com/a/login";
	final private String user = "rizwan.ahmad@ideascale.com";
	final private String password = "ideascale@123";
	IdeaHome home;

	@BeforeTest
	private void setUp() {
		try {
			init(browser, loginPageurl);
			System.out.println("Login successfull navigated to " + driver.getTitle());
		} catch (Exception e) {
			System.out.println( e.getMessage());
		}
		
	}

	@Test
	private void LoginWithValidCredintials() throws InterruptedException {

		
		driver.findElement(By.xpath("//input[@id='login-email' and @name='emailAddress' and @class='form-control']"))
				.sendKeys(user);
		driver.findElement(By.id("login-password")).sendKeys(password);
		//waitFor("/html/body/div[2]/div/div/div/div[1]/section/form/div[3]/div/div/div/span[2]", 30);
		ClickOnElement("/html/body/div[2]/div/div/div/div[1]/section/form/div[3]/div/div/div/span[2]");
		String text = driver.findElement(By.xpath("//label[@class='col-xs-6 control-label']")).getText();
		System.out.println("Clicked on => '" + text + "' button");
		driver.findElement(By.xpath("//button[@class='btn btn-primary disabled-when-loading']")).click();
		Thread.sleep(5000);
		System.out.println("Navigated to " + driver.getTitle());
		driver.findElement(By.id("utb-logo")).click();
		Assert.assertEquals("https://ideascale.com/", driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("Back to Community");
		driver.navigate().to("https://newofficeenvironment.ideascale.com/a/leaderboard");
		WebElement element=driver.findElement(By.id("period"));
		Select select=new Select(element);
		select.selectByVisibleText("June");
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	@AfterTest
	private void tearDown() throws InterruptedException {
		Thread.sleep(30000);
		driver.quit();
	}

}
