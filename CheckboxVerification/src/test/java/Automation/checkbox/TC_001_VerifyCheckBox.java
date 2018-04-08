package Automation.checkbox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_001_VerifyCheckBox extends CheckboxBase{

	String browser="chrome";
	String url="http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html";
	String checkboxId="sing";
	@BeforeTest
	private void setUp() {
		init(browser, url);
	}
	@Test
	private void VerifyCheckbox() {
		WebElement ele=driver.findElement(By.id(checkboxId));
		if(isElementSelected(ele)) {
			System.out.println("Radio button is checked");
		}else {
			System.out.println("Radio button is not checked");
		}
	}
	@AfterTest
	private void tearDown() {
		driver.quit();
		System.out.println("Browser closed");
	}
}
