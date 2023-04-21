package dynamic_dropdown;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alert_popup {

	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote allow origin=*");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		Alert alertwindow=driver.switchTo().alert();
		
		System.out.println(alertwindow.getText());
		alertwindow.accept();
		//alertwindow.dismiss();

	}

}
