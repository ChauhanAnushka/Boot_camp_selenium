package dynamic_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class example_of_dropdown {

	public static void main(String[] args)throws InterruptedException {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote allow origin=*");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//strong"));
		
		System.out.println(" The suggestions are :"+list.size());
		
		for(int i=0;i<list.size();i++) {
		String text= list.get(i).getText();
		System.out.println(text);
		if(text.equals("selenium python")) {
			list.get(i).click();
			}
		}
 }
	}


