package co.edureka.selenium.webdriver.basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class IdeaScale {

	WebDriver driver;

	@BeforeClass
	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RiawanA\\Desktop\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
	public void communityLogin() {
		driver.get("https://newofficeenvironment.ideascale.com/");
				//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
		driver.findElement(By.id("community-login-link")).click();
		driver.findElement(By.id("login-email")).sendKeys("rizwan.ahmad@ideascale.com");
		driver.findElement(By.id("login-password")).sendKeys("ideascale@123");
		driver.findElement(By.xpath(".//*[@id='main-content']/div/article/div[2]/div/form/div[4]/button")).click();
	}

	@Test(priority =2)
	public void homepage() {
		
			driver.findElement(By.xpath(".//*[@id='utb-profile-dropdown']/a/div[2]")).click();
			
			driver.findElement(By.xpath(".//*[@id='utb-user-menu']/ul/li[1]/a")).click();
			driver.navigate().back();
			driver.findElement(By.xpath(".//*[@id='utb-user-menu']/ul/li[2]/a")).click();
			driver.navigate().back();
			driver.findElement(By.xpath(".//*[@id='utb-user-menu']/ul/li[3]/a")).click();
			driver.navigate().back();
			driver.findElement(By.xpath(".//*[@id='utb-user-menu']/ul/li[4]/a")).click();
			driver.navigate().back();
			driver.findElement(By.xpath(".//*[@id='utb-user-menu']/ul/li[6]/a")).click();
			driver.navigate().back();
			driver.findElement(By.xpath(".//*[@id='utb-user-menu']/ul/li[7]/a")).click();
			driver.navigate().back();
			driver.findElement(By.xpath(".//*[@id='utb-user-menu']/ul/li[8]/a")).click();
			driver.navigate().back();
			driver.findElement(By.xpath(".//*[@id='utb-user-menu']/ul/li[9]/a")).click();
			driver.navigate().back();
		

	}

	@AfterClass
	public void logout() {
		driver.findElement(By.xpath(".//*[@id='utb-profile-dropdown']/a/div[2]")).click();
		driver.findElement(By.xpath(".//*[@id='utb-user-menu']/ul/li[11]/a")).click();

		driver.quit();
	}

}
