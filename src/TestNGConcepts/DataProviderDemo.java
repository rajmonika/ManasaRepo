package TestNGConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNGConcepts.ExcelReadingMethods;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeTest
	public void SetUp()
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@Test (dataProvider = "test1Data" )
	public void test1(String Username, String Password) throws Exception
	{
		System.out.println(Username+ " "+Password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		Thread.sleep(2000);
		
	}
	
	@DataProvider(name = "test1Data")
	public Object[][] getData() throws Exception
	{
		String excelPath = "C:\\Users\\Monika Raj\\Desktop\\Selenium\\Test Excel File.xlsx";
		String sheetName = "Sheet4";
		
		Object data[][] = testData(excelPath, sheetName);
		return data;
		
	}
	
	public Object[][] testData(String excelPath, String sheetName) throws Exception
	{
		ExcelReadingMethods excel = new ExcelReadingMethods(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount]; //As 1st row will be header, index starts from zero e.g. for 10 rows of data, total rows=11
		
		for(int i=1; i<rowCount; i++)
		{
			for(int j=0; j<colCount; j++)
			{
				String cellData = excel.getCellDataString(i, j);
				System.out.print(cellData+" |");
				data[i-1][j] = cellData; //as index starts from zero, one previous value to be considered as index
			}
			System.out.println();
		}
		return data;
		
	}

}
