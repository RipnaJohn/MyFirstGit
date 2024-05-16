package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prct1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		try {
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.ebay.com/");
			
			driver.findElement(By.linkText("Help & Contact")).click();
			
			Thread.sleep(2000);
			driver.navigate().back();
			
			driver.findElement(By.linkText("Daily Deals")).click();
			
			Thread.sleep(2000);
			driver.navigate().back();
			driver.close();
			
		} catch (Exception e) {
			
		}
	}
}
