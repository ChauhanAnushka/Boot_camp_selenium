package cross_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Xml_parallelTestimgTest {
	WebDriver driver;
  @BeforeClass
 // @Parameters("browser")
  public void setup(String br) {
	driver=new ChromeDriver();  
	driver.get("https://www.orangehrm.com");  
  }
  
}
