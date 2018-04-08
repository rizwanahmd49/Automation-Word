package Automation.SeleniumPractice;

import java.util.concurrent.TimeUnit;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HDBase {

 protected	WebDriver driver;

	protected void invokeBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Browser invoked implicit wait set to 30 seconds");
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Browser invoked implicit wait set to 30 seconds");
		}

	}

	protected boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	protected void invokeBrowser(String browser, String url)  {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			System.out.println("Browser invoked URL is : "+url+"\n implicit wait set to 30 seconds");
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			System.out.println("Browser invoked URL is : "+url+"\nimplicit wait set to 30 seconds");
		}

	}

	protected void setUrl(String url) {
		driver.get(url);
		System.out.println("URL is : "+url);

	}

	/**
	 * @throws EmailException
	 */
	public static void sendEmail() throws EmailException {

		System.out.println("=======Sending Email....===========");

		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");

		email.setSmtpPort(465);

		email.setAuthenticator(new DefaultAuthenticator("rizwanahmad49@gmail.com", "Azmat@123"));
		email.setSSLOnConnect(true);
		email.setFrom("farahrizwan49@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("rizwanahmad49@gmail.com");
		email.send();

	}

}
