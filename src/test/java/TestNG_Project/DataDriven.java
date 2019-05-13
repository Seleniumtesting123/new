package TestNG_Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDriven {

	
	WebDriver driver ;
	
	
	static XSSFSheet ExcelWSheet ;
	static XSSFWorkbook ExcelWBook;
	static XSSFRow Row ;
	static XSSFCell Cell ;
	
	
	@BeforeTest
	public void TC_0001()
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    
	    driver.get("http://www.linkedin.com/");
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    
	}
	
	@Test
	public void ReadData() throws IOException
	{
		FileInputStream ExcelFile = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\eclipse-workspace\\OLB\\Test2.xlsx");
		
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		
	    ExcelWSheet = ExcelWBook.getSheetAt(0);
		 
		for(int i=1; i<=ExcelWSheet.getLastRowNum(); i++)
		 {
		     XSSFCell cell = ExcelWSheet.getRow(i).getCell(1);
			 
			 driver.findElement(By.id("login-email")).sendKeys(cell.getStringCellValue());
		        
		     cell = ExcelWSheet.getRow(i).getCell(2);
		
		      driver.findElement(By.id("login-password")).sendKeys(cell.getStringCellValue());
		
		 }
		
	}
}
