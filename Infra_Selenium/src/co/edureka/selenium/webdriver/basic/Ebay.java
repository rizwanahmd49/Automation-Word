package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Ebay {

	WebDriver driver;
	Screen myScreen;

	public void invokeBrowser(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RiawanA\\Desktop\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(url);

	}
	
	public void SelectMotor(String url) {
		
		try {
			invokeBrowser(url);
			
			Pattern userID = new Pattern("C:\\Users\\RiawanA\\Desktop\\Selenium Webdriver\\Images\\txtEmail.png");
			Pattern userpassword = new Pattern("C:\\Users\\RiawanA\\Desktop\\Selenium Webdriver\\Images\\txtPass.png");
			Pattern loginButton = new Pattern("C:\\Users\\RiawanA\\Desktop\\Selenium Webdriver\\Images\\btnLogin.png");
			myScreen = new Screen();
			myScreen.wait(userID, 3);
			myScreen.type(userID, "azmatrizwan@yahoo.com");
			myScreen.type(userpassword, "azmat@123");
			myScreen.click(loginButton);
			
			
		} catch (FindFailed e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		Ebay obj=new Ebay();
		obj.SelectMotor("http://www.ebay.com");

	}

}
