package ST.OLB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataa11 {

	
	
	private String sTestCaseName;
	 
	 private int iTestCaseRow;
	 
	 WebDriver driver;
	 
	 @Test(priority=1)
	 
	  public void beforeMethod() throws Exception {
	 
	   driver = new ChromeDriver();
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      
	 
	  } 
	 
	  @Test(dataProvider = "Authentication")
	 
	  public void f(String username, String password) {
	 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
		
			driver.navigate().to("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.findElement(By.id("email")).sendKeys(username);
			 
		    driver.findElement(By.id("pass")).sendKeys(password);
		 
		    driver.findElement(By.xpath("//input[@value='Log In']")).click();
					
	  }
	 
	  @Test(priority=2)
	 
	  public void afterMethod() {
	 
	    driver.close();
	 
	  }
	 
	  @DataProvider
	 
	  public Object[][] Authentication() throws Exception{
	 
	     // Setting up the Test Data Excel file
	 
	 ExcelUtils.setExcelFile("C:\\Users\\Lenovo\\Desktop\\eclipse-workspace\\OLB\\Test1.xlsx","Sheet1");
	 
	 sTestCaseName = this.toString();
	 
	    // From above method we get long test case name including package and class name etc.
	 
	    // The below method will refine your test case name, exactly the name use have used
	 
	    sTestCaseName = ExcelUtils.getTestCaseName(this.toString());
	 
	     // Fetching the Test Case row number from the Test Data Sheet
	 
	     // Getting the Test Case name to get the TestCase row from the Test Data Excel sheet
	 
	 iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	 
	     Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\Lenovo\\Desktop\\eclipse-workspace\\OLB\\Test1.xlsx","Sheet1",iTestCaseRow);
	 
	      return (testObjArray);
	 
	 }
}
