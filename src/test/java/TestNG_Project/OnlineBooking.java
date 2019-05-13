package TestNG_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OnlineBooking {

	
	WebDriver driver ;
	
	@BeforeTest
	
	public void SetUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.get("https://www.yatra.com/");
	    
	    driver.manage().window().maximize();
	}
	
	@Test
	
	public void flights()
	{
		driver.findElement(By.xpath("//*[@id=\"booking_engine_hotels\"]/span[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"booking_engine_modues\"]/div/div/div[2]/ul/li[2]/section/i")).click();
	}
}
