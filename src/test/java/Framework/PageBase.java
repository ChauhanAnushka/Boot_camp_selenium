package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

public class PageBase {
// Driver initialize
	 public static  WebDriver driver;
    
     public void browser() throws InterruptedException {
   	  driver=new EdgeDriver();
   	  driver.manage().window().maximize();
   	  Thread.sleep(3000);
      driver.get("https://www.saucedemo.com/");
    }
}
