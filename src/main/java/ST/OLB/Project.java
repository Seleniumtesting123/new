package ST.OLB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class Project {
	
	WebDriver driver;
	
	
	@Test
  
	public void LoginIntoApplication()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("http://delaplex.cloudapp.net:8080/timesheet/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("MohammadRahil");
		
		driver.findElement(By.name("password")).sendKeys("Rahil@123");
	}
	

	static XSSFSheet ExcelWSheet;
	static XSSFWorkbook ExcelWBook;
	static XSSFCell Cell;
	static XSSFRow Row;

	@Test
	
	public void ReadTheData(String SheetName , int RowNum , int ColNum) throws IOException {
	{
		FileInputStream ExcelFile = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\eclipse-workspace\\OLB\\Test1.xlsx");
		
        ExcelWBook = new XSSFWorkbook(ExcelFile);
		
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		
		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		
		String CellData = Cell.getStringCellValue();
		
		
		
	}
}
	}