package co.edureka.selenium.webdriver.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver driver;
	
	@Test
	public void login() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse-workspace\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		
//		int x=driver.findElement(By.xpath("//input[@id='u_0_t']")).getLocation().getX();
//		int y=driver.findElement(By.xpath("//input[@id='u_0_t']")).getLocation().getY();
		
		List<WebElement>button=driver.findElements(By.id("u_0_t"));
		int count=button.size();
		System.out.println("Total Buttons are: "+count);
		
		for (int i=0;i<count;i++) {
			
			int x=button.get(i).getLocation().getY();
			if(x!=0) {
				button.get(i).click();
				System.out.println("Inside IF");
			}
			System.out.println("outside IF");
		}
		
		
		driver.close();driver.quit();
	}

}
