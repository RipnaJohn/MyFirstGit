package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpandDown {
	
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			WebElement username = driver.findElement(By.id("email"));
			
			WebElement password = driver.findElement(By.id("pass"));
			
			Actions act = new Actions(driver);
			
			//using keyboard actions using action class
			
			
			act.keyDown(username,Keys.SHIFT).sendKeys("Ripna").keyUp(username,Keys.SHIFT).build().perform();
			
			
			act.keyDown(password,Keys.SHIFT).sendKeys("password").keyUp(password,Keys.SHIFT).build().perform();
			
			
			
			for(int i=0;i<8;i++){
			
			act.keyDown(password,Keys.BACK_SPACE).keyUp(password,Keys.BACK_SPACE).build().perform();
			}
}
}
