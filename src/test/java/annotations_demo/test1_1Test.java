package annotations_demo;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1_1Test {
  @Test
  public void xyz() {
	  System.out.println("This is xyz from test1");
  }
  @BeforeTest
  void n() {
	  System.out.println("This is before class");
  }
  @BeforeSuite
  void a() {
	  System.out.println(" this is before suite");
  }
}
