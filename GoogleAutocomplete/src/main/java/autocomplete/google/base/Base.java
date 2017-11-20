package autocomplete.google.base;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	String url = "https://www.google.co.in/";
	String urlNukri="https://www.naukri.com/";
	protected WebDriver driver;

	public void init() {
		InvokeBrowser();
		setUrl(urlNukri);
	}

	public void InvokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void setUrl(String url) {
		driver.get(url);
	}
	
	public boolean IsPopwindowAvailable() {
		Set<String> allwin = driver.getWindowHandles();
		if(allwin.size()>1) {
			System.out.println("There are "+allwin.size()+" windows");
			return true;
			}else {return false;}
		
	}
}
