package com.wordpress.DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordpressLogin {
	WebDriver driver;

	@Test(dataProvider = "wordPressData")
	public void loginToWordpress(String username, String password) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RiawanA\\Desktop\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();

		Assert.assertTrue(driver.getTitle().contains("Dashboard"),
				"Login FAILED with cridential: " + username + " " + password);
		System.out.println("Title verified user is able to login Successfully with credential Username: " + username
				+ " Password: " + password);
	}

	@DataProvider(name = "wordPressData")
	public Object[][] passData() {

		ExcelDataConfig config = new ExcelDataConfig("D:\\eclipse-workspace\\DataDriven\\doc\\UserCredentials.xlsx");
		int rows=config.getRowCount(0);
		
		Object[][] data = new Object[rows][2];
		for (int i=0;i<rows;i++) {
			data[i][0] =config.getData(0, i, 0);
			data[i][0] =config.getData(0, i, 1);
			data[i][1] = "demo1";
		}
		
		return data;
	}

	@AfterMethod
	public void QuitBrowser() {
		driver.quit();
	}

}
