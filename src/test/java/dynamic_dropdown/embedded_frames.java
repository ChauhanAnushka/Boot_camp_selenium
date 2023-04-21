package dynamic_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class embedded_frames {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Frame1
		WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("frame1");
		driver.switchTo().defaultContent();
        
		//Frame3
		WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("frame3");
		
		//inner frame
		driver.switchTo().frame(0);
		//driver.findElement(By.cssSelector("div.AB7Lab")).click(); //for radio button
		driver.findElement(By.cssSelector("div#i5")).click();
		
		
		//inner frame
		driver.findElement(By.cssSelector("div#i22")).click();
	}

}
