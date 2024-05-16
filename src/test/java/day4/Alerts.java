package day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	
     public static void main(String[] args) throws InterruptedException{
		
         WebDriver driver = new ChromeDriver();
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("alertBox")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.switchTo().alert().accept();
		 
		 driver.findElement(By.id("confirmBox")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.switchTo().alert().dismiss();
		 
		 driver.findElement(By.xpath("//*[@id='promptBox']")).click();
		 
		 Thread.sleep(2000);
		 
		 //Prompt alert
		 
		 Alert al = driver.switchTo().alert();
		 
		 al.sendKeys("Ripna");
		 
		 al.accept();
		 
     }
		
     
}
