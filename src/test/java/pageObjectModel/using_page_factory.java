package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;


public class using_page_factory {

	WebDriver driver;
	public using_page_factory(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	    // POM class with using page factory
		//locators
			@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")
			WebElement img_logo;
			@FindBy(xpath="//input[@placeholder='Password']")
			WebElement password;
			@FindBy (xpath="//input[@placeholder='Username']")
			WebElement username;
			@FindBy (xpath="//button[@type='submit']")
			WebElement click_btn;
			//Actions
			public void setusername(String user) {
			username.sendKeys(user);
			}
			public void setpasswd(String pswd) {
			password.sendKeys(pswd);
			}
			public void logocheck() {
			img_logo.isDisplayed();
			System.out.println(img_logo);
			}
			public void clickbtn() {
			click_btn.click();	
		
	}	
}
		
