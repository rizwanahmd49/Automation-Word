package com.wordpress.DDT;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CSSLocator {
	WebDriver driver;

	@Test
	public void locate() throws Exception {
		try {
			System.setProperty("webdriver.chrome.driver",
					"D:\\eclipse-workspace\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://newofficeenvironment.ideascale.com/");

			driver.findElement(By.cssSelector("input#login-email")).sendKeys("username");
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys("password");

			// WebDriverWait wait=new WebDriverWait(driver, 10);
			// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("button[class^='btn']")));

			// Thread.sleep(5000);

			// WebElement
			// element=driver.findElement(By.cssSelector("button[class^='btn']"));
			// Actions action=new Actions(driver);
			// action.moveToElement(element).click().perform();

			String scrollLocation = "scroll(0,250)";

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript(scrollLocation);

			driver.findElement(By.cssSelector("button[class^='btn']")).click();

			Thread.sleep(5000);
			
			//Zoom In/Out
			driver.findElement(By.tagName("html")).sendKeys(Keys.CONTROL, Keys.SUBTRACT);
			System.out.println("Screen Zoom In");

			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/Office.png"));
			driver.close();
			driver.quit();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
