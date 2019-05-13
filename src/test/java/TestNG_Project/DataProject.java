package TestNG_Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataProject {

	
	WebDriver driver ;
	
	static XSSFSheet ExcelWSheet;
	static XSSFWorkbook ExcelWBook;
	static XSSFCell Cell;
	static XSSFRow Row;
	
	@BeforeTest
	
	
	public void TestSetup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    
	    driver.get("http://www.linkedin.com/");
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    
	}
	
	@Test
	
	public void ReadData() throws Exception
	{
		FileInputStream ExcelFile = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\eclipse-workspace\\OLB\\Test2.xlsx");
		
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		
		ExcelWSheet = ExcelWBook.getSheetAt(0);
		
		 for(int i=1; i<=ExcelWSheet.getLastRowNum(); i++)
				
	     {
	
	         Cell cell = ExcelWSheet.getRow(i).getCell(1);
       
	         driver.findElement(By.id("login-email")).sendKeys(cell.getStringCellValue());
		        
	         cell = ExcelWSheet.getRow(i).getCell(2);
	
	         driver.findElement(By.id("login-password")).sendKeys(cell.getStringCellValue());
	
	       
	     	
	             
	
	     }

	 }
		
		
	}
