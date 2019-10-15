package SeleniumConcepts;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);

         String mainwin = driver.getWindowHandle(); //ID of the main window
         System.out.println("Window id of the main window is: "+mainwin);
         Thread.sleep(2000);
         
         Set<String> windows = driver.getWindowHandles();
         
         for(String win : windows)
         {
        	 driver.switchTo().window(win);
        	 String title = driver.getTitle();
        	 System.out.println(title+"----"+win);
        	 Thread.sleep(2000);
        	 
        	 if(title.equals("Amazon"))
        	 {
        		 driver.close();
        		 Thread.sleep(2000);
        	 }
         }
         
         
         driver.quit();
         
	}

}
