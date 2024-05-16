package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignAlert {
	
	 public static void main(String[] args) throws InterruptedException{
			
         WebDriver driver = new ChromeDriver();
		
		 driver.get("https://v1.training-support.net/selenium/javascript-alerts");
		
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("simple")).click();
		 
		 driver.switchTo().alert().accept();
		 
		 Thread.sleep(2000);
		 
         driver.findElement(By.id("confirm")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.switchTo().alert().dismiss();
		 
		 Thread.sleep(2000);
		 
         driver.findElement(By.id("prompt")).click();
		 
		
       
		 //Prompt alert
		 
		 Alert al = driver.switchTo().alert();
		 
		 
		 al.accept();
	 }
}
