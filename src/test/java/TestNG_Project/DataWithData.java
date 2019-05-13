package TestNG_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ST.OLB.ExcelUtils;

public class DataWithData {

	
	
	WebDriver driver;
	 
    @BeforeMethod

    public void beforeMethod() throws Exception {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
		

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.store.demoqa.com"); 
        
        driver.manage().window().maximize();

}

    @Test(dataProvider="Authentication")
 
        public void Registration_data(String UserName,String Password)throws  Exception{

        driver.findElement(By.linkText("Log in")).click();

         driver.findElement(By.id("user_login")).sendKeys(UserName);

        System.out.println(UserName);

         driver.findElement(By.id("user_pass")).sendKeys(Password);

        System.out.println(Password);

         driver.findElement(By.id("wp-submit")).click();
 
         System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

      // driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

}

   @DataProvider(name="Authentication")

        public Object[][] Authentication() throws Exception{
	   
	   Object[][] data = new Object[2][2];

        Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\Lenovo\\Desktop\\eclipse-workspace\\OLB\\Test1.xlsx","Sheet1", 0);

        Object[][] testObjArray1 = ExcelUtils.getTableArray("C:\\Users\\Lenovo\\Desktop\\eclipse-workspace\\OLB\\Test1.xlsx","Sheet1", 1);
        
        
           
            return (testObjArray);

}

   @AfterMethod

   public void afterMethod() {

 	   // driver.close();

    }

	
	
	
}
