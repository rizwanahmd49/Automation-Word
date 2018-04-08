package Automation.checkbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxBase {

	
	protected WebDriver driver;
	protected void init(String browser,String url) {
		invokeBrowser(browser);
		setUrl(url);
		
	}
	protected void setUrl(String url) {
		driver.get(url);
		System.out.println("Browser navigated to "+url);
	}
	public void invokeBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Chrome Browser invoked");
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Firefox Browser invoked");
		}
	}
	
	protected boolean isElementSelected(WebElement element) {
		
		boolean x=element.isSelected();
		if(x==true) {
			return true;
		}else
			return false;
	}

}
