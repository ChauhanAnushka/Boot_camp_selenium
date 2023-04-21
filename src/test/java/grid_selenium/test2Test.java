package grid_selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class test2Test {
  @Test
  public void login() throws MalformedURLException {
	  DesiredCapabilities caps= new  DesiredCapabilities();
	  caps.setBrowserName("chrome");
	  
	  WebDriver driver= new RemoteWebDriver(new URL("http://192.168.137.101:4444/"), caps);
	  driver.get("https://demo.guru99.com/test/newtours/");
	  System.out.println(driver.getTitle());
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
	  
	  driver.close();
  }
}
