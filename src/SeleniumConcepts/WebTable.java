package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Reliance Com')]")).getText());
		
		int hegrow = driver.findElements(By.xpath("//a[contains(text(),'Reliance Com')]/parent::*/parent::*")).size();
		System.out.println(hegrow);
		
		int totCols = driver.findElements(By.xpath("//a[contains(text(),'Reliance Com')]/parent::*/parent::*/td")).size();
		System.out.println("No. of Columns: "+totCols);
		
		int totRows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size(); //298
		System.out.println("No. of Rows: "+totRows);
		
		/*List<WebElement> CompanyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		for(WebElement company : CompanyNames)
		{
			System.out.println(company.getText());
		}*/
		
		////table[@class='dataTable']/tbody/tr[i]/td[j]
		String firstpart = "//table[@class='dataTable']/tbody/tr[";
		String secondpart = "]/td[";
		String thirdpart = "]";
		
		for(int i=1; i<=totRows; i++)
		{
			for(int j=1; j<=totCols; j++)
			{
				String finalpart = firstpart + i + secondpart + j + thirdpart;
				String data = driver.findElement(By.xpath(finalpart)).getText();
				System.out.print(data+ " | ");
			}
			System.out.println();
		}
		


	}

}
