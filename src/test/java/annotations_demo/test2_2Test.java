package annotations_demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2_2Test {
  @Test
  public void abc() {
	  System.out.println(" This is abc");
  }
  @AfterTest
  void m() {
	  System.out.println("This is after class");
	  
  }
  @AfterSuite
  void b() {
	  System.out.println(" this is After suite");
  }
}
