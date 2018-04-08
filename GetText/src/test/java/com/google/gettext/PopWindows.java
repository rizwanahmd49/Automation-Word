package com.google.gettext;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PopWindows {

	@Test
	public void ClosePopWindows() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver("webdriver.gecko.driver","./drivers/geckodriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		String parent=		driver.getWindowHandle();
		 Set<String> child = driver.getWindowHandles();
		 
		 for(String ch:child) {
			 if(!ch.contains(parent)) {
				 driver.switchTo().window(ch);
				 driver.close();
			 }
		 }
		 driver.switchTo().window(parent);
		 driver.findElement(By.xpath("//div/ul[@class='midSec menu']/li[6]/a")).click();
	}

}
