package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(dropdown);
		
		s.selectByIndex(1);
		
		Thread.sleep(2000);
		
		s.selectByValue("option2");
		
		Thread.sleep(2000);
		
		s.selectByVisibleText("Option3");
		
		
		
		
		
	}

}
