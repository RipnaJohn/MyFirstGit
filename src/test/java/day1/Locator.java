package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		driver.findElement(By.name("checkBoxOption1")).click();
		
		driver.findElement(By.className("blinkingText")).click();
		
		
		//driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();

		driver.findElement(By.partialLinkText("Free")).click();
		
		
		
		
	}
	
	

}
