package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Thread.sleep(2000);

		//Information Alert Box
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//Confirmation Alert Box
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
