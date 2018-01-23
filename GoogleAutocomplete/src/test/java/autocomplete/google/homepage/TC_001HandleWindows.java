package autocomplete.google.homepage;

import java.util.Set;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import autocomplete.google.base.Base;

public class TC_001HandleWindows extends Base {

	@BeforeTest
	public void setUp() {
		init();
	}

	@Test
	public void closeChildWindow() {
		if (IsPopwindowAvailable()) {
			String parent = driver.getWindowHandle();
			Set<String> allwin = driver.getWindowHandles();
			for (String child : allwin) {
				if (!child.equalsIgnoreCase(parent)) {
					driver.switchTo().window(child);
					driver.manage().window().maximize();
					System.out.println("Child window Miximized");
				}
			}
			driver.switchTo().window(parent);
			System.out.println("Switched to parent window");

		} else {
			System.out.println("No pop-up windows");

		}
	}

	@AfterTest
	public void EntTest() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
