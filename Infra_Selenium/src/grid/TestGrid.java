package grid;


import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestGrid {
	static WebDriver driver;
	static String nodeUrl;

	public static void main(String[] args) {
		try {
			nodeUrl = "http://192.168.8.101:5555/wd/hub";

			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
			driver.get("http://www.amazon.in");
			driver.findElement(By.linkText("Today's Deals")).click();
		} catch (MalformedURLException e) {

			e.printStackTrace();
		}

	}

}
