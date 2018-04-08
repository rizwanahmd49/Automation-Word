package automation.seleniumpractice;

import java.security.Key;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Automation.SeleniumPractice.HDBase;

@Test
public class TC_101_HandleNewWindow extends HDBase {

	String url="https://www.bing.com";
	String chromeBrowser="chrome";
	String firefoxBrowser="firefox";
	@BeforeTest
	private void init() {
		invokeBrowser(chromeBrowser, url);
	}

	@Test(enabled = true, alwaysRun = true)
	private void switchToLoginwindow() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("selenium");
		
		Thread.sleep(3000);
	List<WebElement> list = driver.findElements(By.xpath("//*[@id='sa_ul']/li"));
	for(WebElement e:list) {
		String text=e.getText();
		System.out.println(text);
	}
	for(int i=0;i<list.size();i++) {
		WebElement ele = list.get(i);
		String text=ele.getText();
		if(text.contains("selenium ide")) {
		ele.click();
		break;
		}
	}
	}

	@AfterTest
	private void tearDown() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}
}
