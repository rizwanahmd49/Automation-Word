package automation.seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Automation.SeleniumPractice.HDBase;

public class TC_002VerifyandSendEmail extends HDBase {
	String url = "https://www.icicibank.com/";
	String actual="Personal Banking Online Banking Services - ICICI Bank";
	
	@Test
	public void TC_002VerifySendEmail() throws EmailException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		if (isAlertPresent()) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			System.out.println("Alerd Accepted");
		}
		driver.findElement(By.xpath("//*[@id='myDivAdd']/a")).click();
		driver.findElement(By.xpath("//div[@id='push-modal-content' and @class='noBg active']/div[@id='push-modal-close']")).click();
		driver.findElement(By.xpath("//span[@class='pl-login-ornage-box']")).click();
		Assert.assertEquals(actual, driver.getTitle());

	}

	@AfterMethod
	private void afterClassMethod(ITestResult result) throws EmailException {
		if (result.getStatus() == ITestResult.FAILURE) {
			HDBase.sendEmail();
		}
	}

}
