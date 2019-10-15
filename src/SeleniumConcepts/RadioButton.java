package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);

		WebElement rb1 = driver.findElement(By.id("vfb-7-1"));
		rb1.click();
		Thread.sleep(2000);
		
		
		
		WebElement rb3 = driver.findElement(By.id("vfb-7-3"));
		rb3.click();
		
		if(rb3.isDisplayed())
		{
			System.out.println("Radio button 3 is displayed");
		}
		else
		{
			System.out.println("Radio button 3 is not displayed");
		}
		Thread.sleep(2000);

		
		
		WebElement rb2 = driver.findElement(By.id("vfb-7-2"));
		rb2.click();
		if(rb2.isSelected())
		{
			System.out.println("Radio button 2 is Selected");
		}
		else
		{
			System.out.println("Radio button 2 is NOT Selected");
		}
		
		Thread.sleep(2000);
		
		if(rb1.isSelected())
		{
			System.out.println("Radio button 1 is Selected");
		}
		else
		{
			System.out.println("Radio button 1 is NOT Selected");
		}
		
		//isEnabled method to check status
		
		Thread.sleep(2000);
		driver.close();



	}

}
