package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		
		 driver=new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		 
		
	}
	
	@Test
	public void sendkeystest()throws InterruptedException{
		
		
		
		driver.findElement(By.id("autocomplete")).sendKeys("This is Awesome");
	}
	@Test

      public void test1() {
		
		 
          String num = driver.findElement(By.xpath("(//table[@name='courses']/tbody/tr[7]/td[3]")).getText();
		
		  System.out.println(num);
		
	}
	
	@AfterTest
	
	public void teardown() {
		
		driver.close();
	}
}
