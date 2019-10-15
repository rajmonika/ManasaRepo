package TestNGConcepts;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingMethods {
	
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public ExcelReadingMethods(String excelPath, String sheetName) throws IOException
	{
		wb = new XSSFWorkbook(excelPath);
		sh = wb.getSheet(sheetName);
	}
	
	public int getRowCount()
	{
		int rowCount = sh.getPhysicalNumberOfRows();
		System.out.println("Number of rows in Sheet 1: "+rowCount);
		return rowCount;
	}

	public int getColCount()
	{
		int colCount = sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of Columns in Sheet 1:"+colCount);
		return colCount;
	}
	
	public String getCellDataString(int rowNum, int colNum)
	{
		String cellData = sh.getRow(rowNum).getCell(colNum).getStringCellValue();
		return cellData;
	}
}
