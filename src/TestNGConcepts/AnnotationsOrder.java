package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsOrder {
	
	
	  @BeforeSuite //setting up Pre conditions
	  public void SetUp() {
		 System.out.println("@Before Suite - Setting up system properties for Chrome"); 
	  }
	  
	  @BeforeTest //Launching Browser
	  public void LaunchBrowser() {
		  System.out.println("@Before Test - Launch Browser");
	  }
	  
	  @BeforeClass 
	  public void enterURL() {
		  System.out.println("@Before Class - Enter URL of the Application");  
	  }

	  @BeforeMethod
	  public void Login() {
		  System.out.println("@Before Method - Login into the Application");
	  }

  @Test
  public void SearchProduct() {
	  System.out.println("Test 1 - Search for Product");
  }
  
  @Test
  public void PageTitle() {
	  System.out.println("Test 2 - Validate Page Title");
  }

  @Test
  public void PageLogo() {
	  System.out.println("Test 3 - Validate Page Logo");
  }

 
  @AfterMethod
  public void Logout() {
	  System.out.println("@After Method - Logout into the Application");  
  }

 
  @AfterClass
  public void RemoveURL() {
	  System.out.println("@After Class - Remove URL of the Application");
  }
  
  @AfterTest
  public void DeleteCookies() {
	  System.out.println("@After Test - Delete Cookies");
  }

  @AfterSuite
  public void CloseBrowser() {
	  System.out.println("@After Suite - Close Browser");
  }

}
