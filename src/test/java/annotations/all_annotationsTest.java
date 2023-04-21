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
	void BSuite() {
		System.out.println("This is Before Suite");
	}
	@BeforeTest
	 public void BTest() {
		 System.out.println("This is before Test");
	 }
	@BeforeClass
	void BClass() {
		System.out.println("This is before Class");
	}
	@BeforeMethod
	  public void BMethod() {
		  System.out.println("This is before Method");
	  }
	 @Test
	public void test() {
		  System.out.println("This is Test");
	  }
	 @AfterMethod
	 public void AMethod() {
		 System.out.println("This is after Method");
	 }
	 @AfterClass
	 public void AClass() {
		 System.out.println("This is after Class"); 
	 }
	 @AfterTest
	 public void ATest() {
		 System.out.println("This is after Test");
	 }
	 @AfterSuite
	 void ASuite() {
		 System.out.println("This is after Suite");
	 }
}

//Sequence of the annotations
//@BeforeSuite
//@BeforeTest
//@BeforeClass
//@BeforeMethod
//@Test
//@AfterMethod
//@AfterClass
//@AfterTest
//@AfterSuite
