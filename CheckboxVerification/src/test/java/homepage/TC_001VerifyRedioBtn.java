package homepage;

import org.testng.annotations.Test;

import Automation.actions.HomePage;
import Automation.checkbox.CheckboxBase;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class TC_001VerifyRedioBtn extends CheckboxBase {
	String browser = "chrome";
	String url = "http://seleniumpractise.blogspot.in/";
	HomePage home;

	@Test
	public void verifyRedioButton() {
		 WebElement radiobtn= driver.findElement(By.xpath("//input[@id='male' and @type='radio']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", radiobtn);
		home=new HomePage(driver);
		if (isElementSelected(home.maleRedioBtn)) {
			System.out.println(" Radio button is selected");
		} else {
			System.out.println("Radio button is not selected");
		}
	}

	@BeforeTest
	public void beforeTest() {
		init(browser, url);
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}

}
