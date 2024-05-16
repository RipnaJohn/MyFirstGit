package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://v1.training-support.net/selenium/drag-drop");
			
			WebElement ball = driver.findElement(By.id("draggable"));
			
			WebElement area = driver.findElement(By.id("dropzone2"));
			
			Actions act = new Actions(driver);
			
			act.dragAndDrop(ball, area).build().perform();
			
			
			
		
	}

}


