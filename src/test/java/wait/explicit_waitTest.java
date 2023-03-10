package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class explicit_waitTest {
	WebDriver driver;
	
  @Test
  public void f() {
	  WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  driver.get("http://www.flipkart.com");
	  WebElement mail = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='_2IX_2- VJZDxU']")));
	  mail.sendKeys("chauhananushka92@gmail.com");
	  
  }
}
