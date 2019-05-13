package TestNG_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Annotations {
	
	
	WebDriver driver ;
	
	@Test
	
	public void LoginIntoApplications()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create an account")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Rahil");
	}
		

}
