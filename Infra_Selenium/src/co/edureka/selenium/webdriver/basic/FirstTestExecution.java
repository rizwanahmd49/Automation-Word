package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public final class FirstTestExecution {

	WebDriver driver;
	Screen myscreen;

	public void invokeBrowser(String url) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\RiawanA\\Desktop\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void findElements() {

		try {
			invokeBrowser("http://www.facebook.com");

			driver.findElement(By.id("email")).sendKeys("azmatrizwan@yahoo.com");
			driver.findElement(By.name("pass")).sendKeys("azmat@123");

			Pattern loginBtn = new Pattern("C:\\Users\\RiawanA\\Desktop\\Selenium Webdriver\\Images\\btnLogin.png");
			
			myscreen=new Screen();
			
			myscreen.click(loginBtn);
					

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		FirstTestExecution obj = new FirstTestExecution();
		obj.findElements();

	}

}
