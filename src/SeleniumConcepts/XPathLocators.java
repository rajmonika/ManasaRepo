package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocators {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		//Absolute XPath
		//WebElement fn = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		//fn.sendKeys("Peter");
		
		//Relative XPath
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("Peter");
		
		driver.findElement(By.xpath("//input[contains(@name, 'firstname')]")).sendKeys("FNcheck");
		
		Thread.sleep(4000);
		driver.close();
		
		

	}

}
