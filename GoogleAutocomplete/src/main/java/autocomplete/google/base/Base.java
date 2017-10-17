package autocomplete.google.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Base {
	String url = "https://www.google.co.in/";
	WebDriver driver;

	public void init() {
		InvokeBrowser();
		setUrl(url);
	}

	public void InvokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void setUrl(String url) {
		driver.get(url);
	}
}
