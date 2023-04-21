package dynamic_dropdown;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class abc {

	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in");
		driver.switchTo().newWindow(WindowType.TAB);
           
		Set<String> windowsID= driver.getWindowHandles();
		List<String> list=new ArrayList(windowsID);
		for(String winid:list) {
			driver.switchTo().window(winid);
			System.out.println(driver.getTitle());
			System.out.println(winid);
		}

	}

}
