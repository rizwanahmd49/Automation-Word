package automation.seleniumpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGSequence {
//  @Test(dataProvider = "dp")
  public void f(String s,Integer n) {
	 System.out.println("Test");
	  System.out.println("Name: "+n+"\nNo: "+s);
	  
  }
  
  @Test
  void replaceStrig() {
	String str= "welcome To Sajjanpur";
	String strRemoveSpace=str.replace(" ", "").toLowerCase();
	System.out.println("Actual String: "+strRemoveSpace);
	int size=strRemoveSpace.length()-1;
	char ch;
	while (size>=0) {
		ch= strRemoveSpace.charAt(size);
		System.out.print(ch);
		size--;
	}
	System.out.println();
	  
	 
  }
  @Test
  void reversStringUsingArray() {
	  System.out.println("reversStringUsingArray");
	  String str=new String ("Welcome to Sajjanpur");
	  System.out.println(str.substring(1, 2));
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Rizwan", 824587653 },
      new Object[] { "Ahmad", 93 },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");
  }

}
