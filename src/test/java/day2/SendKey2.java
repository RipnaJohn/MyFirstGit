package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKey2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("ripnajohn@gmail.com");
		
		
		driver.findElement(By.id("pass")).sendKeys("Ripna21");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
