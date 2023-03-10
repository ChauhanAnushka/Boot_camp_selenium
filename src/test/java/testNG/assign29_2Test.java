package testNG;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class assign29_2Test {
	WebDriver driver= new ChromeDriver();

	@BeforeClass
	public void openapp() {
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void linkCount() {
	List<WebElement> lc=driver.findElements(By.tagName("a"));
	System.out.println("Number of links on Flipcart home page:"+ lc.size());
	}
	@Test(priority=2)
	public void linkText() {
		List<WebElement> l=driver.findElements(By.tagName("a"));
		for(WebElement x:l) {
		System.out.println("Link Text:"+ x.getText());
		System.out.println("Link Url:"+ x.getAttribute("href"));
	}}
	@AfterClass
	void closeApp()
	{
	driver.close();
	}
	}
