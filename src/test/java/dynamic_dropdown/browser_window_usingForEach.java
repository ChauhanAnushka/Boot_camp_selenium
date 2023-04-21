package dynamic_dropdown;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser_window_usingForEach {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		//capture id for browser windows
		Set<String> windowIDs=driver.getWindowHandles(); //store 2 windows id
		
		//using for each loop
		for(String winid:windowIDs) {
			String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")) {
				driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();		
		
			}
			
		}

	}

}
