package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplecheckbox {
	
	public static void main(String[] args) {
		
			
	        WebDriver driver = new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			
			
			List<WebElement> radiobutton = driver.findElements(By.xpath("//input[@type='radio']"));
			
			for(WebElement radio : radiobutton) {
				
				radio.click();
			}
			
			
			
	}

}
