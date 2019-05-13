package ST.OLB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data {
	
	WebDriver driver = null;
	
	
	public void method1()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.navigate().to("https://www.irctc.co.in/nget/train-search");
	}
	public static void main(String [] args)
	{
		Data obj = new Data();
		obj.method1();
	}
}
