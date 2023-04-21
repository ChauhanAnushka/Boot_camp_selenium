package dynamic_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class interaction_using_js {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver(option);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		JavascriptExecutor js=driver;
		
		//inputbox
		WebElement firstname=driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']"));
		js.executeScript("arguments[0].setAttribute('value','john')", firstname);
		WebElement lastname=driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']"));
		js.executeScript("arguments[0].setAttribute('value','stark')", lastname);
		
		//radio button
		WebElement rd=driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']"));
		js.executeScript("arguments[0].click();", rd);
		
		//Check Box
		WebElement cb=driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_0']"));
		js.executeScript("arguments[0].click();", cb);
		
	}

}
