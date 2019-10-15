package TestNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowserParallel {
	
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeMethod
	public void SetUp(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
			
		{		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
			
		{
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver(); //launches the browser	
			driver.manage().deleteAllCookies();		
		}
	}
	
	@Test
	public void googleTitle() throws InterruptedException
	{
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void Close() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}

}
