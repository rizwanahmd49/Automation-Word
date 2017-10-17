package autocomplete.google.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import autocomplete.google.base.Base;

public class Homepage extends Base {
	WebDriver driver;
public Homepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@id='gs_htif0']")
public WebElement txtSearch;

@FindBy (xpath="//following::input[@name='btnK']")
public WebElement btnSearch;

public void searchFor(String str) {
	txtSearch.sendKeys("selenium");
	
}


}
