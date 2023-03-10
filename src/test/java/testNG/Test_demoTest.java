package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test_demoTest {
	WebDriver driver=new ChromeDriver();
	WebDriver mywait=(WebDriver) new WebDriverWait(driver,Duration.ofSeconds(10));
	
  @Test(priority=1)
  
  public void openapp() 
  {
	driver.get("https://www.orangehrm.com");
		  
  } @Test(priority=2)
  
  public void login() 
 
  {
	  
	  driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
	  String str1=driver.getTitle();
	  System.out.println(str1);
		
		driver.findElement(By.name("Your Full Name ")).sendKeys("Anushka");
		driver.findElement(By.name("Business Email ")).sendKeys("abc@gmail.com");
		driver.findElements(By.xpath("//input[@id='Form_getForm_action_submitForm']"));
	  
  } @Test(priority=3)
  
  
 public void closeapp() 
 {
	  driver.close();
  }  
 
 
}
