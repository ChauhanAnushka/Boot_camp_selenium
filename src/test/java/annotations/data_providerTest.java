package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class data_providerTest {
 WebDriver driver= new ChromeDriver ();
  @BeforeClass
  void setup() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver= new ChromeDriver();
	}
  @Test(dataProvider="dp")
  public void testLogin(String email,String pwd) {
	driver.get("https://demo.nopcommerce.com/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("Email")).sendKeys("email");
	driver.findElement(By.id("Password")).sendKeys("pwd");
	driver.findElement(By.xpath("//button[normalize-space()='Log in'] ")).click();
	
	String exp_Title="nopCommerce demo store. Login";
	String act_Title= driver.getTitle();
  }
  @AfterClass
  void tearDown() {
	  driver.close();
  }
  
  @DataProvider(name="dp" ,indices= {0,1,4})
  String [][] loginData()
  {
  String data[][]= {
  { "abc11@gmail.com", "test123" },
  { "pavanol@gmail.com", "test@123" },
  { "pavanoltraining@gmail.com", "test3" },
  { "pavanoltraining@gmail.com", "test@123" },
  { "pavanoltraining@gmail.com", "test@123" }
  };

  return data;
  }
}
