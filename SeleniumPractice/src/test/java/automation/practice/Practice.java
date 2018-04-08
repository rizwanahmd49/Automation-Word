package automation.practice;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {

	String url = "http://www.naukri.com/";
	WebDriver driver;
	Logger log;

	@BeforeTest
	private void setUp() {
		log = Logger.getLogger("Practice");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.gecko.driver", ".//drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		log.info("Firefox Invoked");
		driver.get(url);
		log.info("Application launched and URL is: " + url);

	}

	@Test(enabled = true, priority = 1)
	private void handleNaukriWindoPop() {
		String parantwindow = driver.getWindowHandle();
		log.info("The parent window session ID is: " + parantwindow);
		Set<String> allwin = driver.getWindowHandles();
		int count = 0;
		for (String win : allwin) {

			if (!win.equalsIgnoreCase(parantwindow)) {
				count++;
				log.info(count + " child window session ID is : " + win);
			}
		}
	}

	@Test(enabled = true, priority = 2)
	private void handleNaukriWindoPopUsingItrator() {
		String parent = driver.getWindowHandle();
		Iterator<String> ite = getAllWindows();
		while (ite.hasNext()) {
			String win = ite.next();
			if (!win.equalsIgnoreCase(parent)) {
				log.info("closing pop-up window : " + win);
				driver.switchTo().window(win);
				driver.close();
				log.info("Pop-up window closed");
			}
			driver.switchTo().window(parent);

		}
		log.info(" Focuse set to parent window: " + parent);
	}

	private Iterator<String> getAllWindows() {
		Set<String> allwindowd = driver.getWindowHandles();
		Iterator<String> it = allwindowd.iterator();
		return it;
	}

	@AfterTest
	private void tearDown() {

		driver.quit();
	}
}
