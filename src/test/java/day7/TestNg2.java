package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg2 {

WebDriver driver;
	
	@BeforeTest(alwaysRun = true)
	public void setup(){
		
		 driver=new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		 
		
	}
	
	@Test(groups="smoke",priority =1)
	public void sendkeystest()throws InterruptedException{
		
		
		
		driver.findElement(By.id("autocomplete")).sendKeys("This is Awesome");
	}
	@Test(groups="regression",priority=3)//dependsOnMethods ="webtabletest")

      public void test1() {
		
		 
          String num = driver.findElement(By.xpath("(//table[@name='courses']/tbody/tr[7]/td[3]")).getText();
          
		  System.out.println(num);
	}
		  
		 
	 @Test(groups="smoke",priority=-2)
		 
		 public void checkpbxtest() {
			 
		 driver.findElement(By.name("checkBoxOption1")).click();
		 }
	 
	 @Test(groups="regression",priority = 4)//dependsOnMethods ="webtabletest")
	 
	 public void linktext() {
	 
	 WebElement link1= driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
	 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	 
	 wait.until(ExpectedConditions.elementToBeClickable(link1));
     
	   link1.click();
			
		
	}
	
	@AfterTest(alwaysRun = true)
	
	public void teardown() {
		
		driver.close();
	}
}


