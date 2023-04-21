package dynamic_dropdown;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class popup_with_input {

	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		
		Alert alertwindow=driver.switchTo().alert();
		
		System.out.println(alertwindow.getText());
		alertwindow.sendKeys("welcome");
		alertwindow.accept();
		
		//validation
		String act_text=driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
		String exp_text="You entered: welcome";
		System.out.println(act_text);
		System.out.println(exp_text);
		
		if(act_text.equals(exp_text)) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		
	}

}
