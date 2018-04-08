package com.ideascale;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IdeaHome extends IdeaBase{
	Logger log=Logger.getLogger(IdeaHome.class.getName());
	WebDriver driver;
	public  IdeaHome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="login-email")
	WebElement txtEmail;
	
	@FindBy(id="//div[@class='bootstrap-switch-container']/span[2]")
	WebElement btnStaLogIn;
	
	@FindBy(id="//button[@class='btn btn-primary disabled-when-loading']")
	WebElement btnLogin;
	
	@FindBy(id="//a[contains(@href,'signup')][2]")
	WebElement linkRegisterNow;
	
	@FindBy (id="utb-logo")
	WebElement logoIdeascale;
	
	@FindBy(xpath="//a[contains(@href,'signup')][1]")
	WebElement btnTopRegister;
	
	@FindBy(xpath="//a[contains(@href,'/a/login')]")
	WebElement btnTopLogIn;
	
	@FindBy(xpath="//*[@class='col-md-6']/h2")
	WebElement lblLogin;
	
	protected void verifyLoginPageElements() {
		log.info("Trying to Verify all element on login page\nURL: "+driver.getCurrentUrl()+"\nPage Title: "+driver.getTitle());
		log.info("Page name is: "+lblLogin.getText());
		logoIdeascale.click();
		log.info("Clicked on IdeaScale logo and object is: "+logoIdeascale.toString());
		driver.navigate().back();
		log.info("Navigated back to :"+driver.getTitle());
		btnTopRegister.click();
		log.info("Clicket on register button on TOP and object is: "+btnTopRegister.toString());
		log.info("Navigated to URL: "+driver.getCurrentUrl()+"Title: "+driver.getTitle());
		driver.navigate().back();
		log.info("Navigated back to :"+driver.getTitle());
		log.info("Clicket on 'Log in' button on TOP and object is :"+btnTopLogIn.toString());
		log.info("Navigated to URL: "+driver.getCurrentUrl()+"Title: "+driver.getTitle());
		log.info("Login page Lable text is: "+lblLogin.getText()+" and object is :"+lblLogin.toString());
		
	}
}

