package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://netbanking.hdfcbank.com/");
		Thread.sleep(2000);

		driver.switchTo().frame("login_page");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("user101");
		Thread.sleep(2000);
		
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Privacy Policy")).click();
		Thread.sleep(3000);
		driver.close();
		

	}

}
