package com.ideascale;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Idea_TC_103_VerifyLomepageElements extends IdeaBase  {
	Logger log=Logger.getLogger(Idea_TC_103_VerifyLomepageElements.class.getName());
	final private String browser = "chrome";
	final private String loginPageurl = "https://ideascale.com/a/login";
	
	IdeaHome home;

	@BeforeTest
	private void setUp() {
		try {
			init(browser, loginPageurl);
			System.out.println("Login successfull navigated to " + driver.getTitle());
		} catch (Exception e) {
			System.out.println( e.getMessage());
		}
		
	}
	
	@Test
	private void verifyLoginPageElements() {
		home=new IdeaHome(driver);
		home.verifyLoginPageElements();
		
		
	}
	@AfterTest
	private void tearDown() throws InterruptedException {
		Thread.sleep(30000);
		driver.quit();
	}

}
