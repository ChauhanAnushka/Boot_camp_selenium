package dynamic_dropdown;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dy_dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,\"wM6W7d\")]//span"));
		
		System.out.println(" The suggestions are :"+list.size());
		
		for(int i=0;i<list.size();i++) {
		String text= list.get(i).getText();
		System.out.println(text);
		if(text.equals("selenium webdriver")) {
			list.get(i).click();
			}
		}
 }
}