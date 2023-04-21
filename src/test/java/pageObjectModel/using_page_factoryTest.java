package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class using_page_factoryTest {
	public static void main(String[] args) {
	
	//launch browser
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(option);
	
	//WebDriverManager.chromedriver().setup();
	//driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	using_page_factory lp = new using_page_factory(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	lp.logocheck();
	lp.setusername("Admin");
	lp.setpasswd("admin123");
	lp.clickbtn();
	}
	}	

