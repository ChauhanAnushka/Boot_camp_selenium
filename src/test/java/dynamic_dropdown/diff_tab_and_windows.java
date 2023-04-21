package dynamic_dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class diff_tab_and_windows {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}

}
