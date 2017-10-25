package autocomplete.google.homepage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import autocomplete.google.base.Base;
import autocomplete.google.page.Homepage;

public class  TC_002VerifyAutoSearch extends Base {

	Homepage home;
	@BeforeTest
	private void setUP() {
		
		init();
	}
	@Test
	public void searchForSelenium() {
		home= new Homepage(driver);
		home.searchFor("selenium");
		List<WebElement> li = driver.findElements(By.xpath("//div[@id='sbtc']//following::li"));
		for(WebElement e: li) {
			System.out.println(	e.getText());
			}
		for(WebElement e:li) {
			if(e.getText().contains("selenium webdriver")) {
				
				e.click();
				break;
			}
		}
	}
	
	@AfterClass
	public void EndTest() {
		driver.quit();
	}
	
}
