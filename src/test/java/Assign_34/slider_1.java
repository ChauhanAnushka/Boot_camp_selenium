package Assign_34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider_1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement MainItem2= driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
		WebElement SubSubList= driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']"));
		
		Actions act=new Actions(driver);
		
		//mouse event
		act.moveToElement(MainItem2).moveToElement(SubSubList).click().build().perform();		
		
	}
}
