package com.window.naukri;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.window.naukri.base.NukBase;
import com.window.naukri.pages.Homepage;

public class TC_1001VerifyLogin extends NukBase {
	
	String url="https://www.naukri.com/";
	Homepage home;
	String userid="rizwanahmad49@gmail.com";
	String password ="azmat@123";
	
	@BeforeTest
	public void init() {
		home=new Homepage(driver);
		invokeBrowser();
		setURL(url);
	}
	@Test
	public void VerifyLogin() {
		home.logintoNaukri(userid, password);
	}

	@AfterTest
	public void End() {
		driver.quit();
	}
}
