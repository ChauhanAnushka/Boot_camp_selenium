package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class normalApproach {
	WebDriver Driver;
	
	//constructor
	normalApproach( WebDriver Driver){
		this.Driver= Driver;
	}
    //locators
	By img_src=By.xpath("//img[@alt='company-branding']");
	By username=By.name("Username");
	By password=By.name("Password");
	By click=By.xpath("//button[@type='submit']");
	
	//Action
	public void setUsername(String user){
	Driver.findElement(username).sendKeys(user);
	}
   public void setPassword(String user){
	Driver.findElement(password).sendKeys();	
	}
   public void logo(String user){
   boolean img=Driver.findElement(img_src).isDisplayed();
   }
   public void image(String user){
   Driver.findElement(click).click();
	 }
}
