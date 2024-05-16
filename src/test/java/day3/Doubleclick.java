package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			
			WebElement doubleclick = driver.findElement(By.className("ui-datepicker-month"));
			
			Actions act = new Actions(driver);
			
			act.doubleClick(doubleclick).build().perform();
	}

}


