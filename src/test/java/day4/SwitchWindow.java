package day4;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {
	
     public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 driver.findElement(By.linkText("Open Tab")).click();
		 
		 System.out.println(driver.getTitle());
		 
		 String parentHandle =driver.getWindowHandle();
		 
		 Set<String> allhandles = driver.getWindowHandles();
		 
		 for (String singlehandle : allhandles) {
			 
			 driver.switchTo().window(singlehandle);
			 
			 if (driver.getTitle().equals("QAClick Academy - A Testing Academy to Learn, Earn and Shine")) {
				 break;
				 
			 }
			 
			 
		 }
		 
		 driver.findElement(By.linkText("Access all our courses")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.switchTo().window(parentHandle);
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("autocomplete")).sendKeys("switched back to my parent window");
		 
		 
		 
		 
		
     }		

}
