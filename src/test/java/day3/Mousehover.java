package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
	
	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		Actions act = new Actions(driver);
		
		WebElement Sport = driver.findElement(By.linkText("Sports"));
		
		act.moveToElement(Sport).build().perform();
		
		
	}

}
