package dynamic_dropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouse_rightClick {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement rightclick= driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
		//mouse hover
		act.moveToElement(rightclick).click().build().perform();
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
		Thread.sleep(3000);
        
		Alert alertwindow=driver.switchTo().alert();
		System.out.println(alertwindow.getText());
		alertwindow.accept();
		
	}

}
