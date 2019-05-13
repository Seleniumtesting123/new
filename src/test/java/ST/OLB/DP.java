package ST.OLB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP {

	WebDriver driver ;
	
	
	
	@Test(dataProvider="TestData")
	public void method1(String username, String password)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(username);
		 
	    driver.findElement(By.id("pass")).sendKeys(password);
	 
	    driver.findElement(By.xpath("//input[@value='Log In']")).click();
				
		
	}
	
	@DataProvider(name="TestData")
	

	public Object [][] getdata()	
	{
		Object[][] data = new Object[1][2];
		
		data[0][0]= "Rahil";
		data[0][1]= "Pune"	;
		return data;
	}
			
	
	@DataProvider(name="TestData1")
	
	public Object [][] getdata1()
	{
		Object[][] data = new Object[1][2];
		
		data[0][0]= "mohdrahil2989@gmail.com";
		data[0][1]= "02091989"	;
		return data;
	}
}
