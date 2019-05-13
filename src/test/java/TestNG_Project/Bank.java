package TestNG_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bank {
	
	
	WebDriver driver ;
	
	@Test
	
	public void Login()
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    
	    driver.get("http://demo.guru99.com/V1/html/Managerhomepage.php");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.linkText("New Customer")).click();
	    
	    driver.findElement(By.xpath("//input[@type='date']")).sendKeys("10-05-1996");
	}
	
	

}
