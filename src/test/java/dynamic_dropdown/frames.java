package dynamic_dropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote allow origin=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("WebDriver")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("org.openqa.selenium.bidi")).click();
		
	}

}
