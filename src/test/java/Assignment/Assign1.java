package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign1 {
	
       public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement electronics = driver.findElement(By.linkText("Electronics")) ;
		
		act.moveToElement(electronics).build().perform();
		
		WebElement fashion = driver.findElement(By.linkText("Fashion"));
		
		act.moveToElement(fashion).build().perform();
		
		WebElement refurbish = driver.findElement(By.linkText("Refurbished"));
		
		act.moveToElement(refurbish).build().perform();
		
		

}
}