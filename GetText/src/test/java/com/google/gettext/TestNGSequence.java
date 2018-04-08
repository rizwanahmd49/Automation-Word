package com.google.gettext;

import org.testng.annotations.*;

public class TestNGSequence {

	@BeforeSuite
	void BeforeSuite() {
		System.out.println("@BeforeSuite");
	}

	@AfterSuite
	void AfterSuite() {
		System.out.println("@AfterSuite");
	}

	@BeforeClass
	void BeforeClass() {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	void AfterClass() {
		System.out.println("@AfterClass");
	}

	@BeforeTest
	void BeforeTest() {
		System.out.println("@BeforeTest");
	}

	@AfterTest(alwaysRun = true)
	void AfterTest() {
		System.out.println("@AfterTest");
	}

	@BeforeMethod
	void BeforeMethod() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	void AfterMethod() {
		System.out.println("@AfterMethod");

	}

	@Test(threadPoolSize = 3)
	void last() {
		// Assert.assertEquals(true, false);
		System.out.println("last =THIRD");
	}

	@Test(enabled = false)
	void invoke() {
		System.out.println(" invoke = SECOND");
	}

	@Test(enabled = false)
	void browse() {
		// Assert.assertEquals(true, false);
		System.out.println("browse = First");
	}

	public static void main(String args[]) {

	
	}
}
