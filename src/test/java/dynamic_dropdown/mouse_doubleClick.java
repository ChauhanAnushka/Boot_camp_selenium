package dynamic_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouse_doubleClick {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		

		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='field1']")).clear();
		driver.findElement(By.xpath("//input[@id='field1']")).sendKeys("welcome");
       
		//button
		WebElement dclick= driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions act=new Actions(driver);
		//mouse hover
		act.doubleClick(dclick).build().perform();
		
		//validation
		String f1=dclick.getAttribute("value");
		System.out.println(f1);
		String f2=dclick.getAttribute("value");
		System.out.println(f2);
		
      if(f1.equals(f2)) {
    	  System.out.println(" Test passed");
      }
      else {
    	  System.out.println(" Test failed"); 
      }
		
	}
	}


