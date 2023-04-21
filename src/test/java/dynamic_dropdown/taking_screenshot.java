package dynamic_dropdown;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class taking_screenshot {

	public static void main(String[] args) throws IOException {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://www.amazon.in");                                                                                                      
		driver.manage().window().maximize();                                                         
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\anchauhan\\Desktop\\ScreenShots\\new.jpg"));
		
		driver.close();

	}

}
