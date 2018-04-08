package com.ideascale;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IdeaBase {

	protected  WebDriver driver;

	private void invokeBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("htmlunitDriver") || browser.equalsIgnoreCase("unitDriver")
				|| browser.equalsIgnoreCase("html"))

		{
			driver = new HtmlUnitDriver();
		} else {
			System.out.println("Invalid driver selection " + " '" + browser + "'"
					+ " is not a valid driver\nYou should choose \nchrome\nfirefox \nie");
		}

	}

	protected void waitFor(String xpath,int timeinSecond) {
		WebDriverWait wait= new WebDriverWait(driver, timeinSecond);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
	}
	protected void ClickOnElement(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		;
	}

	public void setUrl(String url) {
		driver.get(url);
	}

	public void init(String browser, String url) {
		invokeBrowser(browser);
		setUrl(url);
		PropertyConfigurator.configure("./log4j.properties");
	}
}
