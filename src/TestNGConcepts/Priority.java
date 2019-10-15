package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Priority {
	
	WebDriver driver;
	
    @BeforeMethod
  public void Setup() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver(); //launches the browser	
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
    
    @Test (priority = 1)
    public void PageTitle() {
    	String title = driver.getTitle();
    	System.out.println("Title of the Page is: "+title);
    }
    
    @Test (priority = 3)
    public void PageLogo() {
    	boolean b = driver.findElement(By.xpath("//img[@title='Celebrating Dr. Herbert Kleber']")).isDisplayed();
    	System.out.println("Logo of the Page is displayed? "+b);
    }
    
    @Test (priority = 2)
    public void Gmail()
    {
    	boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
    	System.out.println("Gmail link is Displayed? "+b);
    }


  @AfterMethod
  public void Close() {
	  driver.close();
  }

}
