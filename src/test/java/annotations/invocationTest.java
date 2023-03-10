package annotations;

import org.testng.annotations.Test;

public class invocationTest {
  @Test(invocationCount=10)
  public void test() {
	  System.out.println("testing..");
  }
}
