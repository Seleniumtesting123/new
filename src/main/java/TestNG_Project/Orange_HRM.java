package TestNG_Project;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Orange_HRM {

	
	WebDriver driver;
	
	
	@BeforeTest
	
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.manage().window().maximize();
	
	
	}
	
	@Test
	
	public void Login()
	{
		
		driver.findElement(By.id("txtUsername")).sendKeys("Rohit");
		
		driver.findElement(By.id("txtPassword")).sendKeys("Rohit@123");
		
		driver.findElement(By.id("btnLogin")).submit();

		driver.findElement(By.linkText("My Info")).click();
		
		driver.findElement(By.linkText("Personal Details")).click();
		
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.xpath("//*[@id=\"frmEmpPersonalDetails\"]/fieldset/ol[2]/li[4]/img")).click();
		
		new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"))).selectByValue("6");
		
		new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"))).selectByValue("2025");
		
		driver.findElement(By.linkText("23")).click();
		
		
        driver.findElement(By.id("empPic")).click();
          
		 WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
		 
		uploadElement.sendKeys("C:\\Users\\Lenovo\\Desktop\\eclipse-workspace\\OLB\\Test1.xlsx");
		  
	     driver.findElement(By.xpath("//input[@type='button']")).click();
	  
	   
		//driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Contact Details")).click();
		
		driver.findElement(By.id("empPic")).click();
		
		driver.findElement(By.xpath("//input[@type='file']")).click();
		
		//driver.findElement(By.xpath("//input[@type='button']")).click();
		
        driver.findElement(By.linkText("Emergency Contacts")).click();
	
		driver.findElement(By.linkText("Dependents")).click();
		
		driver.findElement(By.id("btnAddDependent")).click();
		
		driver.findElement(By.id("dependent_name")).sendKeys("Mariyta");
		
		new Select(driver.findElement(By.id("dependent_relationshipType"))).selectByVisibleText("Child");
		
		//driver.findElement(By.name("ui-datepicker-trigger]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"frmEmpDependent\"]/fieldset/ol/li[4]/img")).click();
		
		new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"))).selectByValue("6");
		
		new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"))).selectByValue("1999");
		
		driver.findElement(By.linkText("24")).click();
		
		
	
		//driver.findElement(By.linkText("Immigration")).click();
		
		//driver.findElement(By.id("btnAdd")).click();
	}
	
}
