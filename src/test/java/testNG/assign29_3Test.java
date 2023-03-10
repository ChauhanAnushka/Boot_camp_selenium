package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class assign29_3Test {
	WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	void setup(String br) throws InterruptedException
	{
	if(br.equals("chrome"))
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	else if(br.equals("edge"))
	{
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	}
	else
	{
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	}
	}

	@Test
	void Title() {
	driver.get("https://www.flipkart.com/");
	System.out.println("Title of Flipcart is : "+driver.getTitle());
	}
	
    @AfterClass
	void closeApp()
	{
	driver.close();
	}
	}


