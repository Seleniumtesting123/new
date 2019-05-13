package TestNG_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Insurance_Project {

	

	WebDriver driver ;
	
	@BeforeTest
	
	public void SetUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.get("http://demo.guru99.com/insurance/v1/index.php");
	    
	    driver.manage().window().maximize();
	    
}
	
	@Test
	
	public void Register()
	{
		driver.findElement(By.linkText("Register")).click();
		
		new Select(driver.findElement(By.id("user_title"))).selectByValue("Doctor");
		
		driver.findElement(By.id("user_firstname")).sendKeys("Amit");
		
		driver.findElement(By.id("user_surname")).sendKeys("Kumar");
		
		driver.findElement(By.name("phone")).sendKeys("1234567895");
		
		new Select(driver.findElement(By.name("year"))).selectByValue("1990");
		
		new Select(driver.findElement(By.name("month"))).selectByVisibleText("August");
		
		new Select(driver.findElement(By.name("date"))).selectByValue("6");
		
		driver.findElement(By.id("licencetype_t")).click();
		
		new Select(driver.findElement(By.name("licenceperiod"))).selectByValue("10");
		
		new Select(driver.findElement(By.name("occupation"))).selectByValue("4");
		
		driver.findElement(By.name("street")).sendKeys("Gandhi Nagar");
		
		driver.findElement(By.name("city")).sendKeys("Pune");
		
		driver.findElement(By.name("county")).sendKeys("India");
		
		driver.findElement(By.name("post_code")).sendKeys("410001");
		
		driver.findElement(By.name("email")).sendKeys("guarav_kumar@yahoo.com");
		
		driver.findElement(By.name("password")).sendKeys("Gaurav@123");
		
		driver.findElement(By.name("c_password")).sendKeys("Gaurav@123");
		
		//driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		//driver.findElement(By.id("resetform")).click();
		
	}
	
	@AfterTest
	
	public void Close()
	{
		//driver.quit();
	}
	
	
}