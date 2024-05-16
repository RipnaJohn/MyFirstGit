package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heroku1 {
	
public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("RIPNA");
		
		driver.findElement(By.id("password")).sendKeys("Ripna1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
				
			
		
		

}
}