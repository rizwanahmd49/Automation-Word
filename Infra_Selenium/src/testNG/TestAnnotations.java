package testNG;
 
import org.testng.annotations.*;


public class TestAnnotations {
  @Test
  public void f1() {
	  System.out.println("f1");
  }
  @Test
  public void f2() {
	  System.out.println("f2");
  }
  @BeforeTest
  public void beforeAnyTest() {
	System.out.println("beforeAnyTest");  
  }
  @AfterTest
  public void afterAlltheTests() {
	System.out.println("afterAlltheTests");  
  }
  @BeforeMethod
  public void beforeEveryMethod() {
	  System.out.println("beforeEveryMethod");
  }
  
  @AfterMethod
  public void afterEveryMethod() {
	System.out.println("afterEveryMethod");  
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
	  
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
	  
  }
  
  
  
}
