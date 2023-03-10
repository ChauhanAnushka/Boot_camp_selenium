package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class assign29_1Test {
   WebDriver driver;
  @BeforeClass
  public void nav() {
  driver=new ChromeDriver(); 
  driver.manage().window().maximize();
  driver.get("http://www.fb.com");  
  }
  @Test(priority=1)
  public void verify() {
	String actual="https://www.facebook.com/ ";
	String expected= driver.getCurrentUrl();
	  Assert.assertEquals(actual,expected);
  }
  @Test(priority=2)
  public void createAccount() {
	  boolean button=driver.findElement(By.xpath("//*[@id=\"u_0_0_3N\"]")).isDisplayed();
	  System.out.println(button);
	  driver.findElement(By.xpath("//*[@id=\"u_0_0_3N\"]")).click();
  }
  @Test(priority=3)
  public void textbox() {
	 //first name
	 driver.findElement(By.xpath("//*[@id=\"u_i_b_Co\"] ")).sendKeys("Anushka");
	 //Surname
	 driver.findElement(By.name("Surname")).sendKeys("Chauhan");
	 //Phone number
	 driver.findElement(By.xpath("//*[@id=\"u_i_f_G+\"]/div[1]/div")).sendKeys("9876580105");
	 //Password
	 driver.findElement(By.name("New password")).sendKeys("abc@123");
  }
  @Test(priority=4)
  public void DOB() {
	  //Day
	  Select s=new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
	  s.selectByValue("5");
	  //Month
	  Select s1=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
	  s.selectByValue("Sep");
	  //Year
	  Select s2=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
	  s.selectByValue("2002");
	  
	  
	  //gender
	  driver.findElement(By.xpath("//*[@id=\"u_i_o_2C\"]/span[1]/label")).click();
	  //Sign UP
	  driver.findElement(By.xpath("//*[@id=\"pageTitle\"]")).click();
  }
  //Verifying that the account has been created successfully
  @Test(priority=5)
  public void accCreated() {
	  Assert.assertNotEquals(driver.getTitle(),"Facebook – log in or sign up"); 
	  System.out.println("Account created message is displayed on the home page!!!");
  }
  @AfterClass
  public void close() {
	 driver.close();
  }
  
}
