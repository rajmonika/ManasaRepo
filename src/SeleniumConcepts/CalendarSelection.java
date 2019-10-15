package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarSelection {

	public static void main(String[] args) {

/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); //launches the browser	*/
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser	
		
		driver.manage().window().maximize();
		
		driver.get("https://www.phptravels.net/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("dpd1")).click();

	}

}
