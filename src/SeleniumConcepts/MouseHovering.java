package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.linkText("Electronics"))).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("iPhone")).click();
		Thread.sleep(4000);
		
		driver.close();


	}

}
