package automation.seleniumpractice;

import org.testng.annotations.Test;

import Automation.SeleniumPractice.HDBase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;

public class Irctc extends HDBase {
	String browser = "chrome";
	String url = "https://www.irctc.co.in";

	@Test(dataProvider = "dp")
	public void IrctcLogin(String username, String password) throws InterruptedException {
		driver.findElement(By.id("usernameId")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='j_password']")).sendKeys(password + Keys.TAB);
		Thread.sleep(8000);
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.id("jpform:fromStation")).sendKeys("KALYAN JN - KYN" + Keys.TAB);
		driver.findElement(By.id("jpform:toStation")).sendKeys("ALLAHABAD JN - ALD"+Keys.TAB);
		driver.findElement(By.xpath("//*[@id='jpform']/table/tbody/tr[5]/td[2]/img")).click();
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[7]/a")).click();
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "rijwan49", "irctc" },
				// new Object[] { 2, "b" },
		};
	}

	@BeforeTest
	public void beforeTest() {
		invokeBrowser(browser, url);

	}

	@AfterTest
	public void afterTest() {
	}

}
