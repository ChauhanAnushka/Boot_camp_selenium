package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1Test {
 @BeforeMethod
  public void login() {
	  System.out.println("Login");
  }
 @Test
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
 @Test
 public void Advsearch() {
	 System.out.println("Advanced Search");
 }
 public void logout() {
	 System.out.println("logout");
 }
}
