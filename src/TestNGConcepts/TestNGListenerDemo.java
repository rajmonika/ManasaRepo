package TestNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGConcepts.TestNGListeners.class)
public class TestNGListenerDemo {
	
WebDriver driver;
	
    @Test
    public void test1()
    {
	  System.out.println("This is Test Case 1");
	}
    
    
	@Test
	public void test2()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver(); //launches the browser	
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
	}
	
	@Test
    public void test3()
    {
	  System.out.println("This is Test Case 3");
	  System.out.println(2/0);
	}
    
	@Test (dependsOnMethods = "test3")
    public void test4()
    {
	  System.out.println("This is Test Case 4");
	}
    

}
