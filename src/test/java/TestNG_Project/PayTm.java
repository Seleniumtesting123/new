package TestNG_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PayTm {
	
	
	WebDriver driver ;
	
	@BeforeTest
	
	public void SetUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.get("https://www.redbus.in/hotels/");
	    
	    driver.manage().window().maximize();
	    
	  
	}

	
	@Test
	
	public void BookinRooms()
	{
	
		
		driver.findElement(By.xpath("//*[@id=\"checkin_date\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_checkin_date\"]/table/tbody/tr[5]/td[6]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"checkout_date\"]")).sendKeys("21/Apr/2019");
		
	
	}
	
}
