package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("window.location='https://www.ebay.com/'");
		
		js.executeScript("document.getElementById('gh-ac').value='Mobile'");
		Thread.sleep(3000);
		
		js.executeScript("document.getElementById('gh-btn').click()");
		Thread.sleep(3000);
		
		String URL = js.executeScript("return document.URL;").toString();
		System.out.println("URL of the page: "+URL);
		
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain of the page: "+domain);
		
		String title = js.executeScript("return document.title;").toString();
		System.out.println("Title of the Page: "+title);
		
		//Refreshing the Page
		js.executeScript("history.go(0)");
		
		//Scrolling to the bottom of the Page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//Scrolling to top of the page
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//Scrolling till a particular height
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(3000);
		

		//Scrolling back upto a particular height
		js.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(3000);
		
		//Scrolling to an Identified Element
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//h3[contains(text(),'Nokia XpressMusic 5310 - Black & Silver (T-Mobile)')]")));
		Thread.sleep(3000);
		
		//Zoom in
		js.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(3000);
		
		//Zoom out
		js.executeScript("document.body.style.zoom='150%'");
		Thread.sleep(3000);
		

	}

}
