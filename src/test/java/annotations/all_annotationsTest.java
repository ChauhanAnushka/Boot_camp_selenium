package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class all_annotationsTest {
	@BeforeSuite
	void browser() {
		System.out.println("opened the url");
	}
	@BeforeClass
	void login() {
		System.out.println("login");
	} @BeforeMethod
	  public void credentials() {
		  System.out.println("Enter credentials");
	  }
	 @BeforeTest
	 public void search() {
		 System.out.println("Search");
	 }
	 @AfterMethod
	 public void Logout() {
		 System.out.println("logout");
	 }
	 public void Login() {
		 System.out.println("login");
	 }
	 @AfterTest
	 public void Advsearch() {
		 System.out.println("Advanced Search after test");
	 }
	 @AfterClass
	 public void logout() {
		 System.out.println("logout"); 
	 }
	 @AfterSuite
	 void exit() {
		 System.out.println(" exit from page");
	 }
}
