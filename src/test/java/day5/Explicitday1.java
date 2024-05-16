package day5;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitday1 {
	
	public static void main(String[] args) {
		
		
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(10));
		
		 d.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 
		 wait.until(ExpectedConditions.urlMatches("https://www.rahulshettyacademy.com/AutomationPractice/"));
		 
		 wait.until(ExpectedConditions.titleContains("Practice Page"));
		 
		 d.findElement(By.id("checkBoxOption1")).click();
//		
		
		
		
	}
	
	
}


