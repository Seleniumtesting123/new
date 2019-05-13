package ST.OLB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Project1 {

	
	WebDriver driver ;
	
	
	@Test(priority=1)
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test(priority=2)
	public void launchApplication()
	{
		driver.get("http://www.gcrit.com/build3/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=3)
	public void closeBrowser()
	{
		driver.close();
	}
}
