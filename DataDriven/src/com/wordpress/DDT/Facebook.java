package com.wordpress.DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver driver;
	
	@Test
	public void login() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse-workspace\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
//		int ok_size=driver.findElements(By.xpath("//input[value='Log In']")).size();
//
//		driver.findElements(By.xpath("//button[value='Log In']")).get(ok_size-1).click();
		
		driver.findElement(By.xpath("//input[@id='u_0_t']")).click();
		Thread.sleep(5000);
		driver.close();driver.quit();
	}

}
