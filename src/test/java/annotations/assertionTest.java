package annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionTest {
  @Test
  public void abc() {
	  int a=10;
	  int b=20;
	  if(a>b) {
		  System.out.println("passed");
	  }
	  else {
		  System.out.println("failed");
	  }
	  Assert.assertEquals(a,b);
	  //Assert.assertEquals(true);
	 // Assert.assertEquals(false);
  }
}
