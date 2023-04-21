package Framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTest {
   
    	@Test(priority=1)
   	  public void createAccount() throws InterruptedException  {
   		  Login l=new Login();
   		  l.browser();
   		  l.setUsername("standard_user");
   		  l.setPassword("secret_sauce");
   		  l.button();
   		 Assert.assertTrue(l.logoDisplayed());
   	     }
    	@Test(priority=2)
 
   	  public void create() throws InterruptedException {
   		Login l=new Login();
   	    l.browser();
   		l.setUsername("Admin");
   		l.setPassword("secret_sauce");
   		l.button();
   		Assert.assertTrue(l.errorDisplayed());
   	  }
    	@Test(priority=3)

   	  public void Account() throws InterruptedException {
   		Login l=new Login(); 
   	    l.browser();
   		l.setUsername("standard_user");
   	    l.setPassword("Admin");
   	    l.button();
   	    Assert.assertTrue(l.errorDisplayed());
   	  }
    	@Test(priority=4)

   	  public void cAccount() throws InterruptedException {
   		Login l=new Login();
   	    l.browser();
   	    l.button();
   	    Assert.assertTrue(l.errorDisplayed());
   	  }
    	@Test(priority=5)

   	  public void createA() throws InterruptedException {
   		Login l=new Login();
   	    l.browser();
   		l.setPassword("secret_sauce"); 
   	    l.button();
   	    Assert.assertTrue(l.errorDisplayed());
   	  }
    	@Test(priority=6)

   	  public void createAcc() throws InterruptedException {
   		Login l=new Login();
   	     l.browser();
   		 l.setUsername("standard_user"); 
   	     l.button();
   	    Assert.assertTrue(l.errorDisplayed());
   	  }
    	@Test(priority=7)

   	  public void createe() throws InterruptedException {
   		Login l=new Login();
   	         l.browser();
   			 l.setUsername("locked_out_user");
   			 l.setPassword("secret_sauce");
   			 l.button();
   			 Assert.assertTrue(l.errorDisplayed());
   		  }
    	@Test(priority=8)

   	  public void created() throws InterruptedException {
   		Login l=new Login();
   	         l.browser();
   			 l.setUsername("problem_user");
   			 l.setPassword("secret_sauce");
   			 l.button();
   			 Assert.assertTrue(l.logoDisplayed());
   		  }
    	@Test(priority=9)

   	  public void createdd() throws InterruptedException {
   		Login l=new Login();
   	         l.browser();
   			 l.setUsername("performance_glitch_user");
   			 l.setPassword("secret_sauce");
   			 l.button();
   			 Assert.assertTrue(l.logoDisplayed());
   		  }	
    }
	

