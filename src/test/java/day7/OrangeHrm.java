package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHrm {

WebDriver driver;
	
	
	public void beforetest(){
		
		 driver=new ChromeDriver();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
}
	@Test(dataProvider ="datap")
	public void login(String username,String password)throws InterruptedException{
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
}
	
	@DataProvider(name="datap")
	public Object[][] datap() {
		
		return new Object[][] // 2 - D array
				{
			new Object[] { "Admin", "admin123" }, // new objects of 2darray and passing my data from it
			new Object[] { "Admin", "adminpass" },
			new Object[] { "user123", "admin123" },
			new Object[] { "operator", "user123" },
				
			};
			
	}
			
			
			public void afterTest() {
				
				driver.close();
			}
}