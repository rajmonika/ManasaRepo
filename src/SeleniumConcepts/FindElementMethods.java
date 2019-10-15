package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethods {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("abc@xyz.com");
		
		driver.findElement(By.name("pass")).sendKeys("abc123");
		
		WebElement EmailBox = driver.findElement(By.cssSelector("[class = 'inputtext _58mg _5dba _2ph-'][type='text'][aria-label='Mobile number or email address']"));
		EmailBox.sendKeys("mon@pqr.com");
		
		Thread.sleep(3000);
		
		
		//driver.findElement(By.id("u_0_a")).click();
		
		//WebElement Link1 = driver.findElement(By.linkText("Create a Page"));
		//Link1.click();
		
		driver.findElement(By.partialLinkText("categories")).click();
		
		List<WebElement> LinkList = driver.findElements(By.tagName("a"));
        System.out.println(LinkList.size());
		
		for(WebElement LL : LinkList)
		{
			if(!LL.getText().equals(" "))
			System.out.println(LL.getText());
		}
		
	}

}
