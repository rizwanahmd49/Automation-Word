package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGetCommand {

	WebDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RiawanA\\Desktop\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		getCommand();
	}

	public void getCommand() {
		try {
			driver.get("http://www.amazon.in");
			String titleOfThePage = driver.getTitle();
			System.out.println("The page title is: " + titleOfThePage);
			driver.findElement(By.linkText("Today's Deals")).click();
			String CurrentUrl = driver.getCurrentUrl();
			System.out.println("The current URL is :" + CurrentUrl);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

	public static void main(String[] args) {

		TestGetCommand TGC = new TestGetCommand();
		TGC.invokeBrowser();

	}

}
