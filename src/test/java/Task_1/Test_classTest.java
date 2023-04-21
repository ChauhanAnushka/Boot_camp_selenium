package Task_1;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.normalApproach;

public class Test_classTest extends POM_Class{
	
	
  @Test(priority=1)
  public void createAccount() throws InterruptedException {
	  
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   setUsername("standard_user");
	   setPassword("secret_sauce");
	  button();
	 Assert.assertTrue(logoDisplayed());
     }
   @Test(priority=2)
  public void create() {
	 setUsername("Admin");
	 setPassword("secret_sauce");
	 button();
	 Assert.assertTrue(errorDisplayed());
  }
  @Test(priority=3)
  public void Account() {
	setUsername("standard_user");
    setPassword("Admin");
    button();
    Assert.assertTrue(errorDisplayed());
  }
  @Test(priority=4)
  public void cAccount() {
    button();
    Assert.assertTrue(errorDisplayed());
  }
  @Test(priority=5)
  public void createA() {
	setPassword("secret_sauce"); 
    button();
    Assert.assertTrue(errorDisplayed());
  }
  @Test(priority=6)
  public void createAcc() {
	 setUsername("standard_user"); 
     button();
    Assert.assertTrue(errorDisplayed());
  }
  @Test(priority=7)
  public void createe() {
		 setUsername("locked_out_user");
		 setPassword("secret_sauce");
		 button();
		 Assert.assertTrue(errorDisplayed());
	  }
  @Test(priority=8)
  public void created() {
		 setUsername("problem_user");
		 setPassword("secret_sauce");
		 button();
		 Assert.assertTrue(logoDisplayed());
	  }
  @Test(priority=9)
  public void createdd() {
		 setUsername("performance_glitch_user");
		 setPassword("secret_sauce");
		 button();
		 Assert.assertTrue(logoDisplayed());
	  }
}