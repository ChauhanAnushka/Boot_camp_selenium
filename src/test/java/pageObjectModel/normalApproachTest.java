package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class normalApproachTest {
	   WebDriver driver;
	   @BeforeClass
	   public void nav() {
	   driver=new ChromeDriver(); 
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   }
	   
	   @Test
	   public void createAccount() {
		   normalApproach na=new normalApproach(driver);
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   na.setUsername("Admin");
		   na.setPassword("admin123");
		   na.logo();
		   na.button();
	   }
}
