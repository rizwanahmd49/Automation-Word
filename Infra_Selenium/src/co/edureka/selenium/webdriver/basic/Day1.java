package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	WebDriver driver;
	JavascriptExecutor jse;

	public void invokedriver() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\RiawanA\\Desktop\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.get("http://www.edureka.co");
			Day1 d1 = new Day1();
			d1.SearchElement();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void SearchElement() {
		try {
			driver.findElement(By.id("homeSearchBar")).sendKeys("Java");
			Thread.sleep(3000);
			driver.findElement(By.id("homeSearchBarIcon")).click();
			jse = (JavascriptExecutor) driver;
			jse.executeScript("scroll(0,600)");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		Day1 myDay = new Day1();
		myDay.invokedriver();

	}

}
