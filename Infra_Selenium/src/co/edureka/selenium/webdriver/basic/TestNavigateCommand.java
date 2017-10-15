package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNavigateCommand {

	WebDriver driver;

	public void invokeBrowser(String url) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RiawanA\\Desktop\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(url);
	}

	public void NavigateCommand() {
		try {
			invokeBrowser("http://www.amazon.in");
			//driver.navigate().to("http://www.amazon.com");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Laptop");
			driver.findElement(By.className("nav-input")).click();
			driver.navigate().back();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

	public static void main(String[] args) {

		TestNavigateCommand obj = new TestNavigateCommand();
		obj.NavigateCommand();
	}

}
