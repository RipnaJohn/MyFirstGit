package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
	
public static void main(String[] args) throws InterruptedException{
		
        WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://v1.training-support.net/selenium/nested-iframes");
		
		driver.manage().window().maximize();
		
		WebElement outframe = driver.findElement(By.xpath("//iframe[@src='/selenium/nested-iframe1']"));
		
		driver.switchTo().frame(outframe);
		
		Thread.sleep(2000);
		
		WebElement inframe = driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']"));
		
		driver.switchTo().frame(inframe);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[contains(text(),'Click Me!')])[1]")).click();
		
        WebElement outframe1 = driver.findElement(By.xpath("//iframe[@src='/selenium/nested-iframe1']"));
		
		driver.switchTo().frame(outframe1);
		
		Thread.sleep(2000);
		
        WebElement inframe2 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']"));
		
		driver.switchTo().frame(inframe2);
		
		driver.findElement(By.xpath("(//button[contains(text(),'Click Me!')])[2]")).click();
		
		
}

}
