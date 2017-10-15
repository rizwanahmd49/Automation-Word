package wait;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class ExplicitWait {
	WebDriver driver;

	@Test
	public void Login() {

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='menu-ancillary-navigation']/li[3]/a")));
driver.findElement(By.xpath(".//*[@id='menu-ancillary-navigation']/li[3]/a")).click();
	}

	@BeforeClass
	public void invokeBrowser() {
		try {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\RiawanA\\Desktop\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://ideascale.com/");

		} catch (Exception e) {
			System.out.println("Login Failed with Error:-  " + e);

		}
	}

	@AfterClass
	public void afterClass() {
	}

}
