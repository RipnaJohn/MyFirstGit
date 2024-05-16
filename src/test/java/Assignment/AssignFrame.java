package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignFrame {
	
	
	public static void main(String[] args) throws Exception {
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://demo.automationtesting.in/Frames.html");
		
		 driver.findElement(By.xpath("//a[.='Iframe with in an Iframe']")).click();
		
		
		Thread.sleep(2000);
		
		
        WebElement outframe = driver.findElement(By.xpath("//div[@class='container iframes-page-container']"));
		
		driver.switchTo().frame(outframe);
		
		Thread.sleep(2000);
		
		WebElement inframe1 = driver.findElement(By.xpath("//div[@class='iframe-container']"));
			
		driver.switchTo().frame(inframe1);
			
		Thread.sleep(2000);
		
         WebElement outframe1 = driver.findElement(By.xpath("//div[@class=' nav nav-tabs']"));
		
		driver.switchTo().frame(outframe1);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Single Iframe ']")).click();
		
		
		
	}

}
