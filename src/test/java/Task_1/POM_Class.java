package Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POM_Class {
	
  //    public static ChromeDriver option;
      public static  WebDriver driver;
      @BeforeMethod
      public void browser() throws InterruptedException {
    	  driver=new EdgeDriver();
    		driver.manage().window().maximize();
    		Thread.sleep(3000);
    		   driver.get("https://www.saucedemo.com/");
    		   }
     By username=By.xpath("//input[@id='user-name']");
  	 By password=By.xpath("//input[@id='password']");
  	 By click=By.xpath("//input[@id='login-button']");
	 By logo=By.xpath("//a[@class='shopping_cart_link']");
	 By errormsg=By.xpath("//h3[@data-test='error']");
	
	
		//Action 
		public void setUsername(String user_name){
			driver.findElement(username).sendKeys(user_name);
		}
	   public void setPassword(String userpsd){
		driver.findElement(password).sendKeys(userpsd);	
	   }
	   public void button(){
	   driver.findElement(click).click();
		}
	   public boolean logoDisplayed(){
		   return driver.findElement(logo).isDisplayed();
			}
	   public boolean errorDisplayed(){
		   return driver.findElement(errormsg).isDisplayed();
			}
	 }
