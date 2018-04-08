package Automation.actions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Automation.checkbox.CheckboxBase;

public class HomePage extends CheckboxBase {
WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	
	

	@FindBy(xpath="//input[@id='male' and @type='radio']")
	public WebElement maleRedioBtn;
	
	
}
