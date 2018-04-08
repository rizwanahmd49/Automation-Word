package com.google.gettext;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	WebDriver driver;
	
	public void launchBrowser(String browser, String url) {
		
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				
			}
			if (browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			 	driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
			}
			if(browser.equalsIgnoreCase("htmlunitDriver")||browser.equalsIgnoreCase("unitDriver")||browser.equalsIgnoreCase("html"))
			
			{
				driver=new HtmlUnitDriver();
			}
		
		
		SetUrl(url);
		}
	
	public void SetUrl(String url) {
		driver.get(url);
		
	}

}
