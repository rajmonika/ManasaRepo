package TestNGConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertions {
	
	WebDriver driver;
	
	@BeforeMethod
	public void SetUp()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver(); //launches the browser	
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	/*
	@Test
	public void googleTitle()
	{
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		Assert.assertEquals(title, "Google","Title Matched");
	}*/
	
	@Test
	public void googleLogo()
	{
		boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(b);
		Assert.assertEquals(b, true);
	}
	
	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
	}

}
