package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class normalApproach {             //OrangeHRM Demo
	WebDriver Driver;
	
	//constructor
	normalApproach( WebDriver Driver){
		this.Driver= Driver;
	}
    //locators
	By img_src=By.xpath("//img[@alt='company-branding']");
	By username=By.xpath("//input[@placeholder='Username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By click=By.xpath("//button[@type='submit']");
	
	//Action
	public void setUsername(String user){
	Driver.findElement(username).sendKeys("Admin");
	}
   public void setPassword(String user){
	Driver.findElement(password).sendKeys("admin123");	
	}
   public void logo(){
   boolean img=Driver.findElement(img_src).isDisplayed();
   }
   public void button(){
   Driver.findElement(click).click();
	}
}
