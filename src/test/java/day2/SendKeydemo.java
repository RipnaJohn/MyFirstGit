package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeydemo {
	
public static void main(String[] args) throws InterruptedException {
		
	
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("autocomplete")).sendKeys("This batch is awesome");

             
}
}
