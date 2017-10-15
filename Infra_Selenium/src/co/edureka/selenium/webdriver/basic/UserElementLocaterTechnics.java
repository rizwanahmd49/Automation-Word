package co.edureka.selenium.webdriver.basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserElementLocaterTechnics {

	WebDriver driver;

	public void invokeBrowser(String url) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\RiawanA\\Desktop\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void amazonElementLocatorTechnicUsing() {
		try {
			invokeBrowser("http://www.amazon.in");
			driver.findElement(By.className("nav-input")).sendKeys("Lenovo Laptop");
			driver.findElement(By.className("nav-input")).click();
			driver.navigate().to("http://www.amazon.in/Men-Watches/b/ref=nav_shopall_sbc_mfashion_watches?ie=UTF8&node=2563504031");
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public void facebookElementLocatorTechnicUsing() {
		try {
			invokeBrowser("http://www.facebook.com");
			//driver.findElement(By.name("firstname")).sendKeys("Rizwan");
			driver.findElement(By.name("lastname")).sendKeys("Ahmad");
			driver.findElement(By.cssSelector("input#u_0_2")).sendKeys("Azmat");
			driver.findElement(By.cssSelector("input.inputtext")).sendKeys("rizwan@gmail.com");
			driver.findElement(By.name("websubmit")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void elementLocatorUsingXpath() {
		try {
			invokeBrowser("http://www.amazon.in");
			driver.findElement(By.xpath("//div[@id='nav-tools']/a[@id='nav-link-yourAccount']/span[1]")).click();
			driver.navigate().back();
			driver.findElement(By.xpath(".//*[@id='nav-swm-holiday-map']/area")).click();
			driver.quit();
			invokeBrowser("http://www.flipkart.com");
			driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[4]/a")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		UserElementLocaterTechnics obj = new UserElementLocaterTechnics();
		obj.elementLocatorUsingXpath();

	}

}
