package grid_selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class grid1Test {
  @Test
  public void loginpage() throws MalformedURLException {
	  DesiredCapabilities caps= new  DesiredCapabilities();
	  caps.setBrowserName("chrome");
	  
	  WebDriver driver= new RemoteWebDriver(new URL("http://192.168.137.101:4444/"), caps);
	  driver.get("https://www.google.com");
	  System.out.println(driver.getTitle());
	  driver.close();
  }
}
