package SeleniumConcepts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITScript {

	public static void main(String[] args) throws IOException, InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://tinyupload.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Monika Raj\\Desktop\\Selenium\\AutoIT Scripts\\AutoItFileUpload_Manasa.exe");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@src='images/button_upload.gif']")).click();

	}

}
