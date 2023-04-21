package Assign_34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider_2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://demoqa.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement slider= driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
		
		Actions act=new Actions(driver);
		
		//mouse event
		act.dragAndDropBy(slider, 26, 0).perform();
		
	}

}


