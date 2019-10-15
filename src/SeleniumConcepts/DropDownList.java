package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);

		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		
		Select sel = new Select(dropdown);
		
		//selectByIndex, SelectByValue, SelectByVisibleText
		
		WebElement firstOption = sel.getFirstSelectedOption();
		System.out.println("Default selected element of the DropDown List: "+firstOption.getText());
		
		sel.selectByIndex(4); //Books
		Thread.sleep(3000);

		sel.selectByVisibleText("Crafts");
		Thread.sleep(3000);
		
		sel.selectByValue("26395"); //Health and Beauty
		Thread.sleep(3000);
		
		System.out.println("All the items in the drop down list are:");
		List<WebElement> options = sel.getOptions();
		System.out.println(options.size());
		
		for(WebElement item:options)
		{
			System.out.println(item.getText());
		}
		
		driver.close();
	}
	
	

}
