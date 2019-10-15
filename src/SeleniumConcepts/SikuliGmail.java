package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliGmail {

	public static void main(String[] args) throws FindFailed, InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser	
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
       Screen s = new Screen();

       Pattern Gmail = new Pattern("GmailLink.PNG");
       Pattern CreateAC = new Pattern("CreateAcct.PNG");
       Pattern FN = new Pattern("FirstName.PNG");
       Pattern LN = new Pattern("LastName.PNG");
       //Pattern Next = new Pattern("NextBtn.PNG");
       Pattern Pwd = new Pattern("Password.PNG");
       //Pattern CPwd = new Pattern("ConfirmPwd.PNG");
       
       s.wait(Gmail, 3000);
       s.click(Gmail);
       Thread.sleep(3000);
       
       s.wait(CreateAC, 3000);
       s.click(CreateAC);
       Thread.sleep(3000);
       
       s.wait(FN, 3000);
       s.type(FN, "tom");
       Thread.sleep(3000);
       
       s.wait(LN, 3000);
       s.type(LN, "jerry");
       Thread.sleep(5000);
       
       //type("some text"+Key.TAB +"more text" +Key.ENTER)
       s.wait(Pwd, 3000);
       s.type(Pwd,"Hello123"+Key.TAB + "Hello123"+Key.ENTER);
	}

}
