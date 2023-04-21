package dynamic_dropdown;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser_window {

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
		
		//using list collection
		List <String>windowidsList=new ArrayList(windowIDs); //converting set to list
        
		String parentWindowID= windowidsList.get(0);
		String childWindowID= windowidsList.get(1);
		
		System.out.println(parentWindowID);
		System.out.println(childWindowID);
		
		driver.switchTo().window(childWindowID);
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		

		driver.switchTo().window(parentWindowID);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		
	}

}
