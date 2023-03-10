package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thread_wait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("Your Full Name ")).sendKeys("Anushka");
		driver.findElement(By.id("Business Email ")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
	}

}
