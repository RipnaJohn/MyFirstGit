package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		driver.findElement(By.id("autocomplete")).sendKeys("usa");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='United States (USA)' and @class='ui-menu-item-wrapper']")).click();
	}

}
