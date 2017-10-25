package com.window.naukri.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.window.naukri.base.NukBase;


public class Homepage extends NukBase {
	
	WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath="//a[@id='login_Layer']")
	WebElement ImgLogin;
	
	@FindBy(xpath="//input[@id='eLogin']")
	WebElement txtEmailId;
	
	@FindBy(xpath="//input[@id='pLogin']")
	WebElement txtPass;
	
	@FindBy(xpath="//form[@id='lgnFrm']/div[8]/button")
	WebElement btnLogin;
	
	public void logintoNaukri(String userid,String password)
	{
		ImgLogin.click();
		txtEmailId.sendKeys(userid);
		txtPass.sendKeys(password);
		btnLogin.click();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
