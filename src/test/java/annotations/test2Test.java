package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test2Test {
@BeforeClass
void login() {
	System.out.println("login");
}
  @Test
  public void search() {
	  System.out.println("search");
  }
  @Test
  public void Advsearch() {
	  System.out.println("Advanced search");
  }
  @AfterClass
  void logout() {
	  System.out.println("logout");
  }
  
}

