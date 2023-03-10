package annotations;

import org.testng.annotations.Test;

public class groupingTest {
  @Test(priority=1,groups= {"sanity","regression"})
  public void login() {
	  System.out.println(" login by email");
  }
  @Test(priority=2,groups= {"sanity"})
  public void loginByFacebook() {
	  System.out.println(" login by facebook");
  }
  @Test(priority=3,groups= {"sanity"})
  public void loginByTwitter() {
	  System.out.println(" login by twitter");
  }
}
