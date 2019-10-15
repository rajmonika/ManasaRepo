package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowser {

	public static void main(String[] args) throws InterruptedException {

		//Launching Chrome Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com"); //Takes to the url
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		//Launching FireFox Browser
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in");*/
		
		driver.navigate().to("https://www.ebay.com");
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.close();
		//driver.quit();
	}

}
