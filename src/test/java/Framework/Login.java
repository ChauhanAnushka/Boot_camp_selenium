package Framework;

import org.openqa.selenium.By;

public class Login extends PageBase{
 //Location
By username=By.xpath("//input[@id='user-name']");
By password=By.xpath("//input[@id='password']");
By click=By.xpath("//input[@id='login-button']");
By logo=By.xpath("//a[@class='shopping_cart_link']");
By errormsg=By.xpath("//h3[@data-test='error']");


//Action 
public void setUsername(String user_name){
	driver.findElement(username).sendKeys(user_name);
}
public void setPassword(String userpsd){
driver.findElement(password).sendKeys(userpsd);	
}
public void button(){
driver.findElement(click).click();
}
public boolean logoDisplayed(){
return driver.findElement(logo).isDisplayed();
	}
public boolean errorDisplayed(){
return driver.findElement(errormsg).isDisplayed();
	}
}


